
//  Welcome to Day 25
// "Today, I tackled a problem involving a Exception Handling.”
/* Problem 1 : Write a program to divide any number by 0 and buy pass the error.

 */

public class Day_25_Execption_Handling_1_try {
    public static void main(String[] args) {
        int a =4,b=0;
        System.out.println("Hello");
        try{
            System.out.println(a/b);
        }catch (ArithmeticException ex){
            System.out.println("Can't divide any number by zero \n Please change the number");
        }

        System.out.println("Sonu");
    }
}