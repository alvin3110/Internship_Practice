import java.util.Scanner;
class Alphabet{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a char");
    char c=sc.next().charAt(0);
    if(c>='a'&& c<='z' || c>='A'&& c<='Z' )
      System.out.println("it is alphabet");
    else
      System.out.println("Not an alphabet");   
  }
}