# Java Object-Oriented Programming 🏗️

Master the core concepts of OOP in Java.

## Four Pillars of OOP

### 1. Encapsulation
- Bundle data and methods together
- Hide internal details (private)
- Provide public interface (getters/setters)

### 2. Inheritance
- Create hierarchies of classes
- Reuse code through IS-A relationship
- Override methods in child classes

### 3. Polymorphism
- Same method name, different behavior
- Method overloading (compile-time)
- Method overriding (runtime)

### 4. Abstraction
- Hide complex details
- Show only essential features
- Use abstract classes and interfaces

## Class Structure

```java
public class ClassName {
    private String attribute1;
    protected int attribute2;
    
    public ClassName(String attr1) {
        this.attribute1 = attr1;
    }
    
    public String getAttribute1() {
        return attribute1;
    }
}
```

## Access Modifiers

| Modifier | Visibility |
|----------|------------|
| public | Everywhere |
| protected | Package + Subclasses |
| default | Package only |
| private | Class only |

## Inheritance

```java
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}
```

## Practice Exercises

1. Create a Vehicle class and Car, Bike subclasses
2. Create a Bank Account hierarchy
3. Implement an Employee management system
4. Create a shape hierarchy

## Running Programs

```bash
cd java/4_ObjectOrientedProgramming
javac Classes.java
java Classes
```

## Next Steps

Explore **Collections** to learn about data structures!