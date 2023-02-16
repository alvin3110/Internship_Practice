//Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.
import java.util.Scanner;
class Temperature{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Temperature");
    double Input=sc.nextDouble(); 
    System.out.println("Convert to:");
    System.out.println("Enter C for Celcius");
    System.out.println("Enter F for  Fahrenheit");
    System.out.println("Enter Youe choice");
    String Convert=sc.next();
    double C,F;
    if(Convert.equals("C"))
    {
      C=((Input-32)*5)/9 ;
      System.out.println("Temperature:"+C+"°C");
    }
    else if(Convert.equals("F"))
    {
      F=((Input*9)/5)+32;
      System.out.println("Temperature:"+F+"°F");
    }
    else
      System.out.println("Invalid Input");
  }
}
    
    
    