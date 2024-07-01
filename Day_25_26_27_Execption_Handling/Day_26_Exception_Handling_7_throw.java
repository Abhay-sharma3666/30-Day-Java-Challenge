
/* Problem 4 : Write a java code to show the use of Throwing Checked Exception.
 */

import java.io.*;
class TestThrow2 {
    //function to check if person is eligible to vote or not
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }
}
public class Day_26_Exception_Handling_7_throw {
    public static void main(String[] args) {
        TestThrow2 tt2 = new TestThrow2();
        try
        {
            tt2.method();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}