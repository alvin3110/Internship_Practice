import java.util.HashMap;
import java.util.Map;

public class MapIterate {

    public static void main(String[] args) {
        
        // create a map with some values
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        
        // iterate over the values of the map
        for (int value : map.values()) {
            System.out.println(value);
        }
    }
}
