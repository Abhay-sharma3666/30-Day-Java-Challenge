// Welcome to Day 22
//// "Today, I tackled a problem involving a super keyword.”
/* Program 1 : To Refer Immediate Parent Class Instance Variable
 */

// Parent class
class School {
    // Instance variables
    int id;
    String name = "SSM Public School";
}
class Teacher extends School {
    // Instance variable in the child class
    int id;
    String name;
    void printSchoolName() {
        // Using super.name, we can access the name variable of the parent class
        // Using this.name, we can access the name variable of the child class
        System.out.println("School Name: " + super.name);
    }
}
public class Day_22_Super_keyword_1 {
    public static void main(String[] args) {
        Teacher ob = new Teacher();
        ob.printSchoolName();
    }
}
