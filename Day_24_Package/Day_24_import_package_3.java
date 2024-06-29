
/* Problem 3 : Write a Java program that that uses a custom package mini_calculator to perform basic
               arithmetic operations between two numbers.
 */
import pack.mini_calculator.Calculator;
public class Day_24_import_package_3 {
    public static void main(String[] args) {
        // Create a Calculator object
        Calculator calculator = new Calculator();

        // Define two numbers
        double num1 = 10;
        double num2 = 5;

        // Perform arithmetic operations
        double sum = calculator.add(num1, num2);
        double difference = calculator.subtract(num1, num2);
        double product = calculator.multiply(num1, num2);
        double quotient = calculator.divide(num1, num2);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}