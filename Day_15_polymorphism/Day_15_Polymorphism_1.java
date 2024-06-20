
// Welcome to Day 15
// " Today, I tackled a problem involving a for Polymorphism. ”
/* Program 1 : To create a base class Animal (Animal Family) with a method called Sound().
               Create two subclasses Bird and Cat. Override the Sound() method in each
               subclass to make a specific sound for each animal.
*/
// Animal.java
// Base class Animal
class Animal1 {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
// Bird.java
// Subclass Bird

class Bird extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}
// Cat.java
// Subclass Cat

class Cat1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
// Main.java
// Main class

public class Day_15_Polymorphism_1 {
        public static void main(String[] args) {
            Animal1 animal = new Animal1();
            Bird bird = new Bird();
            Cat1 cat = new Cat1();

            animal.makeSound(); // Output: The animal makes a sound
            bird.makeSound();   // Output: The bird chirps
            cat.makeSound();    // Output: The cat meows
    }
}
