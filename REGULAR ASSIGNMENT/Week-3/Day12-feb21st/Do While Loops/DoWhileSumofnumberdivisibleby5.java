import java.util.*;
class DoWhileSumofnumberdivisibleby5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter limit");
    int n=sc.nextInt();
    int i=0;
    do
    {
      if(i%5==0)
        sum=sum+i;
      i++;
    }while(i<=n);
    System.out.println("Sum of Even numbers: "+sum);
  }
}