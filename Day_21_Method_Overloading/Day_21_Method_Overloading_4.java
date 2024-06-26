
/* Program 4 : Can we Overload static methods in Java.

 */
class StaticMethodExample {
    public static void disp() {
        System.out.println("StaticMethodExample .disp() called ");
    }

    public static void disp(int a) {
        System.out.println("StaticMethodExample .disp(int) called ");
    }
}
public class Day_21_Method_Overloading_4 {
    public static void main(String[] args) {
        StaticMethodExample .disp();
        StaticMethodExample .disp(10);
    }
}
