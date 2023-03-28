import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRetrieve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.print("Enter the index of the element to retrieve: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < numbers.size()) {
            int element = numbers.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index");
        }

        scanner.close();
    }
}
