
import java.util.Scanner;

class StringLength {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string");
    String inputString = scanner.nextLine();

    int length = inputString.length();
    System.out.println("Length of the string " + length);

  }
}
