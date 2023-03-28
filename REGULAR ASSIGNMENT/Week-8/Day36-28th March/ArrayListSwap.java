import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List: " + list);
        Collections.swap(list, 1, 3);
        System.out.println("Updated List: " + list);
    }
}
