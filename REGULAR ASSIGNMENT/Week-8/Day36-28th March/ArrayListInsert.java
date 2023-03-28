import java.util.ArrayList;
public class ArrayListInsert {
   public static void main(String[] args) {
      ArrayList<String> colors = new ArrayList<String>();
      colors.add("Red");
      colors.add("Green");
      colors.add("Blue");
      colors.add(0, "Yellow");
      System.out.println("Array list after inserting the element:");
      for (String color : colors) {
         System.out.println(color);
      }
   }
}
