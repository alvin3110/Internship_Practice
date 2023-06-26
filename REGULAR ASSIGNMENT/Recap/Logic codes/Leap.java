import java.util.Scanner;

class Leap {
  public static void main(String args[]) {
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Year");
    year = sc.nextInt();
    if (year % 4 == 0) {
      System.out.println("It is a leap year");
    } else {
      System.out.println("It is not a leap year");
    }
  }
}