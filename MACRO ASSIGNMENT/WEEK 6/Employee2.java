import java.util.Scanner;
class Employee {
    private int eid;
    private String ename;
    private String esalary;

    public void setEid(int eid) {
        
        this.eid = eid;
    }

    public void setEname(String ename) {
        if (ename.length() < 5) {
            System.out.println("Employee name must be at least 5 characters long");
            return;
        }
        this.ename = ename;
    }

    public void setEsalary(String esalary) {
        if (esalary.length() < 5 || esalary.length() > 10) {
            System.out.println("Invalid salary: " + esalary);
            return;
        }
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getEsalary() {
        return esalary;
    }
}

class EmployeeArray {
    private Employee[] employees;
    private int nextIndex;

    public EmployeeArray(int size) {
        employees = new Employee[size];
        nextIndex = 0;
    }

    public void addEmployee(Employee employee) {
        if (nextIndex == employees.length) {
            System.out.println("Array is full, cannot add employee");
            return;
        }
        employees[nextIndex] = employee;
        nextIndex++;
    }

    public void display() {
        for (int i = 0; i < nextIndex; i++) {
            System.out.println("Employee ID: " + employees[i].getEid() + " " +
                    "Employee Name: " + employees[i].getEname() + " " +
                    "Employee Salary: " + employees[i].getEsalary());
        }
    }
}



public class Employee2 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeArray employeeArray = new EmployeeArray(3);
        for (int i = 0; i < 3; i++) {
            Employee employee = new Employee();

            // Collect employee ID
          while(true){
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            if (id < 100000 || id > 999999) {
            System.out.println("Invalid employee ID: " + id);
              id = scanner.nextInt();
            }
            else
            {
              employee.setEid(id);
              break;
            }
        }
            

            // Collect employee name
            System.out.print("Enter employee name: ");
            String name = scanner.next();
            employee.setEname(name);

            // Collect employee salary
            System.out.print("Enter employee salary: ");
            String salary = scanner.next();
            employee.setEsalary(salary);

            employeeArray.addEmployee(employee);
        }

        employeeArray.display();
    }
}



