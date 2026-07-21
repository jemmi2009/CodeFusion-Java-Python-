#!/usr/bin/env python3
"""
sets.py
Demonstrates Set operations in Python
"""

print("=== Sets in Python ===")
print()

# Create sets
colors = {"Red", "Blue", "Green", "Red"}  # Duplicate ignored
print(f"Colors: {colors}")
print(f"Size: {len(colors)}")
print()

# Add and remove
print("--- Add/Remove ---")
colors.add("Yellow")
print(f"After add: {colors}")
colors.remove("Blue")
print(f"After remove: {colors}")
print()

# Check membership
print("--- Membership ---")
print(f"'Red' in colors? {'Red' in colors}")
print(f"'Purple' in colors? {'Purple' in colors}")
print()

# Set operations
print("--- Set Operations ---")
set1 = {1, 2, 3, 4}
set2 = {3, 4, 5, 6}
print(f"Set1: {set1}")
print(f"Set2: {set2}")
print(f"Union: {set1 | set2}")
print(f"Intersection: {set1 & set2}")
print(f"Difference: {set1 - set2}")
print()

# Remove duplicates
print("--- Remove Duplicates ---")
nums = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
unique = list(set(nums))
print(f"Original: {nums}")
print(f"Unique: {unique}")
