import java.util.Scanner;
class StringBufferReverse{
  
  static StringBuffer reverse(String s1){
    StringBuffer str=new StringBuffer();
    str.append(s1);
    str.reverse();
    return str;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    StringBuffer rev=reverse(s1);
    System.out.println(rev);
  }
}