
interface Employee 
{
  public void calculateSalary();
  public void displayEmployeeDetails();
}
class Manager implements Employee {
  private String name;
  private int age;
  private String designation;
  private double salary;
  
  public Manager(String name, int age, double salary)
  {
    this.name = name;
    this.age = age;
    this.designation = "Manager";
    this.salary = salary;
  }
  public void calculateSalary()
  {
    this.salary = this.salary + (this.salary * 0.2); 
  }
  public void displayEmployeeDetails() 
  {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Designation: " + this.designation);
    System.out.println("Salary: " + this.salary);
  }
}
class Developer implements Employee
  {
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    public Developer(String name, int age, double salary) {
      this.name = name;
      this.age = age;
      this.designation = "Developer";
      this.salary = salary;
    }
    
   public void calculateSalary() {
     this.salary = this.salary + (this.salary * 0.1); 
    }
    
   
    public void displayEmployeeDetails() {
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Designation: " + this.designation);
      System.out.println("Salary: " + this.salary);
    }
}

class Tester implements Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    public Tester(String name, int age, double salary) {
      this.name = name;
      this.age = age;
      this.designation = "Tester";
      this.salary = salary;
    }
  public void calculateSalary() {
    this.salary = this.salary + (this.salary * 0.15); 
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}
public class Employeemain {
  public static void main(String[] args) {
    String name = "Alvin";
    int age = 22;
    String designation = "Developer";
    double salary = 50000;
    Employee employee;
    switch (designation.toLowerCase()) {
      case "manager":
        employee = new Manager(name, age, salary);
        break;
      case "developer":
        employee = new Developer(name, age, salary);
        break;
      case "tester":
        employee = new Tester(name, age, salary);
        break;
      default:
        System.out.println("Invalid designation!");
        return;
    }
    employee.calculateSalary();
    employee.displayEmployeeDetails();
  }
}
