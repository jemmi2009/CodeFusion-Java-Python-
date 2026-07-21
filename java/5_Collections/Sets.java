/**
 * Sets.java
 * Demonstrates HashSet and TreeSet - unique elements
 */

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        System.out.println("=== HashSet ===");
        System.out.println();
        
        // HashSet - unordered, no duplicates
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");  // Duplicate, will be ignored
        System.out.println("Colors: " + colors);
        System.out.println("Size: " + colors.size());
        System.out.println();
        
        // Check if contains
        System.out.println("Contains 'Red'? " + colors.contains("Red"));
        System.out.println("Contains 'Yellow'? " + colors.contains("Yellow"));
        System.out.println();
        
        // Remove
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);
        System.out.println();
        
        // Iterate
        System.out.println("Iterate through HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();
        
        System.out.println("=== TreeSet ===");
        System.out.println();
        
        // TreeSet - sorted, no duplicates
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(30);
        numbers.add(70);
        numbers.add(20);
        numbers.add(70);  // Duplicate ignored
        System.out.println("Numbers (sorted): " + numbers);
        System.out.println();
        
        // First and Last
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println();
        
        // Set operations
        System.out.println("=== Set Operations ===");
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        
        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }
}