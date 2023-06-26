import java.util.*;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many terms do you want to enter");
    int n = sc.nextInt();
    
    if (n < 0) {
      System.out.println("invalid no.terms");
    }
    int firstterm=0;
    int secondterm=1;
    System.out.println("Fibonacci series of " +n+ " terms");
    System.out.print(firstterm+","+secondterm);
    for(int i=3;i<=n;i++){
      int nextterm=firstterm+secondterm;
      System.out.print(","+nextterm);
      firstterm=secondterm;
      secondterm=nextterm;
    }
  }
}