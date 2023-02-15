import java.util.Scanner;
class Uppercaseorlowercase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a char");
    char c=sc.next().charAt(0);
    if(c>='a'&& c<='z')
      System.out.println("Lowercase");
    else if(c>='A'&& c<='Z')
      System.out.println("Uppercase");   
  }
}