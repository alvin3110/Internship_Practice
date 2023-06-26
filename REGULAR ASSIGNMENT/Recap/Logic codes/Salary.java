import java.util.Scanner;
class Salary{
  public static void main(String args[]){
    double basicSal,da,hra;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Basic salary");
      basicSal=sc.nextDouble();
    if(basicSal<=10000){
      da=10000*80/100;
      hra=10000*20/100;
    }
    else if(basicSal<=20000){
      da=20000*90/100;
      hra=20000*25/100;
    }
    else{
      da=20000*95/100;
      hra=20000*30/100;
    }
    double GrossSalary=basicSal+hra+da;
    System.out.println("Gross Salary:"+GrossSalary);
  }
}