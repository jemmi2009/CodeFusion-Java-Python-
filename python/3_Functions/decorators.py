#!/usr/bin/env python3
"""
decorators.py
Demonstrates decorators in Python

Author: Code Fusion
Version: 1.0
"""

import time
from functools import wraps

# Simple decorator
def my_decorator(func):
    def wrapper():
        print("Something before the function")
        func()
        print("Something after the function")
    return wrapper

@my_decorator
def say_hello():
    print("Hello!")

print("=== Simple Decorator ===")
say_hello()
print()

# Decorator with arguments
def repeat(times):
    def decorator(func):
        @wraps(func)
        def wrapper(*args, **kwargs):
            for _ in range(times):
                func(*args, **kwargs)
        return wrapper
    return decorator

@repeat(times=3)
def greet(name):
    print(f"Hello, {name}!")

print("=== Decorator with Arguments ===")
greet("Alice")
print()

# Timer decorator
def timer(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"Execution time: {end - start:.4f} seconds")
        return result
    return wrapper

@timer
def slow_function():
    time.sleep(1)
    print("Function completed")

print("=== Timer Decorator ===")
slow_function()
print()

# Validation decorator
def validate_positive(func):
    @wraps(func)
    def wrapper(x):
        if x < 0:
            print(f"Error: {x} is not positive")
            return None
        return func(x)
    return wrapper

@validate_positive
def square_root(x):
    return x ** 0.5

print("=== Validation Decorator ===")
print(f"sqrt(16) = {square_root(16)}")
print(f"sqrt(-4): {square_root(-4)}")
