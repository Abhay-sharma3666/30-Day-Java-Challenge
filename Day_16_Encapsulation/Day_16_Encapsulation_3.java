
/* Problem 3 : To create a class called Rectangle with private instance variables
               length and width. Provide public getter and setter methods to access
               and modify these variables.
 */
// Solving :-->\

// Rectangle.java
// Rectangle Class

class Rectangle2 {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

public class Day_16_Encapsulation_3 {
    public static void main(String[] args) {
        // Create an instance of Rectangle2
        Rectangle2 rectangle = new Rectangle2();

        // Set values using setter methods
        rectangle.setLength(6.7);
        rectangle.setWidth(12.0);

        // Get values using getter methods
        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        // Print the values
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
