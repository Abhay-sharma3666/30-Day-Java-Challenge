// Welcome to Day 11
// " Today, I tackled a problem involving a for StringBuffer, Method of StringBuffer. ”

/* Problem 1 : write a program to show all method of StringBuffer.
                 String is immutable(not changeable)
                  String-buffer is mutable(changeable)
 */
/* Problem 2 : write a program to check string is a palindrome or not by using StringBuffer.
 */
/* Problem 3 : write a program for sort the length of string by using StingBuffer.
 */

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Scanner;

public class Day_11_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        // Solving Problem 1
        /*StringBuffer sb = new StringBuffer("Abhay");
        System.out.println(sb);

        //string at the end of given string.
        sb.append("Sharma");
        System.out.println(sb);

        // insert string represented by str at index specified by offset in given string.
        sb.insert(5, " ");
        System.out.println(sb);

        // deletes characters from startIndex to (endIndex-1) from given string.
        sb.delete(5,12);
        System.out.println(sb);

        // replaces characters from start to (end-1) index with string represented by str in given string.
        sb.replace(0,5,"Ashok");
        System.out.println(sb);

        // Used to replace the character at given index with character represented by ch in given string.
        sb.setCharAt(3,'o');
        System.out.println(sb);

        // reverses the sequence of characters of given string.
        sb.reverse();
        System.out.println(sb);*/

        // Solving Problem 2
        /*System.out.println("Enter a word : ");
        String x = sc.nextLine();
        // Conversion from String to StringBuffer and StringBuilder.
        StringBuffer sb = new StringBuffer(x);
        sb.reverse();
        String y = sb.toString();
        if ( x.equalsIgnoreCase(y)){
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Is not a palindrome");
        }*/

        // Solving Problem 3

    }
}
