
//  Welcome to Day 1
// "Today, I tackled a problem involving a for loop.”
/* Problem 1 : print pattern     1
                                12
                               123
                              1234
                             12345
*/
/* Problem 2 : print pattern     1
                                121
                               12321
                              1234321
                             123454321
*/
/* Problem 3 : print pattern     * * * * *
                                 *       *
                                 *       *
                                 *       *
                                 * * * * *
*/
/* Problem 4 : print pattern     *
                                ***
                               *****
                             ********
                            ***********
                             ********
                              ******
                               ***
                                *
*/
/* Problem 5 : print factorial (example = 5! = 5*4*3*2*1 = 120)
*/
import java.util.Scanner;
public class Day_1_For_loop {
    public static void main(String[] args) {
        // Solving Problem 1
        /*for (int i=1 ; i<=5 ; i++){
            for (int j=5 ; j>i ; j--){
                System.out.print(" ");

            }
            for (int k=1 ; k<=i ;k++){
                System.out.print(k);
            }
            System.out.println();
        }*/
        // Solving Problem 2
        /*for (int i=1 ; i<=5 ; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
                }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
                }
            for (int l=i-1 ;l>=1 ; l--){
                System.out.print(l);
                }
           System.out.println();
          }*/
        // Solving Problem 3
        /*for (int i=1 ;i<=5 ; i++ ){
            for ( int j=1 ;j<=5 ;j++ ){
                if ( i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //  Solving Problem 4
        /*for (int i=1 ; i<= 5 ;i++){
            for (int j =5 ; j > i ; j--){
                System.out.print(" ");
            }
            for (int k=1 ;k <=2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5-1 ; i>= 1 ; i--){
            for (int j = 5 ;j>i ; j--){
                System.out.print(" ");
            }
            for (int k=1 ; k<=2*i-1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        // Solving Problem 5
        /*Scanner sc =new Scanner(System.in);
        int n;
        int f=1;
        System.out.println("Enter any number for finding factorial = ");
        n = sc.nextInt();
        for (int i=n ; i>=1 ; i--){
            f = f*i;
        }
        System.out.println("Factorial of "+n+" is = "+ f);
        f=1;*/
    }
}
