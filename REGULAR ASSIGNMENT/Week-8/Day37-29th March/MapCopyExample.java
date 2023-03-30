import java.util.HashMap;
import java.util.Map;

public class MapCopyExample {
  public static void main(String[] args)
  {
    Map<String, Integer> originalMap = new HashMap<>();
    originalMap.put("apple", 1);
    originalMap.put("banana", 2);
    originalMap.put("orange", 3);
    Map<String, Integer> newMap = new HashMap<>();
    newMap.putAll(originalMap);
    System.out.println("Original Map: " + originalMap);
    System.out.println("New Map: " + newMap);
  }
}
