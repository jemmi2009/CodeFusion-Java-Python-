/**
 * CoffeeDecorator.java
 * Real-world example: Coffee shop decorator pattern
 * 
 * @author Code Fusion
 * @version 1.0
 */

public class CoffeeDecorator {
    
    // Beverage Interface
    interface Beverage {
        String getDescription();
        double getCost();
    }
    
    // Concrete Beverage - Simple Coffee
    static class SimpleCoffee implements Beverage {
        @Override
        public String getDescription() {
            return "Simple Coffee";
        }
        
        @Override
        public double getCost() {
            return 1.0;
        }
    }
    
    // Abstract Decorator
    abstract static class BeverageDecorator implements Beverage {
        protected Beverage beverage;
        
        public BeverageDecorator(Beverage beverage) {
            this.beverage = beverage;
        }
    }
    
    // Milk Decorator
    static class MilkDecorator extends BeverageDecorator {
        public MilkDecorator(Beverage beverage) {
            super(beverage);
        }
        
        @Override
        public String getDescription() {
            return beverage.getDescription() + ", Milk";
        }
        
        @Override
        public double getCost() {
            return beverage.getCost() + 0.5;
        }
    }
    
    // Sugar Decorator
    static class SugarDecorator extends BeverageDecorator {
        public SugarDecorator(Beverage beverage) {
            super(beverage);
        }
        
        @Override
        public String getDescription() {
            return beverage.getDescription() + ", Sugar";
        }
        
        @Override
        public double getCost() {
            return beverage.getCost() + 0.3;
        }
    }
    
    // Whipped Cream Decorator
    static class WhippedCreamDecorator extends BeverageDecorator {
        public WhippedCreamDecorator(Beverage beverage) {
            super(beverage);
        }
        
        @Override
        public String getDescription() {
            return beverage.getDescription() + ", Whipped Cream";
        }
        
        @Override
        public double getCost() {
            return beverage.getCost() + 0.7;
        }
    }
    
    // Caramel Decorator
    static class CaramelDecorator extends BeverageDecorator {
        public CaramelDecorator(Beverage beverage) {
            super(beverage);
        }
        
        @Override
        public String getDescription() {
            return beverage.getDescription() + ", Caramel";
        }
        
        @Override
        public double getCost() {
            return beverage.getCost() + 0.6;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Coffee Shop Decorator Pattern ===");
        System.out.println();
        
        // Order 1: Simple coffee
        Beverage order1 = new SimpleCoffee();
        System.out.println("Order 1: " + order1.getDescription());
        System.out.println("Cost: $" + order1.getCost());
        System.out.println();
        
        // Order 2: Coffee with milk and sugar
        Beverage order2 = new SimpleCoffee();
        order2 = new MilkDecorator(order2);
        order2 = new SugarDecorator(order2);
        System.out.println("Order 2: " + order2.getDescription());
        System.out.println("Cost: $" + order2.getCost());
        System.out.println();
        
        // Order 3: Coffee with milk, sugar, and whipped cream
        Beverage order3 = new SimpleCoffee();
        order3 = new MilkDecorator(order3);
        order3 = new SugarDecorator(order3);
        order3 = new WhippedCreamDecorator(order3);
        System.out.println("Order 3: " + order3.getDescription());
        System.out.println("Cost: $" + order3.getCost());
        System.out.println();
        
        // Order 4: Deluxe coffee
        Beverage order4 = new SimpleCoffee();
        order4 = new MilkDecorator(order4);
        order4 = new CaramelDecorator(order4);
        order4 = new WhippedCreamDecorator(order4);
        order4 = new SugarDecorator(order4);
        System.out.println("Order 4 (Deluxe): " + order4.getDescription());
        System.out.println("Cost: $" + order4.getCost());
    }
}
