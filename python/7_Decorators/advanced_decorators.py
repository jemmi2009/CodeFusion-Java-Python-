#!/usr/bin/env python3
"""
advanced_decorators.py
Practical decorator patterns: timing, logging, validation, caching

Author: Code Fusion
Version: 1.0
"""

import time
from functools import wraps


# ============== Timer Decorator ==============

def timer(func):
    """Measures and prints function execution time."""
    @wraps(func)
    def wrapper(*args, **kwargs):
        start_time = time.time()
        result = func(*args, **kwargs)
        end_time = time.time()
        elapsed = end_time - start_time
        print(f"⏱️  {func.__name__} took {elapsed:.4f} seconds")
        return result
    return wrapper


# ============== Logger Decorator ==============

def logger(func):
    """Logs function calls with arguments and return values."""
    @wraps(func)
    def wrapper(*args, **kwargs):
        args_repr = [repr(a) for a in args]
        kwargs_repr = [f"{k}={v!r}" for k, v in kwargs.items()]
        signature = ", ".join(args_repr + kwargs_repr)
        print(f"📝 Calling {func.__name__}({signature})")
        
        result = func(*args, **kwargs)
        
        print(f"📝 {func.__name__} returned {result!r}")
        return result
    return wrapper


# ============== Validation Decorator ==============

def validate_positive(func):
    """Validates that all numeric arguments are positive."""
    @wraps(func)
    def wrapper(x):
        if not isinstance(x, (int, float)):
            raise TypeError(f"Expected number, got {type(x).__name__}")
        if x < 0:
            raise ValueError(f"Expected positive number, got {x}")
        return func(x)
    return wrapper


# ============== Caching/Memoization Decorator ==============

def cache(func):
    """Caches function results to avoid redundant computations."""
    cached_results = {}
    
    @wraps(func)
    def wrapper(n):
        if n not in cached_results:
            print(f"💾 Computing {func.__name__}({n})...")
            cached_results[n] = func(n)
        else:
            print(f"⚡ Using cached result for {func.__name__}({n})")
        return cached_results[n]
    
    wrapper.cache = cached_results
    return wrapper


# ============== Retry Decorator ==============

def retry(max_attempts=3, delay=1):
    """Retries function execution on failure."""
    def decorator(func):
        @wraps(func)
        def wrapper(*args, **kwargs):
            attempts = 0
            while attempts < max_attempts:
                try:
                    return func(*args, **kwargs)
                except Exception as e:
                    attempts += 1
                    if attempts >= max_attempts:
                        print(f"❌ Failed after {max_attempts} attempts")
                        raise
                    print(f"⚠️  Attempt {attempts} failed: {e}. Retrying in {delay}s...")
                    time.sleep(delay)
        return wrapper
    return decorator


# ============== Access Control Decorator ==============

def require_admin(func):
    """Restricts function access to admin users."""
    @wraps(func)
    def wrapper(user_role, *args, **kwargs):
        if user_role != "admin":
            raise PermissionError(f"Access denied for role: {user_role}")
        print(f"✅ Admin access granted for {func.__name__}")
        return func(*args, **kwargs)
    return wrapper


# ============== Example Functions ==============

@timer
@logger
def fibonacci(n):
    """Calculate Fibonacci number (with caching in separate example)."""
    if n < 2:
        return n
    return fibonacci.__wrapped__(n - 1) + fibonacci.__wrapped__(n - 2)


@cache
@validate_positive
def sqrt_approx(x):
    """Approximate square root using Newton's method."""
    result = x
    for _ in range(10):
        result = (result + x / result) / 2
    return result


attempt_count = 0

@retry(max_attempts=3, delay=0.5)
def unstable_function():
    """A function that fails on first two attempts."""
    global attempt_count
    attempt_count += 1
    if attempt_count < 3:
        raise RuntimeError(f"Simulated failure #{attempt_count}")
    return "Success!"


@require_admin
def delete_user(user_id):
    """Delete a user (admin only)."""
    return f"User {user_id} deleted successfully"


if __name__ == "__main__":
    print("="*60)
    print("ADVANCED DECORATORS - PRACTICAL PATTERNS")
    print("="*60)
    print()
    
    # Test 1: Timer and Logger
    print("TEST 1: Timer and Logger Decorators")
    print("-" * 60)
    result = fibonacci(5)
    print(f"Result: {result}")
    print()
    
    # Test 2: Validation and Caching
    print("TEST 2: Validation and Caching Decorators")
    print("-" * 60)
    print(f"sqrt(16) = {sqrt_approx(16)}")
    print(f"sqrt(16) = {sqrt_approx(16)}")
    print(f"sqrt(25) = {sqrt_approx(25)}")
    print(f"sqrt(25) = {sqrt_approx(25)}")
    print(f"Cache contents: {sqrt_approx.cache}")
    print()
    
    # Test 3: Validation Error
    print("TEST 3: Validation Error")
    print("-" * 60)
    try:
        sqrt_approx(-5)
    except ValueError as e:
        print(f"❌ Caught error: {e}")
    print()
    
    # Test 4: Retry Decorator
    print("TEST 4: Retry Decorator")
    print("-" * 60)
    attempt_count = 0
    result = unstable_function()
    print(f"Result: {result}")
    print()
    
    # Test 5: Access Control
    print("TEST 5: Access Control Decorator")
    print("-" * 60)
    try:
        delete_user("guest", 123)
    except PermissionError as e:
        print(f"❌ {e}")
    
    result = delete_user("admin", 123)
    print(f"✅ {result}")
    print()
