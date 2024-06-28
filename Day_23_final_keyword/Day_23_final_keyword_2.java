
/* Program 2 : Write a program using final keyword with class.
 */
class A extends Car2{
    void run1()
    {System.out.println("running safely with 100kmph");}
}
public class Day_23_final_keyword_2 {
    public static void main(String[] args) {
        A honda= new A();
        honda.run1();
    }
}
