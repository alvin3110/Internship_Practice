import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("yellow");
        list.add("black"); 
        System.out.println("Original list: " + list);
        Collections.reverse(list); 
        System.out.println("Reversed list: " + list);
    }
}
