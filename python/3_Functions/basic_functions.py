#!/usr/bin/env python3
"""
basic_functions.py
Demonstrates basic function concepts in Python

Author: Code Fusion
Version: 1.0
"""

def greet(name):
    """Greet a person by name."""
    print(f"Hello, {name}! 👋")

def add(a, b):
    """Add two numbers and return the result."""
    return a + b

def calculate_area(base, height):
    """Calculate area of a rectangle."""
    return base * height

def sum_all(*numbers):
    """Sum any number of arguments."""
    return sum(numbers)

def factorial(n):
    """Calculate factorial recursively."""
    if n <= 1:
        return 1
    return n * factorial(n - 1)

def is_even(num):
    """Check if a number is even."""
    return num % 2 == 0

def celsius_to_fahrenheit(celsius):
    """Convert Celsius to Fahrenheit."""
    return (celsius * 9/5) + 32

if __name__ == "__main__":
    print("=== Basic Functions in Python ===")
    print()
    
    greet("Alice")
    greet("Bob")
    print()
    
    print(f"10 + 20 = {add(10, 20)}")
    print(f"Area: {calculate_area(5, 10)}")
    print(f"Sum: {sum_all(1, 2, 3, 4, 5)}")
    print(f"5! = {factorial(5)}")
    print(f"Is 10 even? {is_even(10)}")
    print(f"0°C = {celsius_to_fahrenheit(0)}°F")
