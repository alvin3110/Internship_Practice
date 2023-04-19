import java.util.ArrayList;
import java.util.Scanner;
class Employee {
  private int id;
  private String name;
  private String address;
  private String profession;
  private double salary;
  
  public Employee(int id, String name, String address, String profession, double salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.profession = profession;
    this.salary = salary;
  }
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getAddress() {
    return address;
  }
  public String getProfession() {
    return profession;
  }
  public double getSalary() {
    return salary;
  }
  
  public void setSalary(double salary) {
    this.salary = salary;
  }
  class NameNotFoundException extends Exception {
    public NameNotFoundException(String message) {
      super(message);
    }
  }
}

class Employeelist {
    private ArrayList<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();

        System.out.print("Enter employee profession: ");
        String profession = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, address, profession, salary);
        employees.add(employee);

        System.out.println("Employee added: " + employee.getId());
    }

    public void updateSalary() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.print("Enter new salary: ");
        double salary = scanner.nextDouble();

        employee.setSalary(salary);
        System.out.println("Salary updated: " + employee);
    }

    public void removeEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        Employee employee = findEmployeeById(id);
        if (employee == null) {
            try {
                throw new NameNotFoundException("Employee not found!");
            } catch (NameNotFoundException e) {
                System.out.println(e.getMessage());
            }
            return;
        }

        employees.remove(employee);
        System.out.println("Employee removed: " + employee.toString());
    }

    public void searchNameById() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        Employee employee = findEmployeeById(id);
        if (employee == null) {
            try {
                throw new NameNotFoundException("Employee not found!");
            } catch (NameNotFoundException e) {
                System.out.println(e.getMessage());
            }
            return;
        }

        System.out.println("Employee found: " + employee.getName());
    }

    private Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public static class NameNotFoundException extends Exception {
        public NameNotFoundException(String message) {
            super(message);
        }
    }
}


public class Employeemain {
  public static void main(String[] args) {
    Employeelist employeeManager = new Employeelist();
    Scanner sc = new Scanner(System.in);

    int choice = 0;
    do {
        System.out.println("Employee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Salary");
        System.out.println("3. Remove Employee");
        System.out.println("4. Search by ID");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                employeeManager.addEmployee();
                break;
            case 2:
                employeeManager.updateSalary();
                break;
            case 3:
                employeeManager.removeEmployee();
                break;
            case 4:
                employeeManager.searchNameById();
                break;
            case 5:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    } while (choice != 5);
}

}
      
    
           
