//  Welcome to Day 23
// "Today, I tackled a problem involving a final keyword.”
/* Problem 1 :Write a program using final keyword in variable.
 */
class Car2{
    final int speedlimit=90;//final variable
    void run(){
//         speedlimit=400;   error
    }
}
public class Day_23_final_keyword_1 {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.run();
    }
}
