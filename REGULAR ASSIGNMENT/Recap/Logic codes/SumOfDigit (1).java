import java.util.Scanner;
class SumOfDigit{
  public static void main(String args[]){
    int a=123;
    int rem=0,sum=0;
    while(a!=0){
      rem=a%10;//123=3//12%10=2
      sum=sum+rem;//3+2=5
      a=a/10;//123/10==12.3--->12//12/10=1
    }
    System.out.println(sum);
  }
}