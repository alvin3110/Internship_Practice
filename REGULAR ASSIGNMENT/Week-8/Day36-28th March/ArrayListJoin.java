import java.util.ArrayList;

public class ArrayListJoin {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Grapes");
        list2.add("Orange");
        list2.add("Pineapple");
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined array list: " + joinedList);
    }
}
