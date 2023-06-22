import java.util.HashSet;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

class EmployeeManagementSystem {
    private HashSet<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee searchEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void printEmployees() {
        System.out.println("Remaining Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() +
                    ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() +
                    ", Salary: " + employee.getSalary());
        }
    }
}

public class EmployeeHashset {
    public static void main(String[] args) {
        EmployeeManagementSystem empManagementSystem = new EmployeeManagementSystem();

        
        Employee emp1 = new Employee(1, "John", "IT", 5000.0);
        Employee emp2 = new Employee(2, "Jane", "HR", 4000.0);
        Employee emp3 = new Employee(3, "Mike", "Sales", 4500.0);
        Employee emp4 = new Employee(4, "Lisa", "Marketing", 5500.0);
        Employee emp5 = new Employee(5, "Tom", "Finance", 6000.0);

        // Adding employees to the management system
        empManagementSystem.addEmployee(emp1);
        empManagementSystem.addEmployee(emp2);
        empManagementSystem.addEmployee(emp3);
        empManagementSystem.addEmployee(emp4);
        empManagementSystem.addEmployee(emp5);

        // Searching for an employee by ID
        int searchId = 3;
        Employee searchedEmployee = empManagementSystem.searchEmployee(searchId);
        if (searchedEmployee != null) {
            System.out.println("Employee found:");
            System.out.println("ID: " + searchedEmployee.getId() +
                    ", Name: " + searchedEmployee.getName() +
                    ", Department: " + searchedEmployee.getDepartment() +
                    ", Salary: " + searchedEmployee.getSalary());
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        // Deleting an employee by ID
        int deleteId = 2;
        empManagementSystem.deleteEmployee(deleteId);

        // Printing the remaining employees
        empManagementSystem.printEmployees();
    }
}
