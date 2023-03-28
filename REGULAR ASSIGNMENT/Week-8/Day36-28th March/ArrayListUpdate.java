import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println("Original ArrayList: " + colors);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element to be updated: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < colors.size()) {
            System.out.print("Enter the new element: ");
            String newElement = scanner.next();
            colors.set(index, newElement);
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
