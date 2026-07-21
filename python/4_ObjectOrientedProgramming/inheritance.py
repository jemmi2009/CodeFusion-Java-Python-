#!/usr/bin/env python3
"""
inheritance.py
Demonstrates inheritance in Python

Author: Code Fusion
Version: 1.0
"""

class Animal:
    """Base class for animals."""
    
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def eat(self):
        print(f"{self.name} is eating.")
    
    def sleep(self):
        print(f"{self.name} is sleeping.")

class Dog(Animal):
    """Dog class inherits from Animal."""
    
    def __init__(self, name, age, breed):
        super().__init__(name, age)
        self.breed = breed
    
    def eat(self):
        print(f"{self.name} is eating dog food.")
    
    def bark(self):
        print(f"{self.name} is barking: Woof! Woof!")
    
    def __str__(self):
        return f"Dog(name='{self.name}', breed='{self.breed}')"

class Cat(Animal):
    """Cat class inherits from Animal."""
    
    def eat(self):
        print(f"{self.name} is eating cat food.")
    
    def meow(self):
        print(f"{self.name} is meowing: Meow!")

if __name__ == "__main__":
    print("=== Inheritance in Python ===")
    print()
    
    dog = Dog("Buddy", 5, "Golden Retriever")
    dog.eat()
    dog.bark()
    dog.sleep()
    print()
    
    cat = Cat("Whiskers", 3)
    cat.eat()
    cat.meow()
    cat.sleep()
    print()
    
    # Polymorphism
    print("=== Polymorphism ===")
    animals = [dog, cat]
    for animal in animals:
        animal.eat()
