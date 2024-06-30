
/* Problem 2 : Write a program to buy pass the error of index out of bound and number format exception.

 */
public class Day_25_Execption_Handling_2_try {
    public static void main(String[] args) {
        int [] x = new int[5];
        try{
            System.out.println(x[7]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Your array size is different in same object \n it can't allow");
        }
        try{
            int a = Integer.parseInt("Ashok");  // parseInt convert string element(only number) to int .
        }catch (NumberFormatException ex){
            System.out.println("We can't convert the String to int. ");
        }
    }
}