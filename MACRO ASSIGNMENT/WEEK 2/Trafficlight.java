import java.util.Scanner;
class Trafficlight{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter time");
    int t=sc.nextInt();
    System.out.println("Traffic Status");
    String s=sc.next();
    if((t>=8&&t<10)&&(s.equals("heavy")))
      System.out.println("red light for east-west and green for north-south");
    else if ((t>=10 && t<12)&&(s.equals("heavy")))
      System.out.println("green light for east-west and red for north-south");
    else if ((t>=12 && t<14)&&(s.equals("heavy")))
      System.out.println("red light for east-west and green for north-south");
    else if ((t>=14&&t<16)&&(s.equals("heavy")))
      System.out.println("red light for east-west and green for north-south");
    else
      System.out.println("yellow for all directions");
  }
}