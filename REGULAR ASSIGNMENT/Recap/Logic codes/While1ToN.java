import java.util.Scanner;

class While1toN {
  public static void main(String args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value");
    n = sc.nextInt();
    int i = 1;
    while (i <= n) {
      System.out.println(i);
      i++;
    }
  }
}