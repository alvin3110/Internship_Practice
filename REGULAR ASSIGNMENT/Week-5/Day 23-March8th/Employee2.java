import java.util.Scanner;
class Employee{
  int eid;
  String name;
  double salary;
  Employee(int id,String n,double sal){
    eid=id;
    name=n;
    salary=sal;
  }
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }
  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
}
public class Employee2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of employees");
    int n=sc.nextInt();
    Employee emp[]=new Employee[n];
    for(int i=1;i<n;i++)
    {
      System.out.println("enter employee " +i+ " information");
      emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
    }
     for(int i=1;i<n;i++){
       System.out.println("********Employee "+i+" Information*********");
       emp[i].display();
       System.out.println("Enter HRA and DA");
       emp[i].grossSalary(sc.nextDouble(),sc.nextDouble());
     }
  }
}