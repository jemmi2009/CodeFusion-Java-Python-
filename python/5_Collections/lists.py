#!/usr/bin/env python3
"""
lists.py
Demonstrates List operations in Python
"""

print("=== Lists in Python ===")
print()

# Create lists
fruits = ["Apple", "Banana", "Orange", "Mango"]
print(f"Fruits: {fruits}")
print()

# Access elements
print("--- Access Elements ---")
print(f"First: {fruits[0]}")
print(f"Last: {fruits[-1]}")
print(f"Slice [1:3]: {fruits[1:3]}")
print()

# Add elements
print("--- Add Elements ---")
fruits.append("Grapes")
print(f"After append: {fruits}")
fruits.insert(1, "Pineapple")
print(f"After insert: {fruits}")
print()

# Remove elements
print("--- Remove Elements ---")
fruits.remove("Pineapple")
print(f"After remove: {fruits}")
popped = fruits.pop()
print(f"Popped: {popped}, List: {fruits}")
print()

# List operations
print("--- List Operations ---")
print(f"Length: {len(fruits)}")
print(f"Contains 'Banana'? {'Banana' in fruits}")
print(f"Count 'Apple': {fruits.count('Apple')}")
print()

# Sorting
print("--- Sorting ---")
numbers = [50, 30, 70, 20, 40]
print(f"Original: {numbers}")
print(f"Sorted: {sorted(numbers)}")
numbers.sort()
print(f"Sort in-place: {numbers}")
print()

# List comprehension
print("--- List Comprehension ---")
squares = [x**2 for x in range(1, 6)]
print(f"Squares: {squares}")
evens = [x for x in range(1, 11) if x % 2 == 0]
print(f"Even numbers: {evens}")
