/**
 * HashMaps.java
 * Demonstrates HashMap - key-value pair storage
 */

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        System.out.println("=== HashMap in Java ===");
        System.out.println();
        
        // Create HashMap
        HashMap<String, Integer> marks = new HashMap<>();
        System.out.println("--- Adding Elements ---");
        marks.put("Alice", 95);
        marks.put("Bob", 87);
        marks.put("Charlie", 92);
        marks.put("Diana", 88);
        System.out.println("Marks: " + marks);
        System.out.println();
        
        // Get values
        System.out.println("--- Get Values ---");
        System.out.println("Alice's marks: " + marks.get("Alice"));
        System.out.println("Bob's marks: " + marks.get("Bob"));
        System.out.println();
        
        // Check if key exists
        System.out.println("--- Contains Key ---");
        System.out.println("Contains 'Alice'? " + marks.containsKey("Alice"));
        System.out.println("Contains 'Eve'? " + marks.containsKey("Eve"));
        System.out.println();
        
        // Remove
        System.out.println("--- Remove Element ---");
        marks.remove("Bob");
        System.out.println("After removing Bob: " + marks);
        System.out.println();
        
        // Size
        System.out.println("--- Size ---");
        System.out.println("HashMap size: " + marks.size());
        System.out.println();
        
        // Iterate through keys
        System.out.println("--- Iterate Keys ---");
        for (String name : marks.keySet()) {
            System.out.println(name + ": " + marks.get(name));
        }
        System.out.println();
        
        // Iterate through entries
        System.out.println("--- Iterate Entries ---");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        
        // Student records
        System.out.println("--- Student Records ---");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1001, "Alice");
        students.put(1002, "Bob");
        students.put(1003, "Charlie");
        System.out.println("Students: " + students);
        System.out.println("Student ID 1002: " + students.get(1002));
    }
}