import java.util.*;
class Printodd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    System.out.println("Numbers are:");
    System.out.println("Even Numbers:");
    for(int i=1;i<=n;i++)
    {
     if(i%2==0)
      {
        System.out.println(i);
      }
    }
    System.out.println("Odd Numbers:");
    for(int i=1;i<=n;i++)
    {
      if(i%2!=0)
      {
        System.out.println(i);
      }
    }
  }
}
