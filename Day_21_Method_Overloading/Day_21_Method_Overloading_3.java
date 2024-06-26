/* Program 3 : Overloading a method by changing the order of arguments
 */
class StudentDetails{
    public void student(String name, int rollno)
    {
        System.out.println("Name :" + name + " " + "Roll No :" + rollno);
    }
    public void student(int rollno, String name)
    {
        System.out.println("RollNo :" + rollno + " " + "Name :" + name);
    }
}
public class Day_21_Method_Overloading_3 {
    public static void main(String[] args) {
        StudentDetails obj = new StudentDetails();
        obj.student("Sakthi", 1);
        obj.student(2, "Nivetha");
    }
}