import java.util.Scanner;
class CountNumDigit{
  public static void main(String args[]){
    int count=0;
    long num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    num=sc.nextInt();
    while(num>0){
      num=num/10;
      ++count;
    }
    System.out.println("The number of digits in a given number is:"+count);
  }
}