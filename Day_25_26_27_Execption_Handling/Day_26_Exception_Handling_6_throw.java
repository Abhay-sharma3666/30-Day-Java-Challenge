
/* Problem 3 : Write a java code to show the use of Throwing Unchecked Exception
 */
class TestThrow1 {
    //function to check if person is eligible to vote or not
    public static void validate(int age) {
        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
    public class Day_26_Exception_Handling_6_throw {
    public static void main(String[] args) {
        TestThrow1 tt = new TestThrow1();
        //calling the function
        tt.validate(13);
        System.out.println("rest of the code...");
    }
}