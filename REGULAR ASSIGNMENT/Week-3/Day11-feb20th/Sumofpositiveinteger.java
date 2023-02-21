import java.util.Scanner; 
class Sumofpositiveinteger{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i=0;
    int sum=0;
    int d;
    System.out.println("enter number");
    int n=sc.nextInt();
    while(n>0)
    {
      d=n%10;
      sum=sum+d;
      n=n/10;
      i=i+1;
    }
    System.out.println(sum);
    System.out.println("Exit");
     
  }
}