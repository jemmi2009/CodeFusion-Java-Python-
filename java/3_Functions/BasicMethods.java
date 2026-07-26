/**
 * BasicMethods.java
 * Part of CodeFusion - Learning Java Functions & Methods
 * 
 * Demonstrates:
 * ✅ Method declaration and calling
 * ✅ Method parameters and arguments
 * ✅ Return types and values
 * ✅ Variable length arguments (varargs)
 * ✅ Recursion patterns
 * 
 * @author CodeFusion Team
 * @version 1.0
 * @since 2024
 */

public class BasicMethods {
    
    /**
     * Prints a welcome message.
     */
    public static void printWelcome() {
        System.out.println("🚀 Welcome to Code Fusion!");
    }
    
    /**
     * Greets a person by name.
     * 
     * @param name The person's name
     */
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! 👋");
    }
    
    /**
     * Adds two integers.
     * 
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Calculates the area of a rectangle.
     * 
     * @param base The base of the rectangle
     * @param height The height of the rectangle
     * @return Area = base × height
     */
    public static double calculateArea(double base, double height) {
        return base * height;
    }
    
    /**
     * Sums any number of integer arguments using varargs.
     * 
     * @param numbers Variable number of integers
     * @return Sum of all provided numbers
     */
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    /**
     * Calculates factorial recursively.
     * 
     * @param n The number to calculate factorial for
     * @return n! (factorial of n)
     * @throws IllegalArgumentException if n < 0
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    /**
     * Main method - Entry point for demonstrations.
     * 
     * @param args Command line arguments (unused)
     */
    public static void main(String[] args) {
        // Test basic methods
        printWelcome();
        
        // Test greet method
        greet("Alice");
        
        // Test addition
        System.out.println("10 + 20 = " + add(10, 20));
        
        // Test area calculation
        System.out.println("Area: " + calculateArea(5, 10));
        
        // Test varargs
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));
        
        // Test recursion
        System.out.println("5! = " + factorial(5));
    }
}
