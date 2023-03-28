class Employee {
    private int id;
    private String name;
    private double baseSalary;
  private double HRA,DA;

    public Employee(int id, String name, double baseSalary,double HRA,double DA) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.HRA=HRA;
       this.DA=DA;
    }
  int getId() {
        return id;
    }

     String getName() {
        return name;
    }

     double getBaseSalary() {
        return baseSalary;
    }
  double getHRA(){
    return getBaseSalary()*(HRA/100);
  }
  double getDA(){
    return getBaseSalary()*(DA/100);
  }
}


class Account extends Employee {
    private double deptsal;

    public Account(int id, String name, double baseSalary,double HRA,double DA, double deptsal) {
        super(id, name, baseSalary,HRA,DA);
        this.deptsal = deptsal;
    }

    public double calculateAccountGrossSalary() {
        return getBaseSalary() + getHRA()+getDA()+deptsal;
    }
}

class Manager extends Employee {
    private double typeofmanagersal;

    public Manager(int id, String name, double baseSalary,double HRA,double DA,double typeofmanagersal) {
        super(id, name, baseSalary,HRA,DA);
        this.typeofmanagersal = typeofmanagersal;
    }

    public double calculateManagerGrossSalary() {
        return getBaseSalary()+getHRA()+getDA()+typeofmanagersal;
    }
}

public class Empgrosssal {
    public static void main(String[] args) {
        Account acc1 = new Account(2, "Jane Smith", 60000, 10,73,2500);
        Manager mgr1 = new Manager(3, "Bob Johnson", 70000, 15,60,5000);

        System.out.println(acc1.getName() + "'s gross salary is " + acc1.calculateAccountGrossSalary());
        System.out.println(mgr1.getName() + "'s gross salary is " + mgr1.calculateManagerGrossSalary());
    }
}
