import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int reversedNumber = 0;
        while (temp != 0) {
            int r = temp % 10;
            reversedNumber = reversedNumber * 10 + r;
            temp= temp/10;
        }

        if (number == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
