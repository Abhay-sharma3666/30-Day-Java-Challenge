// Program 4
    // Write a program for find area by using constructor.
import java.util.Scanner;

class Area {
    private int length;
    private int breath;

    Area(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public int getAera() {
        System.out.print("Area of Rectangle : ");
        return length * breath;
    }

}
public class Day_13_constructor_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and Breath : ");
        Area ar = new Area(sc.nextInt(),sc.nextInt());
        System.out.print(ar.getAera());
    }
}

