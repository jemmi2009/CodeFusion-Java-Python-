# Python Object-Oriented Programming 🏗️

Master OOP concepts in Python.

## Four Pillars of OOP

### 1. Encapsulation
Bundle data and methods; use private attributes with underscore

### 2. Inheritance
Create class hierarchies with `extends`

### 3. Polymorphism
Override methods in subclasses

### 4. Abstraction
Hide implementation details, show only interface

## Class Definition

```python
class ClassName:
    def __init__(self, param1, param2):
        self.param1 = param1
        self.param2 = param2
    
    def method(self):
        return self.param1 + self.param2
```

## Inheritance

```python
class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)
        self.breed = breed
```

## Magic Methods

```python
__init__()      # Constructor
__str__()       # String representation
__repr__()      # Official representation
__len__()       # Length
__add__()       # Addition operator
```

## Running Programs

```bash
cd python/4_ObjectOrientedProgramming
python classes.py
python inheritance.py
```

## Practice Exercises

1. Create Vehicle and Car classes
2. Implement a Bank Account hierarchy
3. Create a Shape hierarchy
4. Use abstract base classes

## Next Steps

Explore **Collections** to learn about data structures!