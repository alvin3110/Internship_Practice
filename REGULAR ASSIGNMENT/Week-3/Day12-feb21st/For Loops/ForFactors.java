import java.util.*;
class ForFactors{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    System.out.println("Factors:");
    for(int i=1;i<=n/2;i++)
    {
     if(n%i==0)
      {
        System.out.println(i);
      }
    }
  }
}