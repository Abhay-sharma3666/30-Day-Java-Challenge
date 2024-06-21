/* Problem 5: To create a class called Circle with a private instance variable
              radius. Provide public getter and setter methods to access and modify
              the radius variable. However, provide two methods called calculateArea()
              and calculatePerimeter() that return the calculated area and perimeter
              based on the current radius value.
 */


// Solving :-->

// Circle.java
// Circle Class

class Circle1 {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class Day_16_Encapsulation_5 {
    public static void main(String[] args) {
        // Create an instance of Circle1
        Circle1 circle = new Circle1();

        // Set the radius using the setter method
        circle.setRadius(7.0);

        // Get the radius using the getter method
        double radius = circle.getRadius();

        // Calculate and print the area and perimeter
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
    }
}
