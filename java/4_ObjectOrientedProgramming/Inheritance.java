/**
 * Inheritance.java
 * Demonstrates inheritance: parent-child relationships
 */

public class Inheritance {
    
    static class Animal {
        protected String name;
        protected int age;
        
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public void eat() {
            System.out.println(name + " is eating.");
        }
        
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }
    }
    
    static class Dog extends Animal {
        private String breed;
        
        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }
        
        @Override
        public void eat() {
            System.out.println(name + " is eating dog food.");
        }
        
        public void bark() {
            System.out.println(name + " is barking: Woof! Woof!");
        }
    }
    
    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }
        
        @Override
        public void eat() {
            System.out.println(name + " is eating cat food.");
        }
        
        public void meow() {
            System.out.println(name + " is meowing: Meow!");
        }
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3);
        
        dog.eat();
        dog.bark();
        dog.sleep();
        
        cat.eat();
        cat.meow();
    }
}