
/* Problem 2 : Write a program for find the area of rectangle by class and object.
 */
import java.util.Scanner;

class area{
    private int length;
    private int breath;
    public void setvalue (int length,int breath){
        this.length =length;
        this.breath =breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
    public int getAera(){
        System.out.print("Area of Rectangle : ");
        return length*breath;
    }

}
public class Day_12_Class_and_object_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area ar = new area();

        System.out.print("Enter Length and Breath : ");
        ar.setvalue(sc.nextInt(),sc.nextInt());

        System.out.print(ar.getAera());
    }
}
