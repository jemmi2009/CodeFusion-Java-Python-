# Python Decorators 🎨

Learn about Python decorators - a powerful feature for wrapping and enhancing functions and methods.

## Topics Covered

1. **basic_decorators.py** - Simple function decorators
2. **decorators_with_args.py** - Decorators that accept arguments
3. **class_decorators.py** - Decorators for classes
4. **advanced_decorators.py** - Practical decorator patterns (timing, logging, validation)

## What are Python Decorators?

A decorator is a function that takes another function or class as input and extends its behavior without permanently modifying it. It's "syntactic sugar" for wrapping functions.

## Basic Syntax

```python
def my_decorator(func):
    def wrapper(*args, **kwargs):
        print("Before function call")
        result = func(*args, **kwargs)
        print("After function call")
        return result
    return wrapper

@my_decorator
def say_hello(name):
    print(f"Hello, {name}!")

say_hello("Alice")
# Output:
# Before function call
# Hello, Alice!
# After function call
```

## Key Concepts

### 1. **Simple Decorator**
```python
def simple_decorator(func):
    def wrapper():
        print("Do something before")
        func()
        print("Do something after")
    return wrapper
```

### 2. **Decorator with Arguments**
```python
def repeat(times):
    def decorator(func):
        def wrapper(*args, **kwargs):
            for _ in range(times):
                func(*args, **kwargs)
        return wrapper
    return decorator

@repeat(times=3)
def greet(name):
    print(f"Hello, {name}!")
```

### 3. **Using functools.wraps**
```python
from functools import wraps

def my_decorator(func):
    @wraps(func)  # Preserves original function metadata
    def wrapper(*args, **kwargs):
        return func(*args, **kwargs)
    return wrapper
```

### 4. **Class Decorator**
```python
def add_repr(cls):
    def __repr__(self):
        return f"{cls.__name__}(...)"
    cls.__repr__ = __repr__
    return cls

@add_repr
class MyClass:
    pass
```

## Common Decorator Patterns

### Timer Decorator
```python
def timer(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        import time
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"Execution time: {end - start:.4f}s")
        return result
    return wrapper
```

### Logger Decorator
```python
def logger(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        print(f"Calling {func.__name__} with args={args}, kwargs={kwargs}")
        result = func(*args, **kwargs)
        print(f"Returned {result}")
        return result
    return wrapper
```

### Validation Decorator
```python
def validate_positive(func):
    @wraps(func)
    def wrapper(x):
        if x < 0:
            raise ValueError(f"Expected positive number, got {x}")
        return func(x)
    return wrapper
```

### Caching Decorator
```python
def cache(func):
    cached = {}
    @wraps(func)
    def wrapper(arg):
        if arg not in cached:
            cached[arg] = func(arg)
        return cached[arg]
    return wrapper

@cache
def fibonacci(n):
    if n < 2:
        return n
    return fibonacci(n-1) + fibonacci(n-2)
```

## Stacking Decorators

```python
@decorator_a
@decorator_b
@decorator_c
def my_function():
    pass

# Equivalent to:
my_function = decorator_a(decorator_b(decorator_c(my_function)))
```

## Running the Programs

```bash
cd python/7_Decorators
python basic_decorators.py
python decorators_with_args.py
python class_decorators.py
python advanced_decorators.py
```

## Practice Exercises

1. Create a `retry` decorator that retries a function on failure
2. Build a `rate_limit` decorator to limit function calls
3. Implement a `type_check` decorator for parameter validation
4. Create a `deprecated` decorator to warn about old functions
5. Build a `singleton` decorator for classes

## When to Use Decorators

✅ **Good Use Cases:**
- Logging and monitoring
- Performance measurement (timing)
- Input validation
- Caching/memoization
- Authentication and authorization
- Retry logic

❌ **Avoid:**
- Overly complex decorator chains
- Performance-critical inner loops
- When a regular function would be simpler

## Next Steps

Explore **Context Managers** for resource handling or learn about **Metaclasses** for advanced Python!
