
//  Welcome to Day 17
// "Today, I tackled a problem involving an Abstract class.”

/* Problem 1 : Create an abstract class “Shape” with abstract methods “getArea()” and “getPerimeter()”.
               Implement two subclasses “Rectangle” and “Circle” which extend “Shape” and implement the
               abstract methods. Create a “Square” class which extends “Rectangle” and overrides the necessary methods.
               Create objects of all classes and test their behavior.
 */

// Solving 1 :-->

abstract class Shape3 {
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Rectangle3 extends Shape3 {
    private double length;
    private double width;
    public Rectangle3(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
class Circle2 extends Shape3 {
    private double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Square extends Rectangle3 {
    public Square(double side) {
        super(side, side);
    }
    public double getArea() {
        return super.getArea();
    }
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
public class Day_17_Abstract_class_1 {
    public static void main(String[] args) {
        Shape3 rectangle3 = new Rectangle3(4, 6);
        Shape3 circle2 = new Circle2(3);
        Shape3 square = new Square(5);
        System.out.println("Rectangle area: " + rectangle3.getArea());
        System.out.println("Rectangle perimeter: " + rectangle3.getPerimeter());
        System.out.println("Circle area: " + circle2.getArea());
        System.out.println("Circle perimeter: " + circle2.getPerimeter());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
    }
}
