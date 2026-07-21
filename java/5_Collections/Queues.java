/**
 * Queues.java
 * Demonstrates Queue and Deque - FIFO and LIFO structures
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

public class Queues {
    public static void main(String[] args) {
        System.out.println("=== Queue (FIFO) ===");
        System.out.println();
        
        // Queue - First In First Out
        Queue<String> queue = new LinkedList<>();
        System.out.println("--- Enqueue (add) ---");
        queue.add("Person1");
        queue.add("Person2");
        queue.add("Person3");
        queue.add("Person4");
        System.out.println("Queue: " + queue);
        System.out.println();
        
        // Peek
        System.out.println("--- Peek (view front) ---");
        System.out.println("Front element: " + queue.peek());
        System.out.println();
        
        // Dequeue
        System.out.println("--- Dequeue (remove) ---");
        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
        System.out.println();
        
        System.out.println("=== Deque (Double Ended Queue) ===");
        System.out.println();
        
        // Deque - can add/remove from both ends
        Deque<Integer> deque = new LinkedList<>();
        System.out.println("--- Add to both ends ---");
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);
        System.out.println("Deque: " + deque);
        System.out.println();
        
        System.out.println("--- Remove from both ends ---");
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("Deque: " + deque);
        System.out.println();
        
        // Priority Queue example
        System.out.println("=== Stack (LIFO) ===");
        Deque<String> stack = new LinkedList<>();
        System.out.println("--- Push ---");
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        System.out.println("Stack: " + stack);
        System.out.println();
        
        System.out.println("--- Pop ---");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}