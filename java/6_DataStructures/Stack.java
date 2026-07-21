/**
 * Stack.java
 * Demonstrates Stack implementation (LIFO)
 */

public class Stack {
    
    static class StackImpl {
        private int[] arr;
        private int top;
        private int capacity;
        
        public StackImpl(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }
        
        public void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Stack is full!");
                return;
            }
            arr[++top] = value;
        }
        
        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[top--];
        }
        
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[top];
        }
        
        public boolean isEmpty() {
            return top == -1;
        }
        
        public void display() {
            if (top == -1) {
                System.out.println("Stack: []");
                return;
            }
            System.out.print("Stack: [");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]);
                if (i < top) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Stack (LIFO) Implementation ===");
        System.out.println();
        
        StackImpl stack = new StackImpl(5);
        
        System.out.println("--- Push Elements ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println();
        
        System.out.println("--- Peek ---");
        System.out.println("Top element: " + stack.peek());
        System.out.println();
        
        System.out.println("--- Pop Elements ---");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println();
        
        System.out.println("--- Check Empty ---");
        System.out.println("Is empty? " + stack.isEmpty());
    }
}