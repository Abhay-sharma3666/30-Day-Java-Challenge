// Program 3
    /* Write a program for Entering the details of student like
        (Rollno, Name, Marks or percentage) by using constructor.*/
import java.util.Scanner;

class student {
    private int Rollno, Marks;
    private String Name;

    student(int Rollno, String Name, int Marks) {
        this.Rollno = Rollno;
        this.Name = Name;
        this.Marks = Marks ;
    }

    public int getRollno() {
        return Rollno;
    }

    public String getName() {
        return Name;
    }

    public int getMarks() {
        return Marks;
    }

}
public class Day_13_constructor_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of e1 (Rollno , Name , Marks) : ");
        student e1 = new student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.print("Enter value of e2 (Rollno , Name , Marks) : ");
        student e2 = new student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.print("Enter value of e3 (Rollno , Name , Marks) : ");
        student e3 = new student(sc.nextInt(),sc.next(),sc.nextInt());
        System.out.print("Enter value of e4 (Rollno , Name , Marks) : ");
        student e4 = new student(sc.nextInt(),sc.next(),sc.nextInt());

        System.out.println("Your data is stored : ");
        System.out.println(e1.getRollno()+"\t"+e1.getName()+"\t"+e1.getMarks());
        System.out.println(e2.getRollno()+"\t"+e2.getName()+"\t"+e2.getMarks());
        System.out.println(e3.getRollno()+"\t"+e3.getName()+"\t"+e3.getMarks());
        System.out.println(e4.getRollno()+"\t"+e4.getName()+"\t"+e4.getMarks());
    }
}


