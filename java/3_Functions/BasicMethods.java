/**
 * BasicMethods.java
 * 
 * Demonstrates basic method/function concepts in Java:
 * - Method declaration and calling
 * - Method parameters and arguments
 * - Return types and values
 * - Variable length arguments (varargs)
 * 
 * @author Code Fusion
 * @version 1.0
 */

public class BasicMethods {
    
    public static void printWelcome() {
        System.out.println("🚀 Welcome to Code Fusion!");
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! 👋");
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double calculateArea(double base, double height) {
        return base * height;
    }
    
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        printWelcome();
        greet("Alice");
        System.out.println("10 + 20 = " + add(10, 20));
        System.out.println("Area: " + calculateArea(5, 10));
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));
        System.out.println("5! = " + factorial(5));
    }
}