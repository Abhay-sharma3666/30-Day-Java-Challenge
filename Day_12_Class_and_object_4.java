
/* Problem 4 : Write a program to check valid triangle and also check type of triangle.
 */
import java.util.Scanner;
import java.util.Scanner;

class TriangleChecker{
    public int a ,b ,c ;

    private void setA(int a){
        this.a = a;
    }
    private void setB(int b){
        this.b = b;
    }
    private void setC(int c){
        this.c = c;
    }
    public boolean isValidTriangle(int a, int b, int c){
        return (a+b>c) && (a+c>b) && (b+c>a);
    }
    public String typeOfTriangle(int a, int b, int c){
        if (a == b && b == c){
            return "Equilateral";
        }
        else if (a==b || b==c ||a==c) {
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }
}
public class Day_12_Class_and_object_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleChecker tc = new TriangleChecker();
        System.out.print("Enter side of triangle a : ");
        int a = sc.nextInt();
        System.out.print("Enter side of triangle b : ");
        int b = sc.nextInt();
        System.out.print("Enter side of triangle c : ");
        int c = sc.nextInt();

        if (tc.isValidTriangle(a,b,c)){
            System.out.println("The type of triangle is : "+ tc.typeOfTriangle(a,b,c));
        }
        else {
            System.out.println("The triangle is not valid.");
        }
    }
}
