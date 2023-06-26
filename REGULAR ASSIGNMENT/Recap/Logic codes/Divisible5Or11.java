import java.util.Scanner;

class Divisible5Or11 {
  public static void main(String args[]){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    number=sc.nextInt();
    if(number%5==0){
      System.out.println("number is divisible by 5");
    }
    else if(number%11==0){
      System.out.println("number is divisible by 11");
    }
    else{
      System.out.println("not divisible")
    }
  }
}