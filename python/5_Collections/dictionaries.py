#!/usr/bin/env python3
"""
dictionaries.py
Demonstrates Dictionary operations in Python
"""

print("=== Dictionaries in Python ===")
print()

# Create dictionary
student = {
    "name": "Alice",
    "age": 20,
    "gpa": 3.8,
    "courses": ["Python", "Java", "C++"]
}
print(f"Student: {student}")
print()

# Access values
print("--- Access Values ---")
print(f"Name: {student['name']}")
print(f"Age: {student.get('age')}")
print(f"Unknown: {student.get('unknown', 'N/A')}")
print()

# Add/Update
print("--- Add/Update ---")
student['city'] = "New York"
student['age'] = 21
print(f"After update: {student}")
print()

# Remove
print("--- Remove ---")
del student['city']
print(f"After delete: {student}")
print()

# Keys and values
print("--- Keys and Values ---")
print(f"Keys: {list(student.keys())}")
print(f"Values: {list(student.values())}")
print()

# Iteration
print("--- Iterate ---")
for key, value in student.items():
    print(f"{key}: {value}")
print()

# Student marks
print("--- Student Marks ---")
marks = {"Alice": 95, "Bob": 87, "Charlie": 92}
for name, mark in marks.items():
    print(f"{name}: {mark}")
