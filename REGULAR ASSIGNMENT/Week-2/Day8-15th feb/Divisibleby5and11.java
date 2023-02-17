import java.util.Scanner;
class Divisibleby5and11{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    if(num%5==0 && num%11==0)
      System.out.println("Divisible by both 5 and 11");
    else if(num%5==0)
       System.out.println("Divibile by 5");
    else if(num%11==0)
      System.out.println("Divibile by 11");
    else
      System.out.println("Not Divisible");
  }
}