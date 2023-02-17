import java.util.Scanner;
class Operator{
  public static void main(String args[]){
   int num1,num2;
    double result=0;
    char operator;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 numbers");
    num1=sc.nextInt();
    num2=sc.nextInt();
    System.out.println("choose operations");
    System.out.println("+- addition \n - -subtraction\n*-multiplication\n /-division\n %- reminder");
  operator=sc.next().charAt(0);
    switch(operator){
      case '+':
        result=num1+num2;
        break;
      case '-':
        result=num1-num2;
        break;
      case '*':
        result=num1*num2;
        break;
      case '/':
        result=num1/num2;
        break;
      case '%':
        result=num1%num2;
        break;
      default:
        System.out.println("invalid operation");
    }
    
    System.out.println(result);
  }
}