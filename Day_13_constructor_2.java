// Program 2
    // Write a program to print name and age by using constructor
class Person {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age ;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Day_13_constructor_2 {
    public static void main(String[] args) {
        // Creating an instance of Person using the constructor
        Person person1 = new Person("John Doe", 25);

        // Displaying information using the displayInfo method
        person1.displayInfo();
    }
}

