// Welcome to Day 5
// " Today, I tackled a problem involving a for switch loop. ”

/* Problem 1 : To input an alphabet and check whether it is vowel or consonant
               using switch case. C program to check vowel or consonant using
               switch case. Logic to check vowel or consonant using switch case.
*/
/* Problem 2 : To find roots of a quadratic equation using switch case.
*/
/* Problem 3 : To create Simple Calculator using switch case.
 */
import java.util.Scanner;
public class Day_5_switch_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solving Problem 1
        /*System.out.println("Enter any alphabet : ");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a' :
                System.out.println("vowels");
                break;
            case 'e' :
                System.out.println("vowels");
                break;
            case 'i' :
                System.out.println("vowels");
                break;
            case 'o' :
                System.out.println("vowels");
                break;
            case 'u' :
                System.out.println("vowels");
                break;
            case 'A' :
                System.out.println("vowels");
                break;
            case 'E' :
                System.out.println("vowels");
                break;
            case 'I' :
                System.out.println("vowels");
                break;
            case 'O' :
                System.out.println("vowels");
                break;
            case 'U' :
                System.out.println("vowels");
                break;
            default:
                System.out.println("Consonant");
        }*/
        // Solving Problem 2
        /*System.out.println("Enter cofficients (a,b,c) of the quadratic equation :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double discriminat = b * b - 4 * a * c;
        switch (Double.compare(discriminat,0)){
            case 1:
                double root1 = (-b + Math.sqrt(discriminat)) / (2 * a);
                double root2 = (-b + Math.sqrt(discriminat)) / (2 * a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
                break;
            case 0:
                double root = -b / (2 * a);
                System.out.println("Single real root: " + root);
                break;
            default:
                System.out.println("Complex roots. No real solution.");
        }*/
        // Solving Problem 3
        /*double result = 0.0;
        System.out.println("Simple Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4) : ");
        int choice = sc.nextInt();
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        switch (choice){
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("Enter : cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, 4.");
                return;
        }
        System.out.println("Result: " + result);*/
    }
}
