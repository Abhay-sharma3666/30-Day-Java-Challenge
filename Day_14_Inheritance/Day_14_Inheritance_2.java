
/* Program 2 : Write a Java program to create a class called Employee
               with methods called work() and getSalary(). Create a
               subclass called HRManager that overrides the work()
               method and adds a new method called addEmployee().
*/
// Employee1.java
// Parent class Employee
class Employee1 {
    private int salary;

    public Employee1(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}
// HRManager.java
// Child class HRManager
class HRManager extends Employee1 {
    public HRManager(int salary) {
        super(salary);
    }
    public void work() {
        System.out.println("\nManaging employees");
    }
    public void addEmployee() {
        System.out.println("\nAdding new employee!");
    }
}
// Main.java
// Main class
public class Day_14_Inheritance_2 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(40000);
        HRManager mgr = new HRManager(70000);
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());
        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}
