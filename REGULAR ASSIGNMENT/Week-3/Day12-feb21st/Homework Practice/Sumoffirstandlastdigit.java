import java.util.Scanner;
public class Sumoffirstandlastdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int Lastdigit = number % 10;
        int FirstDigit = number;
        while (FirstDigit >= 10) {
            FirstDigit= FirstDigit/10;
        }
        System.out.println("Sum=" + (FirstDigit+Lastdigit));
    }
}