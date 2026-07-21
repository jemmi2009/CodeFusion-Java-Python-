/**
 * Queue.java
 * Demonstrates Queue implementation (FIFO)
 */

public class Queue {
    
    static class QueueImpl {
        private int[] arr;
        private int front;
        private int rear;
        private int capacity;
        
        public QueueImpl(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.front = 0;
            this.rear = -1;
        }
        
        public void enqueue(int value) {
            if (rear == capacity - 1) {
                System.out.println("Queue is full!");
                return;
            }
            arr[++rear] = value;
        }
        
        public int dequeue() {
            if (front > rear) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front++];
        }
        
        public int peek() {
            if (front > rear) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
        
        public boolean isEmpty() {
            return front > rear;
        }
        
        public void display() {
            if (front > rear) {
                System.out.println("Queue: []");
                return;
            }
            System.out.print("Queue: [");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]);
                if (i < rear) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Queue (FIFO) Implementation ===");
        System.out.println();
        
        QueueImpl queue = new QueueImpl(5);
        
        System.out.println("--- Enqueue Elements ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        System.out.println();
        
        System.out.println("--- Peek ---");
        System.out.println("Front element: " + queue.peek());
        System.out.println();
        
        System.out.println("--- Dequeue Elements ---");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println();
        
        System.out.println("--- Check Empty ---");
        System.out.println("Is empty? " + queue.isEmpty());
    }
}