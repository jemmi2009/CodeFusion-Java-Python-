# Java Decorators & Design Patterns 🎨

Learn about the Decorator design pattern in Java for extending object functionality dynamically.

## Topics Covered

1. **BasicDecorator.java** - Simple decorator pattern implementation
2. **CoffeeDecorator.java** - Real-world coffee shop example
3. **ComponentDecorator.java** - UI component decoration
4. **AdvancedDecorators.java** - Multiple decorator composition

## What is the Decorator Pattern?

The Decorator Pattern allows you to attach additional responsibilities to an object dynamically.
It provides a flexible alternative to subclassing for extending functionality.

## Key Concepts

### Component Interface
```java
public interface Component {
    String operation();
}
```

### Base Component
```java
public class ConcreteComponent implements Component {
    @Override
    public String operation() {
        return "Base Operation";
    }
}
```

### Decorator Class
```java
public abstract class Decorator implements Component {
    protected Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
}
```

### Concrete Decorators
```java
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    @Override
    public String operation() {
        return "DecoratorA(" + component.operation() + ")";
    }
}
```

## Real-World Example: Coffee Decorator

```java
// Base coffee
Beverage coffee = new SimpleCoffee();

// Add decorators
coffee = new MilkDecorator(coffee);
coffee = new SugarDecorator(coffee);
coffee = new WhippedCreamDecorator(coffee);

System.out.println(coffee.getDescription());  // Coffee, Milk, Sugar, Whipped Cream
System.out.println(coffee.getCost());          // 1.0 + 0.5 + 0.3 + 0.7
```

## Advantages

- ✅ **Flexibility**: Add responsibilities without modifying existing code
- ✅ **Single Responsibility**: Each decorator has one job
- ✅ **Open/Closed Principle**: Open for extension, closed for modification
- ✅ **Runtime Composition**: Combine decorators at runtime

## Disadvantages

- ❌ Can create many small classes
- ❌ Difficult to remove decorators in the middle of the chain
- ❌ Order of decorators matters

## Running the Programs

```bash
cd java/7_Decorators
javac *.java
java BasicDecorator
java CoffeeDecorator
java ComponentDecorator
java AdvancedDecorators
```

## Practice Exercises

1. Create a Pizza decorator system (Cheese, Pepperoni, Mushrooms)
2. Build a File I/O decorator (Compression, Encryption, Buffering)
3. Design a Vehicle decorator (Turbo, AC, Sunroof)
4. Implement a Text formatter (Bold, Italic, Underline)

## Key Differences: Decorator vs Inheritance

| Aspect | Inheritance | Decorator |
|--------|-------------|----------|
| Timing | Compile-time | Runtime |
| Flexibility | Fixed | Dynamic |
| Complexity | Simple class hierarchies | Potentially many classes |
| Reusability | Limited | High |

## Next Steps

Explore more design patterns or dive into **Factory Pattern** for object creation!
