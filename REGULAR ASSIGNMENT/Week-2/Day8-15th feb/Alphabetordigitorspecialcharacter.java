import java.util.Scanner;
class Alphabetordigitorspecialchar{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a char");
    char c=sc.next().charAt(0);
    if(c>='a'&& c<='z' || c>='A'&& c<='Z' )
      System.out.println("it is alphabet");
    else if(c>='0' && c<='9')
      System.out.println("it is a digit"); 
    else 
      System.out.println("Special character");
  }
}