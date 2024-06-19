// Welcome to Day 14
// " Today, I tackled a problem involving a for Inheritance. ”
/* Program 1 : Write a Java program to create a class called Animal with a method
               called makeSound(). Create a subclass called Cat that overrides
               the makeSound() method to bark.
*/
// Animal.java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
// Cat.java
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}
// Main.java
public class Day_14_Inheritance_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
