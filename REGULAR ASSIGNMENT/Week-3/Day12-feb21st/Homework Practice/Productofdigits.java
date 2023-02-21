import java.util.Scanner; 
class Productofdigits{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int p=1;
    int d;
    System.out.println("enter number");
    int n=sc.nextInt();
    do
    {
      d=n%10;
      p=p*d;
      n=n/10;
    }while(n>0);
    System.out.println("Product of digits="+p);
  }
}