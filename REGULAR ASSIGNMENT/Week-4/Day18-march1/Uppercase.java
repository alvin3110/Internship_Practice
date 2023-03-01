import java.util.Scanner;
class Uppercase{
  static void Uppercase(String str){
    String ustr=str.toUpperCase();
    System.out.println(ustr);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Uppercase(str);
  }
}