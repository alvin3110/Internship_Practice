import java.util.Scanner;
class ReplaceApplication {
  static void Replace(String str,String word,String replace){
    System.out.println(str.replace(word, replace));
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = "Hi Welcome to Bitlabs";
    System.out .println("Enter word you want to replace");
    String word=sc.next();
    String replace=sc.next();
    Replace(str, word, replace);
  }
}