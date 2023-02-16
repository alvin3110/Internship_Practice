import java.util.Scanner;
class Calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Calculator");
    System.out.println("Enter num 1");
    double a=sc.nextDouble();
    System.out.println("Enter num 2");
    double b=sc.nextDouble();
    System.out.println("Enter operator");
    String op=sc.next();
    
    if(op.equals("+"))
    {
      double sum=a+b;
      System.out.println("Sum="+sum);
    }
    else if(op.equals("-"))
    {
      double diff=a-b;
       System.out.println("Difference="+diff);
    }
    else if(op.equals("*"))
    {
      double pro=a*b;
       System.out.println("Product="+pro);
    }
    else if(op.equals("/"))
    {
      if(b==0){
        System.out.println("error..divide by zero!!");
      }
      else
      {
        double q=a/b;
        System.out.println("Quotient="+q);
      }
    }
    else if(op.equals("%"))
    {
      if(b==0){
        System.out.println("error..divide by zero!!");
      }
      else{
        double r=a%b;
        System.out.println("Quotient="+r);
      }
    }
    else 
      System.out.println("invalid input");
  }
}

      

