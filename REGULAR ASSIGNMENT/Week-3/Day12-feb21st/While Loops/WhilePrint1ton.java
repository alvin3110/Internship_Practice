import java.util.*;
class WhilePrint1ton{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    System.out.println("Even Numbers:");
    int i=1;
    while(i<=n)
    {
      System.out.println(i);
      i++;
    }
  }
}