import java.util.*;
class Game2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Card 1 input");
    String card1=sc.next();
    int num1=sc.nextInt();
    System.out.println("Enter Card 2 input");
    String card2=sc.next();
    int num2=sc.nextInt();
    System.out.println("Enter Card 3 input");
    String card3=sc.next();
    int num3=sc.nextInt();
    if ((card1.equals("H") || card1.equals("Q") || card1.equals("S") || (card1.equals("C") && num1 > 0 && num1 < 10))&& (card2.equals("H") || card2.equals("Q") || card2.equals("S") || (card2.equals("C") && num2 > 0 && num2 < 10)) && (card3.equals("H") || card3.equals("Q") || card3.equals("S") || (card3.equals("C") && num3 > 0 && num3 < 10))) {
      if (card1.equals(card2) && card2.equals(card3)) {
            if (num1 == num2 && num2 == num3) {
                System.out.println("Double Bonanza");
            } else {
                System.out.println("Bonanza");
            }
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("Bonanza");
        } else {
            System.out.println("No Bonanza");
        }
    }
  }
}
