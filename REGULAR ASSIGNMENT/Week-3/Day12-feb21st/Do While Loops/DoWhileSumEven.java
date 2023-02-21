import java.util.*;
class DoWhileSumEven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter limit");
    int n=sc.nextInt();
    int i=0;
    do
    {
      sum=sum+i;
      i=i+2;
    }while(i<=n);
  System.out.println("Sum of Even numbers: "+sum);
  }
}