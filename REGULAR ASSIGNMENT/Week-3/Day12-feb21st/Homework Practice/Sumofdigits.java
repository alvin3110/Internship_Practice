import java.util.Scanner; 
class Sumofdigits{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int d;
    System.out.println("enter number");
    int n=sc.nextInt();
    do
    {
      d=n%10;
      sum=sum+d;
      n=n/10;
    }while(n>0);
    System.out.println("Sum of digits="+sum);
  }
}