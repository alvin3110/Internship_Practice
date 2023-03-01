import java.util.Scanner;
class ReverseString{
  static void Reverse(String str){
    char a[]=str.toCharArray();
    String rev=" ";
    for(int i=a.length-1;i>=0;i--){
      rev=rev+a[i];
    }
    System.out.println("Reversed String="+rev);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Reverse(str);
  }
}