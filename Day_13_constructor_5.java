// Program 5
// Write a program for check a number is a prime number or not by using constructor.
import java.util.Scanner;

class constructor_prime {
    private int a;

    public int getA() {
        return a;
    }

    constructor_prime(int a) {
        this.a = a;
    }

    public void getPRIME() {
        int c = 0;
        for (int i = 1; i <= a / 2; i = i + 1) {
            if (a % i == 0) {
                System.out.println(i);
                c = c + 1;
            }
        }
        if (c == 1) {
            System.out.println("Number " + a + " is a prime number.");
        }
        else {
            System.out.println("Number " + a + " is not a prime number.");
        }
    }

}
public class Day_13_constructor_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        constructor_prime P = new constructor_prime(sc.nextInt());
        P.getPRIME();
    }
}

