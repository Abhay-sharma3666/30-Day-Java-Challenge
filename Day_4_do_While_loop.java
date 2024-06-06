// Welcome to Day 4
// " Today, I tackled a problem involving a for do-while loop. ”

/* Problem 1 : Program that generates a random number between 1 and 25
               and asks the user to guess it. Use a do-while loop to give
               the user multiple chances until they guess the correct number.
*/
/* Problem 2 : Program that prompts the user to input a series of integers until
               the user stops by entering 0 using a do-while loop.
              Calculate and print the sum of all positive integers entered. .
*/
/* Problem 3 : To take input a number from user and generate 3 option for check
               number is prime , palindrome and Armstrong number.
 */
import java.util.Scanner;
import java.util.Random;
public class Day_4_do_While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solving Problem 1
            /*Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        int userGusess , attempts = 0;
        System.out.println("Welcome to the Guess the Number Game!");
        do {
            System.out.println("Input your guess (between 1 and 25) : ");
            userGusess = sc.nextInt();
            attempts++;

            if (userGusess == randomNumber){
                System.out.println("Congratulations! Your guessed the correct nimber in "+ attempts + " attempts.");
            }else if (userGusess < randomNumber){
                System.out.println("Number is too low. Try again!");
            }else {
                System.out.println("Number is too high. Try again");
            }
        }
        while (userGusess != randomNumber);*/
        // Solving Problem 2
            /*int num , sum=0;
        do {
            System.out.println("Input an integer (enter 0 to stop): ");
            num =sc.nextInt();
            if (num > 0){
                sum += num;
            }
            else if (num < 0) {
                System.out.println("Negative integer are not considered. Ignored.");
            }
        }
        while (num != 0);
        System.out.println("Sum of positive integers: " + sum);*/
        // Solving Problem 3
            /*int i,n,j,a,z,r=0,b=0,c=0,sum=0,ch;
            char x;
            do {
                System.out.println("Enter n = ");
                n=sc.nextInt();
                System.out.println("Press 1 for prime.\nPress 2 for Palindrome.\nPress 3 for Armstrong no.\nPress no. ==>> ");
                ch = sc.nextInt();
                if ( ch == 1){
                    for (j=1 ; j<n/2 ; j++){
                        if (n%j == 0){
                            c = c+1;
                        }
                    }
                    if (c==1){
                        System.out.println(n + " is a prime number.");
                    }
                    else {
                        System.out.println(n + " is not a prime number.");
                    }
                    c=0;
                }
                if (ch == 2){
                    z=n;
                    while(n!=0){
                        b = n%10;
                        r = r*10+b;
                        n = n/10;
                    }
                    System.out.println("Reverse of "+z+ " = " + r);
                    if (r==z){
                        System.out.println(z + " is a palindrome number");
                    }
                    else {
                        System.out.println(z + " is not a palindrome number");
                    }
                    z=0;
                    r=0;
                }
                if (ch == 3){
                    z=n;
                    a=n;
                    while (n!= 0){
                        b = n%10;
                        c = c+1;
                        n =n/10;
                    }
                    System.out.println("Count of digits is = "+ c);
                    n=z;
                    z=1;
                    while (n!=0){
                        b = n%10;
                        for (i=1 ; i<=c ; i++){
                            z = z*b;
                        }
                        sum =sum + z;
                        z =1;
                        n = n/10;
                    }
                    System.out.println("Sum of number is = "+sum);
                    if (a == sum) {
                        System.out.println(a + " is a Armstrong number.");
                    }
                    else {
                        System.out.println(a + " is not a Armstrong number.");
                    }
                    sum = 0;
                    c=0;
                    z=0;
                    a=0;
                }
                System.out.println("Press y to continue and n to end ==>> ");
                x = sc.next().charAt(0);
            }
            while (x != 'n');*/
    }
}
