//  Welcome to Day 18
// "Today, I tackled a problem involving a Interface.”
/* Problem 1 : to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle,
               and Triangle that implement the Shape interface. Implement the getArea() method for each of the
               three classes.
 */
// Shape.java
// This is an interface named 'Shape' that defines a contract for classes to implement.
interface Shape2 {
    // Abstract method signature for getting the area of a shape.
    double getArea();
}
// Rectangle.java
// This is the 'Rectangle' class that implements the 'Shape' interface.

class Rectangle4 implements Shape2 {
    // Private instance variables to store the dimensions of the rectangle.
    private double length;
    private double width;

    // Constructor for creating a Rectangle object with given length and width.
    public Rectangle4(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the 'getArea' method as required by the 'Shape' interface.
    @Override
    public double getArea() {
        // Calculate and return the area of the rectangle.
        return length * width;
    }
}
// Circle.java
// This is the 'Circle' class that implements the 'Shape' interface.

class Circle3 implements Shape2 {
    // Private instance variable to store the radius of the circle.
    private double radius;

    // Constructor for creating a Circle object with a given radius.
    public Circle3(double radius) {
        this.radius = radius;
    }

    // Implementation of the 'getArea' method as required by the 'Shape' interface.
    @Override
    public double getArea() {
        // Calculate and return the area of the circle using the formula: π * r^2.
        return Math.PI * radius * radius;
    }
}
// Triangle.java
// This is the 'Triangle' class that implements the 'Shape' interface.

class Triangle1 implements Shape2 {
    // Private instance variables to store the base and height of the triangle.
    private double base;
    private double height;

    // Constructor for creating a Triangle object with a given base and height.
    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of the 'getArea' method as required by the 'Shape' interface.
    @Override
    public double getArea() {
        // Calculate and return the area of the triangle using the formula: 0.5 * base * height.
        return 0.5 * base * height;
    }
}


public class Day_18_Interface_1 {
    public static void main(String[] args) {
        // Create a Rectangle object with length=10 and width=12
        Rectangle4 rectangle = new Rectangle4(10, 12);

        // Create a Circle object with radius=3
        Circle3 circle = new Circle3(3);

        // Create a Triangle object with base=4 and height=6
        Triangle1 triangle = new Triangle1(4, 6);

        // Print the area of the Rectangle
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

        // Print the area of the Circle
        System.out.println("Area of the Circle: " + circle.getArea());

        // Print the area of the Triangle
        System.out.println("Area of the Triangle: " + triangle.getArea());
    }
}
