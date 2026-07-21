#!/usr/bin/env python3
"""
lambda_functions.py
Demonstrates lambda functions and anonymous functions in Python

Author: Code Fusion
Version: 1.0
"""

# Basic lambda function
square = lambda x: x ** 2
print(f"Square of 5: {square(5)}")

# Lambda with multiple parameters
add = lambda x, y: x + y
print(f"10 + 20 = {add(10, 20)}")

# Lambda with conditional
is_adult = lambda age: "Adult" if age >= 18 else "Minor"
print(f"Age 25: {is_adult(25)}")

# Using lambda with map()
numbers = [1, 2, 3, 4, 5]
squared = list(map(lambda x: x ** 2, numbers))
print(f"Squared numbers: {squared}")

# Using lambda with filter()
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(f"Even numbers: {even_numbers}")

# Using lambda with sorted()
students = [("Alice", 85), ("Bob", 75), ("Charlie", 90)]
sorted_students = sorted(students, key=lambda x: x[1], reverse=True)
print(f"Students by score: {sorted_students}")

# List comprehension vs Lambda
print("\n=== List Comprehension vs Lambda ===")
traditional = list(map(lambda x: x * 2, [1, 2, 3, 4, 5]))
comprehension = [x * 2 for x in [1, 2, 3, 4, 5]]
print(f"Lambda approach: {traditional}")
print(f"Comprehension: {comprehension}")
