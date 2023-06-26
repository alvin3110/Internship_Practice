import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reve = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reve = (reve * 10) + digit;
            num= num/10;
        }
        
        System.out.println("Reversed number: " + reve);
    }
}
