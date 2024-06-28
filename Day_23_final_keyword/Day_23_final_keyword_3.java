
/* Program 3: Write a program using final keyword with method.
 */
class Bike{
    final void run(){System.out.println("running");}
}

class Honda extends Bike {
//    void run(){System.out.println("running safely with 100kmph");}   //error show
}
public class Day_23_final_keyword_3 {
    public static void main(String[] args) {
        Honda honda= new Honda();
        honda.run();
    }
}
