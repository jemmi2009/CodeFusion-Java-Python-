#!/usr/bin/env python3
"""
basic_decorators.py
Demonstrates basic decorator patterns in Python

Author: Code Fusion
Version: 1.0
"""

from functools import wraps

# ============== Simple Decorator ==============

def simple_decorator(func):
    """A simple decorator that adds text before and after function execution."""
    def wrapper():
        print("[BEFORE] About to call the function")
        func()
        print("[AFTER] Function execution completed\n")
    return wrapper

@simple_decorator
def say_hello():
    print("Hello, World!")


# ============== Decorator with Arguments ==============

def decorator_with_args(func):
    """A decorator that handles function arguments."""
    @wraps(func)  # Preserves function metadata
    def wrapper(*args, **kwargs):
        print(f"[CALLING] {func.__name__} with args={args}, kwargs={kwargs}")
        result = func(*args, **kwargs)
        print(f"[RESULT] {result}\n")
        return result
    return wrapper

@decorator_with_args
def add(a, b):
    """Add two numbers."""
    return a + b

@decorator_with_args
def greet(name, greeting="Hello"):
    """Greet a person."""
    return f"{greeting}, {name}!"


# ============== Repeat Decorator ==============

def repeat(times):
    """Decorator that repeats function execution."""
    def decorator(func):
        @wraps(func)
        def wrapper(*args, **kwargs):
            results = []
            for i in range(times):
                print(f"[ITERATION {i+1}]", end=" ")
                result = func(*args, **kwargs)
                results.append(result)
            print()  # Newline
            return results
        return wrapper
    return decorator

@repeat(times=3)
def print_message(msg):
    """Print a message."""
    print(msg, end=" | ")
    return msg


# ============== Counter Decorator ==============

def count_calls(func):
    """Decorator that counts how many times a function is called."""
    call_count = 0
    
    @wraps(func)
    def wrapper(*args, **kwargs):
        nonlocal call_count
        call_count += 1
        print(f"[CALL #{call_count}] Executing {func.__name__}")
        return func(*args, **kwargs)
    
    wrapper.call_count = lambda: call_count
    return wrapper

@count_calls
def multiply(a, b):
    """Multiply two numbers."""
    return a * b


# ============== Type Hint Decorator ==============

def print_type_info(func):
    """Decorator that prints argument types."""
    @wraps(func)
    def wrapper(*args, **kwargs):
        print(f"[TYPES] args: {[type(arg).__name__ for arg in args]}")
        print(f"[TYPES] kwargs: {[(k, type(v).__name__) for k, v in kwargs.items()]}")
        return func(*args, **kwargs)
    return wrapper

@print_type_info
def process_data(data, flag=True):
    """Process some data."""
    return f"Processed: {data}, Flag: {flag}"


if __name__ == "__main__":
    print("="*50)
    print("BASIC DECORATORS IN PYTHON")
    print("="*50)
    print()
    
    # Test 1: Simple Decorator
    print("TEST 1: Simple Decorator")
    print("-" * 50)
    say_hello()
    
    # Test 2: Decorator with Arguments
    print("TEST 2: Decorator with Arguments")
    print("-" * 50)
    result = add(5, 10)
    result = greet("Alice", greeting="Hi")
    
    # Test 3: Repeat Decorator
    print("TEST 3: Repeat Decorator")
    print("-" * 50)
    print_message("Executing")
    print()
    
    # Test 4: Count Calls
    print("TEST 4: Count Calls Decorator")
    print("-" * 50)
    print(f"Result: {multiply(3, 4)}")
    print(f"Result: {multiply(5, 6)}")
    print(f"Result: {multiply(7, 8)}")
    print(f"Total calls: {multiply.call_count()}")
    print()
    
    # Test 5: Type Info
    print("TEST 5: Type Info Decorator")
    print("-" * 50)
    result = process_data([1, 2, 3], flag=False)
    print(f"Result: {result}")
    print()
