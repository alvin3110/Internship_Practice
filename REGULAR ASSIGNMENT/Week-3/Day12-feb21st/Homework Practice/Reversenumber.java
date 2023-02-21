import java.util.Scanner;
class Reversenumber{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      int temp = number;
      int reversedNumber = 0;
      while (temp != 0) {
        int r = temp % 10;
        reversedNumber = reversedNumber * 10 + r;
        temp= temp/10;
      }
      System.out.println("Reversed number="+reversedNumber);
    }
}
      
      