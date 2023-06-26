import java.util.Scanner;

 class SumFirstLastDigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int lastDigit = number % 10;
        int firstDigit = 0;
        
        while (number != 0) {
            firstDigit = number;
            number /= 10;
        }
        
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of the first and last digit: " + sum);
        
        scanner.close();
    }
}
