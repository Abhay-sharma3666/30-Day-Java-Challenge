/* Program 2: To create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
              Override the speedUp() method in each subclass to increase the vehicle's speed differently.

 */
// Vehicle.java
// Base class Vehicle

class Vehicle1 {
    private int speed;

    public void speedUp() {
        speed += 10;
    }

    public int getSpeed() {
        return speed;
    }
}
// Car.java
// Subclass Car

class Car1 extends Vehicle1 {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units.");
    }
}
// Motorcycle.java
// Subclass Motorcycle

class Motorcycle1 extends Vehicle1{
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }
}
// Main.java
// Main class

public class Day_15_Polymorphism_2 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Motorcycle1 motorcycle = new Motorcycle1();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
    }
}


