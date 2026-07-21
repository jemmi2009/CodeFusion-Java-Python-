# Python Functions 📝

Learn how to create and use reusable code with functions.

## Topics Covered

1. **basic_functions.py** - Function basics
2. **lambda_functions.py** - Anonymous functions
3. **decorators.py** - Function decorators

## Function Definition

```python
def function_name(parameters):
    """Docstring."""
    # Function body
    return result
```

## Lambda Functions

Anonymous functions for simple operations:

```python
square = lambda x: x ** 2
add = lambda x, y: x + y
```

## Decorators

Wrap functions to modify their behavior:

```python
def my_decorator(func):
    def wrapper(*args, **kwargs):
        # Before function
        result = func(*args, **kwargs)
        # After function
        return result
    return wrapper

@my_decorator
def my_function():
    pass
```

## Map, Filter, Reduce

```python
# Map - apply function to each item
result = map(lambda x: x ** 2, [1, 2, 3])

# Filter - select items that match condition
even = filter(lambda x: x % 2 == 0, [1, 2, 3, 4])

# List comprehension (preferred)
squares = [x ** 2 for x in [1, 2, 3]]
evens = [x for x in [1, 2, 3, 4] if x % 2 == 0]
```

## Running Programs

```bash
cd python/3_Functions
python basic_functions.py
python lambda_functions.py
python decorators.py
```

## Practice Exercises

1. Create a function to check if a number is prime
2. Create a decorator to count function calls
3. Use map() and filter() with lambda
4. Write a decorator to log function execution

## Next Steps

Move to **Object-Oriented Programming** to learn about classes!