# Python Collections 📦

Master Python's built-in data structures.

## Topics Covered

1. **lists.py** - Mutable sequences
2. **dictionaries.py** - Key-value pairs
3. **sets.py** - Unique elements
4. **tuples.py** - Immutable sequences

## Lists

```python
fruits = ["Apple", "Banana", "Orange"]
fruits.append("Mango")
fruits.remove("Banana")
fruits[0]  # Access
```

**Methods:**
- append(), insert(), remove()
- pop(), clear(), sort()
- count(), index()

## Dictionaries

```python
student = {"name": "Alice", "age": 20}
student["city"] = "NYC"
student.get("name")
del student["city"]
```

**Methods:**
- keys(), values(), items()
- get(), pop(), update()

## Sets

```python
colors = {"Red", "Blue", "Green"}
colors.add("Yellow")
colors.remove("Red")
```

**Operations:**
- Union: |, add(), update()
- Intersection: &, intersection()
- Difference: -, difference()

## Tuples

```python
point = (10, 20)
x, y = point  # Unpacking
```

**Properties:**
- Immutable
- Faster than lists
- Can be dict keys

## Comparison

| Type | Ordered | Mutable | Duplicates | Indexed |
|------|---------|---------|------------|----------|
| List | Yes | Yes | Yes | Yes |
| Tuple | Yes | No | Yes | Yes |
| Set | No | Yes | No | No |
| Dict | Yes (3.7+) | Yes | No (keys) | No |

## Running Programs

```bash
cd python/5_Collections
python lists.py
python dictionaries.py
python sets.py
python tuples.py
```

## Practice Exercises

1. Remove duplicates using sets
2. Count word frequency with dict
3. Sort students by GPA
4. Implement student database

## Next Steps

Move to **Data Structures** for advanced implementations!