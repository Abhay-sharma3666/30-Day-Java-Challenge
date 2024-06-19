
/*Program 3 : Write a Java program to create a class called Shape with a method called getArea().
              Create a subclass called Rectangle that overrides the getArea()
              method to calculate the area of a rectangle.
 */
// Shape.java
// Parent class Shape
 class Shape {
    public double getArea() {
        return 0.0;
    }
}
// Rectangle.java
// Child class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
// Main.java
// Main class
public class Day_14_Inheritance_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
