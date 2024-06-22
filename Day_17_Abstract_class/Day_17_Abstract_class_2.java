
/* Problem 2 : Create an abstract class “Employee” with abstract methods “calculateSalary()” and
               “displayEmployeeDetails()”. Implement two subclasses “Manager” and “Worker” which extend “Employee”
               and implement the abstract methods. Create a “SalesPerson” class which extends “Manager” and overrides
                the necessary methods. Create objects of all classes and test their behavior.
 */
// Solving :-->
abstract class Employee7 {
    protected String name;
    protected int age;
    protected String gender;
    public Employee7(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract double calculateSalary();
    public abstract void displayEmployeeDetails();
}
class Manager10 extends Employee7 {
    protected double baseSalary;
    protected double bonus;
    public Manager10(String name, int age, String gender, double baseSalary, double bonus) {
        super(name, age, gender);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
class Worker extends Employee7 {
    protected double hourlyRate;
    protected int hoursWorked;
    public Worker(String name, int age, String gender, double hourlyRate, int hoursWorked) {
        super(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
class SalesPerson extends Manager10 {
    protected double commissionRate;
    public SalesPerson(String name, int age, String gender, double baseSalary, double bonus, double commissionRate) {
        super(name, age, gender, baseSalary, bonus);
        this.commissionRate = commissionRate;
    }
    public double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * commissionRate);
    }
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Total Salary (including commission): " + calculateSalary());
    }
}
public class Day_17_Abstract_class_2 {
    public static void main(String[] args) {
        Employee7 manager = new Manager10("John", 40, "Male", 5000, 1000);
        Employee7 worker = new Worker("Mary", 25, "Female", 20, 160);
        Employee7 salesPerson = new SalesPerson("Bob", 45, "Male", 6000, 1500, 0.05);
        manager.displayEmployeeDetails();
        System.out.println();
        worker.displayEmployeeDetails();
        System.out.println();
        salesPerson.displayEmployeeDetails();
    }
}
