import java.util.ArrayList;

public class ArrayListRemove {
   public static void main(String[] args) {
      ArrayList<String> colorsList = new ArrayList<>();
      colorsList.add("Red");
      colorsList.add("Green");
      colorsList.add("Blue");
      colorsList.add("Yellow");
      colorsList.add("Orange");
      System.out.println("Colors list before removing third element: " + colorsList);
      colorsList.remove(2);
      System.out.println("Colors list after removing third element: " + colorsList);
   }
}
