import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grapes");
        list.add("mango");
        System.out.print("Enter element to search: ");
        String searchElement = scanner.nextLine();
        if(list.contains(searchElement)) {
            System.out.println(searchElement + " is found in the list.");
        } else {
            System.out.println(searchElement + " is not found in the list.");
        }
        
        scanner.close();
    }
}
