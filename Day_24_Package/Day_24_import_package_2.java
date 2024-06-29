
/* Problem 2 : Write a JAVA program that import and use the package Student.

 */
import pack.Student;
public class Day_24_import_package_2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.set(9584535,"Abhay");
        System.out.println(s.getMobile_no()+" "+s.getName());
    }
}