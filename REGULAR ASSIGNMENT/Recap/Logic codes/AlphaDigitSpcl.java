import java.util.Scanner;
class AlphaDigitSpcl {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char ch;
    System.out.println("Enter the character");
    ch = sc.next().charAt(0);
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println("Alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("Digit");
    } else {
      System.out.println("Special character");
    }
  }
}