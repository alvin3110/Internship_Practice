import java.util.Scanner;

class Salarycal
{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Salary: ");
      double s = sc.nextDouble();
      double as = s*12;
      System.out.println("Annual Salary:"+as);
      double t=0;
      if (as <= 300000)
        t=0;
      else if (as >300000 && as<= 600000)
        t=0.05*as;
      else if (as >600000 && as<= 900000)
         t=0.1*as;
      else if(as >900000 && as<= 1200000)
        t=0.15*as;
      else if(as >1200000 && as<= 1500000)
        t=0.2*as;
      else if(as >1500000)
        t=0.3*as;
      double ns = as-t;
      System.out.println("Tax: " + t);
      System.out.println("Net Salary: " + ns);
    }
}