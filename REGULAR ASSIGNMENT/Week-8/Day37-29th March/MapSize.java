import java.util.HashMap;
import java.util.Map;

public class MapSize {

    public static void main(String[] args) {
        
        // create a map with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        
        // get the size of the map
        int size = map.size();
        System.out.println("The size of the map is: " + size);
    }
}
