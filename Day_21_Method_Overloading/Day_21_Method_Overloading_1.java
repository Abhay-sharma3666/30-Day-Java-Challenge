
//  Welcome to Day 21
// "Today, I tackled a problem involving a Method Overloading.”
/* Problem 1 : Method Overloading: changing no. of arguments

 */
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
public class Day_21_Method_Overloading_1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
