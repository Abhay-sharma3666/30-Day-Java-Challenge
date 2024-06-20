
/* Problem 5 : Write a Java program to create a class known as Person with
               methods called getFirstName() and getLastName().Create a
               subclass called Employee that adds a new method named
               getEmployeeId() and overrides the getLastName() method
               to include the employee's job title.
 */
// Person.java
// Parent class Person

class Person1 {
    private String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
// Employee.java
// Child class Employee
class Employee2 extends Person1 {
    private int employeeId;
    private String jobTitle;

    public Employee2(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
// Main.java
// Main class
public class Day_14_Inheritance_5 {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
        Employee2 employee2 = new Employee2("Junior", "Philipa", 4452, "Software Manager");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}
