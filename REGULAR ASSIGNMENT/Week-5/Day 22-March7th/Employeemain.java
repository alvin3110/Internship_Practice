import java.util.*;

class Employee {
  String empid;
  String empname;
  String empAddress;
  double salary, HRA, DA, GS, incometax, netsalary;

  public void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter employee id");
    empid = sc.next();
    System.out.println("enter employee name");
    empname = sc.next();
    System.out.println("Enter the basic salary of an employee");
    salary = sc.nextInt();
  }

  public void calculate() {
    HRA = 0.1* salary;
    DA = 0.73 * salary;
    GS = salary + DA + HRA;
    incometax = 0.3*salary;
    netsalary = GS - incometax;
  }

  public void display() {
    System.out.println("employee id:" + empid);
    System.out.println("employee name:" + empname);
    System.out.println("employee salary:" + salary);
    System.out.println("HRA:" + HRA);
    System.out.println("DA:" + DA);
    System.out.println("GS:" + GS);
    System.out.println("Income tax:" + incometax);
    System.out.println("Employee net salary " + netsalary);
  }
}

class Employeemain {
  public static void main(String args[]) {
    int n=sc.nextInt();
    Employee emp[] = new Employee[n];
    for(int i=0;i<n;i++)
    {
      emp[i] = new Employee();
      emp[i].read();
      emp[i].display();
    }
}
}