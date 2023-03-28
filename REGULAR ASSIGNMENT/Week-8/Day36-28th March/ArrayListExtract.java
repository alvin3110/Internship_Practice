import java.util.ArrayList;

public class ArrayListExtract {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        ArrayList<String> extract = new ArrayList<>(colors.subList(2, 5));
        System.out.println("Portion of the ArrayList: " + extract);
    }
}
