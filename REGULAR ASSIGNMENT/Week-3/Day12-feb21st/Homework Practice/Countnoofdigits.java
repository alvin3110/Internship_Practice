import java.util.Scanner;
class Countnoofdigits{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      int count = 0;
      while (number != 0) {
        number= number/10;
        count++;
      }
      System.out.println("The number of digits is " + count);
    }
}
