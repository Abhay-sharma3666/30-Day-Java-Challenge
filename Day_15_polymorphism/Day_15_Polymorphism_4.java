/* Program 4 : To create a class Employee with a method called calculateSalary().
               Create two subclasses Manager and Programmer. In each subclass,
               override the calculateSalary() method to calculate and return the
               salary based on their specific roles.

 */
// Employee.java
// Base class Employee
class Employees {
    private String name;
    private String role;

    public Employees(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double calculateSalary() {
        return 0.0;
    }
}
// Manager.java
// Subclass Manager
class Manager1 extends Employees {
    private double baseSalary;
    private double bonus;

    public Manager1(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
// Programmer.java
// Subclass Programmer
class Programmer1 extends Employees {
    private double baseSalary;
    private double overtimePay;

    public Programmer1(String name, double baseSalary, double overtimePay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
// Main.java
// Main class
public class Day_15_Polymorphism_4 {
    public static void main(String[] args) {
        Employees emp1 = new Manager1("Lilo Heidi", 7500.0, 1500.0);
        Employees emp2 = new Programmer1("Margrit Cathrin", 5000.0, 600.0);

        System.out.println("Manager1: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        System.out.println("\nProgrammer1: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
}

