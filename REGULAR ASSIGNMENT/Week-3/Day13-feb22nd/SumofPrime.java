import java.util.Scanner;
class SumofPrime{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter start");
    int s=sc.nextInt();
    System.out.println("Enter end");
    int e=sc.nextInt();
    int sum=0;
    for(int i=s;i<=e;i++) 
    {
      int count=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
          count++;
      }
      if(count==2)
        sum=sum+i;
    }
    System.out.println("Sum of prime ="+sum);
  }
}