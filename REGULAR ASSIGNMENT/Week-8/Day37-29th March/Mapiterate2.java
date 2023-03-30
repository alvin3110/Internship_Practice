import java.util.HashMap;
import java.util.Map;

public class Mapiterate2 {

    public static void main(String[] args) {
        
        // create a map with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        
        // iterate over the key-value pairs of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
