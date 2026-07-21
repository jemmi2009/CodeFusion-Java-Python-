/**
 * ArrayLists.java
 * Demonstrates ArrayList - dynamic array implementation
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("=== ArrayList in Java ===");
        System.out.println();
        
        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("--- Adding Elements ---");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);
        System.out.println();
        
        // Add at specific index
        System.out.println("--- Insert at Index ---");
        fruits.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + fruits);
        System.out.println();
        
        // Access elements
        System.out.println("--- Access Elements ---");
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));
        System.out.println();
        
        // Remove elements
        System.out.println("--- Remove Elements ---");
        fruits.remove("Grapes");
        System.out.println("After removing Grapes: " + fruits);
        fruits.remove(0);
        System.out.println("After removing index 0: " + fruits);
        System.out.println();
        
        // Size and isEmpty
        System.out.println("--- Size Operations ---");
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());
        System.out.println();
        
        // Contains
        System.out.println("--- Contains ---");
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        System.out.println("Contains 'Papaya'? " + fruits.contains("Papaya"));
        System.out.println();
        
        // Iteration
        System.out.println("--- Iterate ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        
        // ArrayList of integers
        System.out.println("--- ArrayList of Integers ---");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(30);
        numbers.add(70);
        numbers.add(20);
        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
    }
}