
/* Problem 2 : Write a java code to show the use of finally keyword and an exception
               occurr but not handled by the catch block.
 */

public class Day_26_Exception_Handling_5_finally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block");
            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }
        //cannot handle Arithmetic type exception
        //can only accept Null Pointer type exception
        catch(NullPointerException e){
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}