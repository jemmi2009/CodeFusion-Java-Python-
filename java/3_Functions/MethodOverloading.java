/**
 * MethodOverloading.java
 * Demonstrates method overloading with different parameter types
 */

public class MethodOverloading {
    
    public static int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    
    public static double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    
    public static String add(String a, String b) {
        System.out.println("Concatenating strings");
        return a + " " + b;
    }
    
    public static void main(String[] args) {
        System.out.println("Result: " + add(10, 20));
        System.out.println("Result: " + add(10.5, 20.3));
        System.out.println("Result: " + add(5, 10, 15));
        System.out.println("Result: " + add("Hello", "World"));
    }
}