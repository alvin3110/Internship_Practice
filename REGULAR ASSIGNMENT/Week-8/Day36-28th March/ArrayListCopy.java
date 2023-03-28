import java.util.ArrayList;

public class ArrayListCopy {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        ArrayList<String> copiedList = new ArrayList<>();
        copiedList.addAll(originalList);
        System.out.println("Original list: " + originalList);
        System.out.println("Copied list: " + copiedList);
    }
}
