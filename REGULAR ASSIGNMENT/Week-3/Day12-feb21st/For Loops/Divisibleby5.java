import java.util.*;
class Divisibleby5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    System.out.println("Numbers:");
    for(int i=1;i<=n;i++)
    {
     if(i%5==0)
      {
        System.out.println(i);
      }
    }
  }
}