
//  Welcome to Day 26
// "Today, I tackled a problem involving a Exception Handling with finally.”
/* Problem 1 : Write a java code to show the use of Throwing User-defined Exception.
 */
// class represents user-defined exception
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
        super(str);
    }
}
public class Day_27_Exception_handling_8_user_define {
    public static void main(String[] args) {
        try
        {
            // throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}