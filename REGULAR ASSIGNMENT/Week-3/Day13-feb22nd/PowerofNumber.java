import java.util.Scanner;

class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();

        int result = 1;
        for (int i = 0; i < p; i++) {
            result =result*b;
        }

        System.out.println(b + "^" + p + " = " + result);
    }
}
