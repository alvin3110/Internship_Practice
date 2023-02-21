import java.util.*;
class DoWhileFactors{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    System.out.println("Factors:");
    int i=1;
    do
    {
     if(n%i==0)
     {
        System.out.println(i);
     }
      i++;
    }while(i<=n/2);
  }
}