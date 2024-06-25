/* Program 5 : this: to pass as argument in the constructor call
               We can pass the this keyword in the constructor also. It is useful if we have to use one object in
               multiple classes. Let's see the example:

 */
class BB {
    A4 obj;

    BB(A4 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of A4 class
    }
}
    class A4 {
        int data = 10;

        A4() {
            BB b = new BB(this);
            b.display();
        }
    }
public class Day_20_this_keyword_5 {
    public static void main(String[] args) {
        A4 a = new A4();
    }
}

