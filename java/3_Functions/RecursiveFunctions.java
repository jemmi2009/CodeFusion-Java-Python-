/**
 * RecursiveFunctions.java
 * Demonstrates recursive functions: Factorial, Fibonacci, Power
 */

public class RecursiveFunctions {
    
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
    
    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Recursive Functions ===");
        System.out.println("5! = " + factorial(5));
        System.out.println("Fib(10) = " + fibonacci(10));
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("Sum of digits of 12345: " + sumOfDigits(12345));
    }
}