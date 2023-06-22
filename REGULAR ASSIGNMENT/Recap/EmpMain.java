//Create an abstract class called Employee with the following private attributes:
//String name: Represents the name of the employee.int employeeId: Represents the unique employee ID.double salary: Represents the salary of the employee.

//Implement the Payslip interface with the following methods:
//double calculateSalary(): Calculates and returns the monthly salary of the employee.
//void generatePayslip(): Prints the employee's payslip, including their name, employee ID, and monthly salary.

interface PaySlip {
    double calculateSalary();
    void generatePayslip();
}

class PaySlipImplements extends Employee implements PaySlip {
    public double calculateSalary() {
        return getSalary();
    }

    public void generatePayslip() {
        System.out.println("Employee payslip details");
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Monthly Salary: " + getSalary());
    }
}

abstract class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class PermanentEmployee extends Employee implements PaySlip{
  int yearsOfService;

  public int getYearsOfService() {
	  return yearsOfService;
  }

  public void setYearsOfService(int yearsOfService) {
	  this.yearsOfService = yearsOfService;
  }
  public double calculateSalary(){
    if(yearsOfService < 5){
      return (getSalary()*(0.5)+getSalary());
    }
    else 
      return (getSalary()*(0.7)+getSalary());
  }
  public void generatePayslip(){
    System.out.println("employee details:\nemployee name = "+getName()+"\nemployee salary = "+getSalary()+"\nEmployee id = "+getId());
  }
}

public class EmpMain {
    public static void main(String[] args) {
      PaySlipImplements emp1 = new PaySlipImplements();
      PaySlipImplements payslip = emp1;
      
      emp1.setName("Alvin K Sebastian");
      emp1.setEmployeeId(31);
      emp1.setSalary(25000);

      System.out.println(payslip.calculateSalary());
      payslip.generatePayslip();

      PermanentEmployee p=new PermanentEmployee();
      p.setId(1001);
      p.setName("rishab");
      p.setSalary(30000);
      p.setYearsOfService(10);
      System.out.println(p.calculateSalary());
      p.generatePayslip();
    

    }
}
