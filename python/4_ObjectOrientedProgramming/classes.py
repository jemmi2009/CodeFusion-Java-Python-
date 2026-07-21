#!/usr/bin/env python3
"""
classes.py
Demonstrates class definition in Python

Author: Code Fusion
Version: 1.0
"""

class Person:
    """Represents a person with name, age, and email."""
    
    def __init__(self, name, age, email=None):
        """Initialize a Person object."""
        self.name = name
        self.age = age
        self.email = email
    
    def display_info(self):
        """Display person information."""
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Email: {self.email}")
    
    def is_adult(self):
        """Check if person is an adult."""
        return self.age >= 18
    
    def __str__(self):
        """Return string representation."""
        return f"Person(name='{self.name}', age={self.age})"
    
    def __repr__(self):
        """Return detailed representation."""
        return f"Person('{self.name}', {self.age}, '{self.email}')"

class Student(Person):
    """Represents a student, extends Person."""
    
    def __init__(self, name, age, student_id, gpa):
        super().__init__(name, age)
        self.student_id = student_id
        self.gpa = gpa
    
    def display_info(self):
        super().display_info()
        print(f"Student ID: {self.student_id}")
        print(f"GPA: {self.gpa}")
    
    def has_high_gpa(self):
        return self.gpa >= 3.5

if __name__ == "__main__":
    print("=== Classes in Python ===")
    print()
    
    p1 = Person("Alice", 28, "alice@email.com")
    p1.display_info()
    print(f"Is adult? {p1.is_adult()}")
    print(f"String representation: {p1}")
    print()
    
    student = Student("Bob", 20, "STU001", 3.8)
    student.display_info()
    print(f"High GPA? {student.has_high_gpa()}")
