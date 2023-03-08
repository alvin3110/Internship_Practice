import java.util.*;

public class Stringpermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String input = sc.nextLine();
        System.out.println("enter the given string");
        generatePermutations(input.toCharArray(), 0);
    }
  static void generatePermutations(char[] c, int s) 
  {
        if (s == c.length - 1) {
            System.out.println(String.valueOf(c));
        } else {
            for (int i = s; i < c.length; i++) {
                swap(c, i, s);
                generatePermutations(c, s + 1);
                swap(c, i, s);
            }
        }
  }
  static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}