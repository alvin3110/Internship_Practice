import java.util.*;
class Printeven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    System.out.println("Even Numbers:");
    for(int i=1;i<=n;i++)
    {
     if(i%2==0)
      {
        System.out.println(i);
      }
    }
  }
}