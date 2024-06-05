
// Welcome to Day 3
// " Today, I tackled a problem involving a for while loop. ”

/* Problem 1 : To convert Binary to Decimal number system?
                for example :- 001 = 1 , 111 = 7 , 1111 = 15 , 100 = 4 ,1000 = 8
*/
/* Problem 2 : To check if a given number is a palindrome using a while loop?
               NOTE :-  Palindrome number is such number which when reversed is equal to the original number.
               For example: 121, 12321, 1001 etc.
*/
/* Problem 3 : To swap first and last digits of a number?
*/
/* Problem 4 : To check whether a number is Armstrong number or not?
               NOTE :- An Armstrong number is a n-digit number that is equal to the sum of the nth power of its digits.
               For example :– 6 = 61 = 6
                              371 = 3^3 + 7^3 + 1^3 = 371
*/
import java.util.Scanner;
public class Day_3_While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solving problem 1
        /*int n,z,b=0,c=0;
        double dec=0,sum=0;
        System.out.print("Enter the Binary number :- ");
        n=sc.nextInt();
        z=n;
        while (n!=0){
            b = n%10;
            dec = b * Math.pow(2,c);
            sum = sum + dec;
            n = n/10;
            c = c+1;
        }
        System.out.println(sum);*/
        // Solving problem 2
        /*int n,b =0,z,r=0;
        System.out.println("Enter the number = ");
        n = sc.nextInt();
        z=n;
        while ( n != 0){
            b = n%10;
            r = r*10+b;
            n = n/10;
        }
        System.out.println("Reverse of " + z + " = " + r);
        if ( r == z ){
            System.out.println(z + " is a palindrome number");
        }
        else {
            System.out.println(z + " is not a palindrome number");
        }*/
        // Solving problem 3
        /*int n,z,a,b=0,last=0,first=0;
        System.out.println("Enter the number = ");
        n = sc.nextInt();
        z=n;
        while (n != 0){
            b = n%10;
            n =n/10;
        }
        first = b;
        System.out.println("First digit is = " + first);
        last = z%10;
        System.out.println("Last digit is = " + last);
        System.out.println("\nAfter the swapping ");
        a = first;
        first = last;
        last = a;
        System.out.println("\nFirst digit is = " + first);
        System.out.println("Last digit is = " + last);*/
        // Solving problem 3
        /*int i,n,z,a,b=0,sum=0,c=0;
        System.out.print("Enter the number = ");
        n = sc.nextInt();
        z=n;
        a=n;
        while (n != 0){
            b= n%10;
            c= c+1;
            n= n/10;
        }
        System.out.println("Count of digits is = " + c);
        n=z;
        z=1;
        while (n != 0 ){
            b= n%10;
            for (i=1 ; i<=c ; i++){
                z = z*b;
            }
            sum = sum + z;
            z=1;
            n= n/10;
        }
        System.out.println("Sum of number is = " + sum );
        if ( a == sum ){
            System.out.println(a + " is  Armstrong number.");
        }
        else {
            System.out.println(a + " is not a Armstrong number.");
        }*/
    }
}
