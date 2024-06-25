
/* Program 6 :  this keyword can be used to return current class instance
                We can return this keyword as an statement from the method. In such case, return type of the method
                must be the class type (non-primitive). Let's see the example:
 */
class AAA{
    AAA getAAA(){
        return this;
    }
    void msg(){
        System.out.println("Hello java");
    }
}
public class Day_20_this_keyword_6 {
    public static void main(String[] args) {
        new AAA().getAAA().msg();
    }
}
