
// To Invoke Immediate Parent Class Method
class Schools {
    // Instance variables
    int id = 1;
    String name = "SSM Public School";

    void printID() {
        System.out.println("School ID: " + this.id);
    }
}

class Teachers extends Schools {

    // Instance variable in the child class
    int id = 10;

    void printSchoolName() {
        System.out.println("School Name: " + super.name);
    }
    void printID() {
        System.out.println("Teacher ID: " + this.id);
        super.printID();
    }
}

public class Day_22_Super_keyword_2 {
    public static void main(String[] args) {
        Teachers ob = new Teachers();
        ob.printID();
    }
}
