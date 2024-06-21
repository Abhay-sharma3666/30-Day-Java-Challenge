

/* Problem 4: To create a class called Employee with private instance variables
              employee_id, employee_name, and employee_salary. Provide public
              getter and setter methods to access and modify the id and name
              variables, but provide a getter method for the salary variable that
              returns a formatted string.
 */


// Solving :-->

class Employee4 {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employee_salary = employeeSalary;
    }

    public String getFormattedSalary() {
        return String.format("$%.2f", employee_salary);
    }
}

public class Day_16_Encapsulation_4 {
    public static void main(String[] args) {
        // Create an instance of Employee4
        Employee4 employee = new Employee4();

        // Set values using setter methods
        employee.setEmployeeId(15);
        employee.setEmployeeName("Caelius Dathan");
        employee.setEmployeeSalary(4900.0);

        // Get values using getter methods
        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();

        // Print the values
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}
