

/* Problem 2 : Write a java program to take input form user and entering wrong input show user define exception.
 */

import java.util.Scanner;

public class Day_27_Exception_handling_9_throws extends Exception {
    public String toString (){
        return "Marks is not between 1 to 100";
    }
    public static void main(String[] args) throws Day_27_Exception_handling_9_throws {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks between 1 to 100 : ");
        int a = sc.nextInt();
        if (a>=1 && a<=100){
            System.out.println(a);
        }else throw new Day_27_Exception_handling_9_throws();
    }
}