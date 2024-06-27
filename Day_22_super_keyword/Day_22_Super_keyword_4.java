
class Birds {

    int age;
    Birds(int age) {
        this.age = age;
        System.out.println("Birds class constructor invoked!");
    }
}

class Parrot extends Birds {
    String name;
    Parrot(String name, int age) {
        super(age);
        this.name = name;
        System.out.println("Parrot class constructor invoked!");
    }
    void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class Day_22_Super_keyword_4 {
    public static void main(String[] args) {
        Parrot ob = new Parrot("Teepee", 5);
        ob.printDetails();
    }
}
