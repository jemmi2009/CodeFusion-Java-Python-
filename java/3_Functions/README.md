# Java Functions & Methods 📝

Learn how to create and use reusable code with methods.

## Topics Covered

1. **BasicMethods.java** - Method basics and parameters
2. **MethodOverloading.java** - Method overloading
3. **RecursiveFunctions.java** - Recursive methods

## Method Syntax

```java
[access_modifier] [static] return_type methodName(parameters) {
    // Method body
}
```

## Method Overloading

Create multiple methods with the same name but different parameters:

```java
public static int add(int a, int b) { return a + b; }
public static double add(double a, double b) { return a + b; }
public static int add(int a, int b, int c) { return a + b + c; }
```

## Recursion

A method calling itself until a base case is reached.

```java
public static int factorial(int n) {
    if (n <= 1) return 1;           // Base case
    return n * factorial(n - 1);    // Recursive case
}
```

## Running the Programs

```bash
cd java/3_Functions
javac BasicMethods.java
java BasicMethods
```

## Practice Exercises

1. Create a method to check if a number is prime
2. Create a method to reverse a string
3. Overload a multiply method for int and double
4. Write recursive method for power calculation

## Next Steps

Move to **Object-Oriented Programming** to learn about classes and objects!
