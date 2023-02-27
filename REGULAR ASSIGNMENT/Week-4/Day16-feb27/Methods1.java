import java.util.Scanner;
class Methods1{
  static void add(){
    int a=10,b=20;
    System.out.println((a+b));
  }
  static int add1(){
    int a=10,b=20;
    return a+b;
  }
  static void add2(int a,int b){
    System.out.println((a+b));
  }
  static int add3(int a,int b){
    return a+b;
  }
  public static void main(String args[]){
    add();
    int sum=add1();
    System.out.println(sum);
    add2(10,20);
    int sum1=add3(10,20);
    System.out.println(sum1);
  }
}