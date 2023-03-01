
import java.util.Scanner;
class Words{
  static void Split(String str){
    String words[]=str.split(" ");
    System.out.println(words.length);
    for(int i=0;i<words.length;i++)
      System.out.println(words[i]);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    Split(str);
  }
}