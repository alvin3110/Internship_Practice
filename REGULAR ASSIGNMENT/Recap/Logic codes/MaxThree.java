import java.util.Scanner;
class MaxThree{
  public static void main(String args[]){
    int firstNumber,secondNumber,thirdNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    firstNumber=sc.nextInt();
     System.out.println("Enter the second number");
    secondNumber=sc.nextInt();
     System.out.println("Enter the third number");
    thirdNumber=sc.nextInt();
    if((firstNumber>secondNumber)&&(firstNumber>thirdNumber))
      System.out.println("first number is maximum.");
    else if((secondNumber>firstNumber)&&(secondNumber>thirdNumber))
      System.out.println("second number is maximum.");
    else
      System.out.println("Third number is maximum.");
  }
}