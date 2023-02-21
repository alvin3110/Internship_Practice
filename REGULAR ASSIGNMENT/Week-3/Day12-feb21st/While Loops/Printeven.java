import java.util.*;
class Printeven{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Limit");
    int n=sc.nextInt();
    int i=1; 
    System.out.println("Even Number:");
    while(i<=n)
    {
      if(i%2==0)
      {
       System.out.println(i);
      }
      i++;
    }
  System.out.println("Exit");  
  }
}