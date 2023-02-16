import java.util.Scanner;
class Rockpaper{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("ROCK PAPER SCISSOR");
    System.out.println("Enter Player 1 Choice");
    String p1=sc.next();
    System.out.println("Enter Player 2 Choice");
    String p2=sc.next();
    if(p1.equals(p2))
      System.out.println("Draw");
    else if(p1.equals("rock") && p2.equals("scissor") || p1.equals("paper") && p2.equals("rock") || p1.equals("scissor") && p2.equals("paper"))
       System.out.println("Player 1 wins");
    else if(p2.equals("rock") && p1.equals("scissor") || p2.equals("paper") && p1.equals("rock") || p2.equals("scissor") && p1.equals("paper"))
       System.out.println("Player 2 wins");
  }
}