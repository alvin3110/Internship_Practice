import java.util.*;
public class SumOfEven{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n");
    int n=sc.nextInt();
    int sum=0;
    int num=2;
    while(num<=n){
      sum=sum+num;
      num=num+2;
    }
    System.out.println(sum);
  }
}