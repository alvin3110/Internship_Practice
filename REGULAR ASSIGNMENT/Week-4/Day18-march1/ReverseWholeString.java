import java.util.Scanner;
class ReverseWholeString{
  static void reversewords(String str){
    String rev="";
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      rev=reverse(words[i]);
      System.out.print(rev+" ");
    }
  }
  static String reverse(String str){
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    return rev;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    reversewords(str);
  }
}