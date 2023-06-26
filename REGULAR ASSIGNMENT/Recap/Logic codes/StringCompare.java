import java.util.Scanner;
class StringCompare{
  static void compareString(String str1,String str2){
    if(str1.equals(str2)){
      System.out.println("Strings are equal");
    }
      else{
      System.out.println("Strings are not equal");
      }
    }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1,str2;
    System.out.println("Enter string 1");
    str1=sc.next();
    System.out.println("Enter string 2");
    str2=sc.next();
    compareString(str1,str2);
  }
}
