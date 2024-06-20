
// Welcome to Day 12
// " Today, I tackled a problem involving a for Class and Objet. ”

/* Problem 1 : Write a program to take input from user (is,name,dep,mobile,salary) using class and object.
 */

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String dep;
    private long mobile;
    private float salary;
    public void setData(int id, String name, String dep, long mobile, float salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.mobile = mobile;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public long getMobile() {
        return mobile;
    }

    public float getSalary() {
        return salary;
    }
}
public class Day_12_Class_and_object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println("Enter data for Employee 1 (ID, Name, Department, Mobile, Salary):");
        e1.setData(sc.nextInt(), sc.next(), sc.next(), sc.nextLong(), sc.nextFloat());

        System.out.println("Enter data for Employee 2 (ID, Name, Department, Mobile, Salary):");
        e2.setData(sc.nextInt(), sc.next(), sc.next(), sc.nextLong(), sc.nextFloat());

        System.out.println("Enter data for Employee 3 (ID, Name, Department, Mobile, Salary):");
        e3.setData(sc.nextInt(), sc.next(), sc.next(), sc.nextLong(), sc.nextFloat() );

        if (e1.getSalary() > e2.getSalary() && e1.getSalary() > e3.getSalary()) {
            System.out.println("Highest salary belongs to Employee 1: " + e1.getName());
        } else if (e2.getSalary() > e1.getSalary() && e2.getSalary() > e3.getSalary()) {
            System.out.println("Highest salary belongs to Employee 2: " + e2.getName());
        } else {
            System.out.println("Highest salary belongs to Employee 3: " + e3.getName());
        }
    }
}
