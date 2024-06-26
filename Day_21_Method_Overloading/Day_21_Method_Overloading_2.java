
/* Problem 2 : Method Overloading: changing data type of arguments.

 */
class Adderr{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
public class Day_21_Method_Overloading_2 {
    public static void main(String[] args) {
        System.out.println(Adderr.add(11,11));
        System.out.println(Adderr.add(12.3,12.6));
    }
}
