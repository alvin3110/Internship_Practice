import java.util.Scanner;
class Reverseeachword{
  static void reversewords(String str){
    String rev="";
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      char a[]=words[i].toCharArray();
      rev="";
      for(int j=a.length-1;j>=0;j--){
        rev=rev+a[j];
      }
      System.out.print(rev+" ");
    }
  }
  
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    reversewords(str);
  }
}