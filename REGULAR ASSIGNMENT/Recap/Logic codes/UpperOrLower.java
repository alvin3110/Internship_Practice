import java.util.Scanner;
class UpperOrLower{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character");
    ch = sc.next().charAt(0);
    if(ch>=='A'&&ch<='Z'){
      System.out.println("The character is in Upper case");
    }
  else{
     System.out.println("The character is in Lower case");
  }
  }
}