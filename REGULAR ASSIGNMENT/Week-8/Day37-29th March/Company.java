import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    private String name;
    private int employeeNumber;
    private String designation;
    private double salary;

    Employee(String name, int employeeNumber, String designation, double salary) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}
class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the details of employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Employee Number: ");
            int employeeNumber = sc.nextInt();
            System.out.print("Designation: ");
            String designation = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(name, employeeNumber, designation, salary));
        }
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee Number: " + employee.getEmployeeNumber());
            System.out.println("Designation: " + employee.getDesignation());
            System.out.println("Salary: $" + employee.getSalary());
            System.out.println();
        }
      
    }
}