import java.util.Scanner;
class MaxTwo{
  public static void main(String args[]){
    int firstNumber,secondNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    firstNumber=sc.nextInt();
     System.out.println("Enter the second number");
    secondNumber=sc.nextInt();
    if(firstNumber>secondNumber)
      System.out.println("first number is maximum.");
    else
     System.out.println("second number is maximum.");
   
  }
}