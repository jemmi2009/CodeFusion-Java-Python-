#!/usr/bin/env python3
"""
tuples.py
Demonstrates Tuple operations in Python
"""

print("=== Tuples in Python ===")
print()

# Create tuples
point = (10, 20)
student = ("Alice", 20, "NYC")
print(f"Point: {point}")
print(f"Student: {student}")
print()

# Access elements
print("--- Access Elements ---")
print(f"First coordinate: {point[0]}")
print(f"Student name: {student[0]}")
print(f"Slice [1:3]: {student[1:3]}")
print()

# Immutability
print("--- Immutability ---")
try:
    point[0] = 15  # This will raise error
except TypeError as e:
    print(f"Error: {e}")
print()

# Unpacking
print("--- Unpacking ---")
x, y = point
print(f"x={x}, y={y}")
name, age, city = student
print(f"Name: {name}, Age: {age}, City: {city}")
print()

# Tuple operations
print("--- Tuple Operations ---")
numbers = (1, 2, 3, 4, 5)
print(f"Length: {len(numbers)}")
print(f"Count 3: {numbers.count(3)}")
print(f"Index of 4: {numbers.index(4)}")
print(f"Reversed: {tuple(reversed(numbers))}")
print()

# Nested tuples
print("--- Nested Tuples ---")
matrix = ((1, 2, 3), (4, 5, 6), (7, 8, 9))
print(f"Matrix: {matrix}")
print(f"Element [1][2]: {matrix[1][2]}")
