import java.util.ArrayList;

public class ArrayListIteration{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}