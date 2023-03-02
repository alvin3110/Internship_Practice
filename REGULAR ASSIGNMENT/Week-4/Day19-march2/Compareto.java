import java.util.Scanner;
class Compareto{
  static void Comparestr(String str1,String str2){
    System.out.println(str1.compareTo(str2));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1 =sc.next() ;
    String str2 =sc.next();
    Comparestr(str1, str2);
  }
}