import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odd {
    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers : ");
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String str : input) {
            numbers.add(Integer.parseInt(str));
        }
        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Odd integers in the list: " + oddNumbers);
    }
}
