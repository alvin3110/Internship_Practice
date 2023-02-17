import java.util.Random;  
import java.util.Scanner;
class Multiservice{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random = new Random(); 
    System.out.println("Welcome ");
    System.out.println(" 1.Calculator \n 2.Converter \n 3.Random number \n 4.Quit \n");
    System.out.println("Enter your Choice");
    int choice=sc.nextInt();
    if(choice==1)
    {
      int num1,num2;
      double result=0;
      char operator;
      num1=random.nextInt(100);
      num2=random.nextInt(100);
      System.out.println("choose operations");
      System.out.println(" a:addition \n b:subtraction \n c:multiplication \n d:division \n e:remainder ");
      operator=sc.next().charAt(0);
      switch(operator)
      {
        case 'a':
          result=num1+num2;
          break;
        case 'b':
          result=num1-num2;
          break;
        case 'd':
          result=num1*num2;
          break;
        case 'e':
          if(num2==0)
            System.out.println("divide by zero ERROR");
          else
            result=num1/num2;
          break;
        case 'f':
          if(num2==0)
             System.out.println("divide by zero ERROR");
          else
            result=num1%num2;
          break;
        default:System.out.println("invalid operation");
      }
      System.out.println("Num 1="+num1+"\nNum 2="+num2);
      System.out.println("Result="+result);
    }
    else if(choice==2)
    {
      int Input=random.nextInt(500); 
      System.out.println("Convert to:");
      System.out.println("a.Celcius to Fahrenheit");
      System.out.println("b.Enter Fahrenheit to Celcius");
      System.out.println("c.Kilometers to Miles");
      System.out.println("d.Kilometers to Miles");
      String Convert=sc.next();
      double C,F,Kms,mil;
      if(Convert.equals("a"))
      {
        F=((Input*9)/5)+32;
        System.out.println(Input+"°C="+F+"°F");
      }
      else if(Convert.equals("b"))
      {
        C=((Input-32)*5)/9 ;
        System.out.println(Input+"°F="+C+"°C");
      }
      else if(Convert.equals("c"))
      {
        mil=1.609*Input;
        System.out.println(Input+"Kms="+mil+"miles");
      }
      else if(Convert.equals("d"))
      {
        Kms=0.621*Input;
        System.out.println(Input+"miles="+Kms+"kms");
      }
      else 
        System.out.println("Invalid choice");
    }
    else if(choice==3)
    {
      int num=random.nextInt(100);
      System.out.println("Number="+num);
    }
    else if(choice==4)
      System.out.println("THANK YOU");
    else
      System.out.println("Invalid choice");
  }
}
    
    