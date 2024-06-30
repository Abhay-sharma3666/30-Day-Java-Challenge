
/* Problem 3 : Write a program to show multiple try and catch
 */

public class Day_25_Execption_Handling_3_try {
    public static void main(String[] args) {
        int a=5,c=0;
        String b = "Abhay";
        try{
            System.out.println(a/c);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Your array size is different in same object \n it can't allow");
        }catch (NumberFormatException ex){
            System.out.println("We can't convert the String to int. ");
        }catch(ArithmeticException ex){
            System.out.println("any number is not divide by zero");
        }
        catch (Exception ex){
            System.out.println("Your input is wrong");
        }
    }
}