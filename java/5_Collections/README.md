# Java Collections Framework 📦

Master the Collections API for storing and managing data.

## Topics Covered

1. **ArrayLists.java** - Dynamic arrays
2. **HashMaps.java** - Key-value pairs
3. **Sets.java** - Unique elements
4. **Queues.java** - FIFO and LIFO structures

## Collection Hierarchy

```
Collection
├── List (ordered, allows duplicates)
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
├── Set (unordered, no duplicates)
│   ├── HashSet
│   ├── TreeSet
│   └── LinkedHashSet
└── Queue (FIFO)
    ├── LinkedList
    └── PriorityQueue

Map (key-value pairs)
├── HashMap
├── TreeMap
└── LinkedHashMap
```

## ArrayList

```java
ArrayList<String> list = new ArrayList<>();
list.add("item");
list.get(0);
list.remove(0);
list.size();
```

## HashMap

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("key", 100);
map.get("key");
map.remove("key");
```

## HashSet

```java
Set<String> set = new HashSet<>();
set.add("element");
set.contains("element");
set.remove("element");
```

## Queue

```java
Queue<String> queue = new LinkedList<>();
queue.add("item");
queue.peek();     // view front
queue.poll();     // remove front
```

## Running Programs

```bash
cd java/5_Collections
javac ArrayLists.java
java ArrayLists
```

## Practice Exercises

1. Create a frequency counter using HashMap
2. Remove duplicates using HashSet
3. Implement a task queue
4. Create a student grade book with HashMap

## Next Steps

Move to **Data Structures** to learn advanced implementations!