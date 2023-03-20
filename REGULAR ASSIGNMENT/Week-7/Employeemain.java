import java.util.*;

class Employee {
  String empid;
  String empname;
  double Salary;
  void setempid(String empid){
    this.empid=empid;
  }
  void setempname(String empname){
    this.empname=empname;
  }
  void setSalary(double Salary){
    this.Salary=Salary;
  }
  String getempid()
  {
    return empid;
  }
  String getempname()
  {
    return empname;
  }
  double getSalary()
  {
    return Salary;
  }
}
  class Employeemain {
  public static void main(String args[]) {
    int n=sc.nextInt();
    Employee emp[] = new Employee[n];
    for(int i=0;i<n;i++)
    {
      emp[i] = new Employee();
      emp[i].setempid(sc.next());
      emp[i].setempname(sc.next());;
      emp[i].setSalary(sc.nextDouble());
    }
    for(int i=0;i<n;i++){
      System.out.println("Employee id:"+emp[i].getempid());
       System.out.println("Employee id:"+emp[i].getempname());
      System.out.println("Employee id:"+emp[i].getSalary());
    }
}
}