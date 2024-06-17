
/* Problem 3 : Write a program to check the prime no. by class and object
 */
import java.util.Scanner;

class p{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void getPRIME(){
        int c =0;
        for(int i=1 ; i<=a/2 ; i= i+1)
        {
            if(a%i == 0)
            {
                System.out.println(i);
                c = c +1;
            }
        }
        System.out.println("count is = "+ c);
        if(c==1)
        {
            System.out.println("Number "+ a +" is a prime number");
        }
        else{System.out.println("Number "+ a +" is not a prime number");}
    }
}


public class Day_12_Class_and_object_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p P = new p();

        System.out.print("Enter any number : ");
        P.setA(sc.nextInt());
        P.getPRIME();
    }
}
