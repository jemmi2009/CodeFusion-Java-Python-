# Java Data Structures 🏗️

Learn fundamental data structures and their implementations.

## Topics Covered

1. **LinkedList.java** - Linked List implementation
2. **Stack.java** - Stack (LIFO) implementation
3. **Queue.java** - Queue (FIFO) implementation
4. **BinaryTree.java** - Binary Tree operations

## LinkedList

```
Node1 -> Node2 -> Node3 -> null
```

**Operations:**
- Insert: Add element at end
- Delete: Remove element
- Search: Find element
- Reverse: Reverse the list

## Stack (LIFO)

```
Top -> [3]
       [2]
       [1]
```

**Operations:**
- push(): Add to top
- pop(): Remove from top
- peek(): View top

## Queue (FIFO)

```
Front -> [1] -> [2] -> [3] <- Rear
```

**Operations:**
- enqueue(): Add to rear
- dequeue(): Remove from front
- peek(): View front

## Time Complexity

| Operation | LinkedList | Stack | Queue |
|-----------|-----------|-------|-------|
| Insert | O(n) | O(1) | O(1) |
| Delete | O(n) | O(1) | O(1) |
| Search | O(n) | O(n) | O(n) |
| Access | O(n) | O(1) | O(1) |

## Running Programs

```bash
cd java/6_DataStructures
javac LinkedList.java
java LinkedList
```

## Practice Exercises

1. Implement circular linked list
2. Implement double-ended queue (Deque)
3. Check balanced parentheses using stack
4. Implement priority queue

## Next Steps

Move to **Algorithms** to learn sorting and searching!