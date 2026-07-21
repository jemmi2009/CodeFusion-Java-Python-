/**
 * BasicDecorator.java
 * Demonstrates the basic Decorator design pattern
 * 
 * @author Code Fusion
 * @version 1.0
 */

public class BasicDecorator {
    
    // Component Interface
    interface Component {
        String operation();
    }
    
    // Concrete Component
    static class ConcreteComponent implements Component {
        @Override
        public String operation() {
            return "Base Operation";
        }
    }
    
    // Abstract Decorator
    abstract static class Decorator implements Component {
        protected Component component;
        
        public Decorator(Component component) {
            this.component = component;
        }
    }
    
    // Concrete Decorator A
    static class ConcreteDecoratorA extends Decorator {
        public ConcreteDecoratorA(Component component) {
            super(component);
        }
        
        @Override
        public String operation() {
            return "DecoratorA[" + component.operation() + "]";
        }
    }
    
    // Concrete Decorator B
    static class ConcreteDecoratorB extends Decorator {
        public ConcreteDecoratorB(Component component) {
            super(component);
        }
        
        @Override
        public String operation() {
            return "DecoratorB[" + component.operation() + "]";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Basic Decorator Pattern ===");
        System.out.println();
        
        // Create base component
        Component component = new ConcreteComponent();
        System.out.println("Original: " + component.operation());
        System.out.println();
        
        // Apply first decorator
        component = new ConcreteDecoratorA(component);
        System.out.println("After DecoratorA: " + component.operation());
        System.out.println();
        
        // Apply second decorator
        component = new ConcreteDecoratorB(component);
        System.out.println("After DecoratorB: " + component.operation());
        System.out.println();
        
        // Apply first decorator again
        component = new ConcreteDecoratorA(component);
        System.out.println("After DecoratorA again: " + component.operation());
    }
}
