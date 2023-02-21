import java.util.*;
class Sumofeven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter limit");
    int n=sc.nextInt();
    for(int i=0;i<=n;i=i+2)
    {
     //if(i%2==0)
      //{
        sum=sum+i;
      //}
    }
    System.out.println("Sum of Even numbers: "+sum);
  }
}
    