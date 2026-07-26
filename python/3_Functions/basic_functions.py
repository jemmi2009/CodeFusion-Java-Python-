#!/usr/bin/env python3
"""
basic_functions.py - CodeFusion: Basic Function Concepts

This module demonstrates fundamental Python function concepts:
✅ Function definition and calling
✅ Parameters and arguments
✅ Return values and types
✅ Variable arguments (*args)
✅ Recursion patterns
✅ Type hints and docstrings

Author: CodeFusion Team
Version: 1.0
"""

from typing import Union


def greet(name: str) -> None:
    """
    Greet a person by name.
    
    Args:
        name (str): The person's name
    
    Returns:
        None
    """
    print(f"Hello, {name}! 👋")


def add(a: Union[int, float], b: Union[int, float]) -> Union[int, float]:
    """
    Add two numbers and return the result.
    
    Args:
        a: First number (int or float)
        b: Second number (int or float)
    
    Returns:
        Sum of a and b
    
    Example:
        >>> add(10, 20)
        30
    """
    return a + b


def calculate_area(base: float, height: float) -> float:
    """
    Calculate the area of a rectangle.
    
    Args:
        base (float): The base of the rectangle
        height (float): The height of the rectangle
    
    Returns:
        float: Area = base × height
    """
    return base * height


def sum_all(*numbers: Union[int, float]) -> Union[int, float]:
    """
    Sum any number of arguments.
    
    Args:
        *numbers: Variable number of integers or floats
    
    Returns:
        Sum of all provided numbers
    
    Example:
        >>> sum_all(1, 2, 3, 4, 5)
        15
    """
    return sum(numbers)


def factorial(n: int) -> int:
    """
    Calculate factorial recursively.
    
    Args:
        n (int): The number to calculate factorial for
    
    Returns:
        int: n! (factorial of n)
    
    Raises:
        ValueError: If n is negative
    
    Example:
        >>> factorial(5)
        120
    """
    if n < 0:
        raise ValueError("Factorial not defined for negative numbers")
    
    if n <= 1:
        return 1
    
    return n * factorial(n - 1)


def is_even(num: int) -> bool:
    """
    Check if a number is even.
    
    Args:
        num (int): The number to check
    
    Returns:
        bool: True if even, False if odd
    """
    return num % 2 == 0


def celsius_to_fahrenheit(celsius: float) -> float:
    """
    Convert Celsius to Fahrenheit.
    
    Args:
        celsius (float): Temperature in Celsius
    
    Returns:
        float: Temperature in Fahrenheit
    
    Formula:
        F = (C × 9/5) + 32
    """
    return (celsius * 9 / 5) + 32


if __name__ == "__main__":
    print("=== Basic Functions in Python ===\n")
    
    # Demonstrate greet function
    greet("Alice")
    greet("Bob")
    print()
    
    # Demonstrate addition
    print(f"10 + 20 = {add(10, 20)}")
    
    # Demonstrate area calculation
    print(f"Area: {calculate_area(5, 10)}")
    
    # Demonstrate varargs
    print(f"Sum: {sum_all(1, 2, 3, 4, 5)}")
    
    # Demonstrate recursion
    print(f"5! = {factorial(5)}")
    
    # Demonstrate is_even
    print(f"Is 10 even? {is_even(10)}")
    
    # Demonstrate conversion
    print(f"0°C = {celsius_to_fahrenheit(0)}°F")
