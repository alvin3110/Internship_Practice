import java.util.ArrayList;
import java.util.Collections;

 class ArrayListSort {
   public static void main(String[] args) {
      ArrayList<String> colors = new ArrayList<String>();
      colors.add("Red");
      colors.add("Green");
      colors.add("Blue");
      colors.add("Yellow");
      colors.add("Purple");
      Collections.shuffle(colors);
     System.out.println("shuffled arraylist"+ colors);
   }
}
