
//  Welcome to Day 26
// "Today, I tackled a problem involving a Exception Handling with finally.”
/* Problem 1 : Write a java code to show the use of finally keyword and an exception does not occur.
 */

public class Day_26_Exception_Handling_4_finally {
    public static void main(String[] args) {
        try{
//below code do not throw any exception
            int data=25/5;
            System.out.println(data);
        }
//catch won't be executed
        catch(NullPointerException e){
            System.out.println(e);
        }
//executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
    }
}