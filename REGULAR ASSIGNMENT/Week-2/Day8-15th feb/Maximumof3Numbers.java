import java.util.Scanner;
class Maxofthreenum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the second number");
    int num2=sc.nextInt();
    System.out.println("Enter the third number");
    int num3=sc.nextInt();
    if(num1>num2 && num1>num3)
      System.out.println("First number is largest:"+num1);
    else if(num2>num1 && num2>num3)
      System.out.println("Second number is largest:"+num2);
    else
      System.out.println("Third number is largest:"+num3);
  }
}