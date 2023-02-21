import java.util.*;
class Printnto1numbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    System.out.println("Even Numbers:");
    for(int i=n;i>=1;i--)
      System.out.println(i);
  }
}