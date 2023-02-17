import java.util.Scanner;
class Performance{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Salary");
    int sal=sc.nextInt();
    System.out.println("Select your performance rating:");
    System.out.println("1 FOR EXCELLENT");
    System.out.println("2 FOR GOOD");
    System.out.println("3 FOR AVERAGE");
    System.out.println("4 FOR POOR");
    int p=sc.nextInt();
    double b=0;
    if(p==1)
    {
      b=0.1*sal;
      System.out.println("Bonus:"+b);
    }
    else if(p==2)
    {
      b=0.05*sal;
      System.out.println("Bonus:"+b);
    }
    else if(p==3)
    {
      b=0.02*sal;
      System.out.println("Bonus:"+b);
    }
    else if(p==4)
    {
      System.out.println("No Bonus:");
    }
    else
      System.out.println("Invalid input");
  }
}
