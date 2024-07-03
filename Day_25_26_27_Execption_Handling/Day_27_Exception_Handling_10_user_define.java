import java.util.Scanner;

/* Problem 3 : Write a java program to taking balance input and balance can't be negative and show the
               user define exception when balance is negative.
 */
public class Day_27_Exception_Handling_10_user_define extends Exception{
    public String toString (){
        return "Balance can't be negative";
    }
    public static void main(String[] args) throws Day_27_Exception_handling_9_throws{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int a = sc.nextInt();
        if (a>=0){
            System.out.println("Your balance is : "+ a );
        }else throw new Day_27_Exception_handling_9_throws();
    }
}