import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largest {
    public static int findLargest(List<Integer> numbers) {
        int largest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers: ");
        String[] sc = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String str : sc) {
            numbers.add(Integer.parseInt(str));
        }
        int largest = findLargest(numbers);
        System.out.println("Largest integer in the list: " + largest);
    }
}
