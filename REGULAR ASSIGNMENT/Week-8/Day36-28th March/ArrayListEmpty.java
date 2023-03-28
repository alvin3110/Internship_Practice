import java.util.ArrayList;

public class ArrayListEmpty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("black");
        list.add("orange");
        list.add("green");
        System.out.println("Original list: " + list);
        list.clear();

        System.out.println("List after clearing all elements: " + list);
    }
}
