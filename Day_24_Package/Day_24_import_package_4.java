
/* Problem 4 : Write a Java program that  imports packages for calculating the area and perimeter of different
               shapes such as rectangles, triangles, circles, and spheres.
 */
import pack.Area_calculator.*;
import pack.Perimeter_calculator.*;
public class Day_24_import_package_4 {
    public static void main(String[] args) {
        // Create objects for area calculations
        pack.Area_calculator.Rectangle areaRectangle = new pack.Area_calculator.Rectangle();
        pack.Area_calculator.Triangle areaTriangle = new pack.Area_calculator.Triangle();
        pack.Area_calculator.Circle areaCircle = new pack.Area_calculator.Circle();
        pack.Area_calculator.Sphere areaSphere = new pack.Area_calculator.Sphere();

        // Create objects for perimeter calculations
        pack.Perimeter_calculator.Rectangle perimeterRectangle = new pack.Perimeter_calculator.Rectangle();
        pack.Perimeter_calculator.Triangle perimeterTriangle = new pack.Perimeter_calculator.Triangle();
        pack.Perimeter_calculator.Circle perimeterCircle = new pack.Perimeter_calculator.Circle();

        // Define dimensions
        double length = 10;
        double width = 5;
        double base = 8;
        double height = 6;
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        double radius = 7;

        // Calculate areas
        double rectArea = areaRectangle.area(length, width);
        double triArea = areaTriangle.area(base, height);
        double circArea = areaCircle.area(radius);
        double sphArea = areaSphere.area(radius);

        // Calculate perimeters
        double rectPerimeter = perimeterRectangle.perimeter(length, width);
        double triPerimeter = perimeterTriangle.perimeter(side1, side2, side3);
        double circPerimeter = perimeterCircle.perimeter(radius);

        // Display the results
        System.out.println("Rectangle Area: " + rectArea);
        System.out.println("Triangle Area: " + triArea);
        System.out.println("Circle Area: " + circArea);
        System.out.println("Sphere Area: " + sphArea);

        System.out.println("Rectangle Perimeter: " + rectPerimeter);
        System.out.println("Triangle Perimeter: " + triPerimeter);
        System.out.println("Circle Perimeter: " + circPerimeter);
    }
}