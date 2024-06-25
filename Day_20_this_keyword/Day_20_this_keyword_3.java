
/* Problem 3 : this() : to invoke current class constructor
               The this() constructor call can be used to invoke the current class constructor. It is used to
               reuse the constructor. In other words, it is used for constructor chaining.

               Calling default constructor from parameterized constructor:

 */
class AA {
    AA() {
        System.out.println("hello a");
    }

    AA(int x) {
        this();
        System.out.println(x);
    }
}
public class Day_20_this_keyword_3 {
    public static void main(String[] args) {
        AA a=new AA(10);
    }
}
