/**
 * LinkedList.java
 * Demonstrates LinkedList implementation
 */

public class LinkedList {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class LinkedListImpl {
        Node head;
        
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        
        public void display() {
            Node temp = head;
            System.out.print("List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        public void delete(int data) {
            if (head == null) return;
            
            if (head.data == data) {
                head = head.next;
                return;
            }
            
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data == data) {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
        
        public void reverse() {
            Node prev = null;
            Node current = head;
            
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        
        public int search(int data) {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.data == data) {
                    return index;
                }
                temp = temp.next;
                index++;
            }
            return -1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== LinkedList Implementation ===");
        System.out.println();
        
        LinkedListImpl list = new LinkedListImpl();
        
        System.out.println("--- Insert Elements ---");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        System.out.println();
        
        System.out.println("--- Delete Element ---");
        list.delete(20);
        list.display();
        System.out.println();
        
        System.out.println("--- Search ---");
        System.out.println("Index of 30: " + list.search(30));
        System.out.println("Index of 50: " + list.search(50));
        System.out.println();
        
        System.out.println("--- Reverse ---");
        list.reverse();
        list.display();
    }
}