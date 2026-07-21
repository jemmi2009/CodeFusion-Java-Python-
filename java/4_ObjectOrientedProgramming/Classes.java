/**
 * Classes.java
 * Demonstrates class definition with attributes, constructors, and methods
 */

public class Classes {
    
    static class Person {
        private String name;
        private int age;
        private String email;
        
        public Person() {
            this.name = "Unknown";
            this.age = 0;
        }
        
        public Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
        }
        
        public boolean isAdult() {
            return age >= 18;
        }
    }
    
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice", 28, "alice@email.com");
        
        p1.setName("John");
        p1.setAge(30);
        
        p1.displayInfo();
        p2.displayInfo();
        
        System.out.println("Is John an adult? " + p1.isAdult());
    }
}