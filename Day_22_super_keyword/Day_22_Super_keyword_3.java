
// program 3 : To Invoke Immediate Parent Class Constructor
// Base class Person
class Persons{
    Persons() {
        System.out.println("Person class Constructor");
    }
}
// Derived class Teacher
class Teacher1 extends Persons {
    Teacher1() {
        // Invoke the parent class constructor
        super();
        System.out.println("Teacher class Constructor");
    }
}
public class Day_22_Super_keyword_3 {
    public static void main(String[] args) {
        // Invoke the constructor of the Teacher class
        Teacher1 s = new Teacher1();
    }
}
