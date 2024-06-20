/* Program 3 :To create a base class Shape with a method called calculateArea().
              Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
              method in each subclass to calculate and return the shape's area.

 */
// Shape.java
// Base class Shape
class Shape1 {
    public double calculateArea() {
        return 0; // Default implementation returns 0
    }
}
// Circle.java
// Subclass Circle
class Circle extends Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate area of circle
    }
}
// Rectangle.java
// Subclass Rectangle
class Rectangle1 extends Shape1 {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Calculate area of rectangle
    }
}
// Triangle.java
// Subclass Triangle
class Triangle extends Shape1 {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Calculate area of triangle
    }
}

public class Day_15_Polymorphism_3 {
    // Main.java
// Main class
        public static void main(String[] args) {
            Circle circle = new Circle(4);
            System.out.println("Area of Circle: " + circle.calculateArea());

            Rectangle1 rectangle = new Rectangle1(12, 34);
            System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

            Triangle triangle = new Triangle(5, 9);
            System.out.println("\nArea of Triangle: " + triangle.calculateArea());
        }


}
