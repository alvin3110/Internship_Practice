import java.util.Scanner;

public class Longestcommonsub {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String str1 = sc.nextLine();
    System.out.print("Enter the second string: ");
    String str2 = sc.nextLine();
    String result = findLongestCommonSubstring(str1, str2);
    System.out.println("The longest common substring is: " + result);
  }

  public static String findLongestCommonSubstring(String str1, String str2) {
    int[][] lengths = new int[str1.length() + 1][str2.length() + 1];
    int maxLength = 0;
    int maxI = 0;
    int maxJ = 0;

    for (int i = 1; i <= str1.length(); i++) {
      for (int j = 1; j <= str2.length(); j++) {
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
          lengths[i][j] = lengths[i - 1][j - 1] + 1;
          if (lengths[i][j] > maxLength) {
            maxLength = lengths[i][j];
            maxI = i;
            maxJ = j;
          }
        }
      }
    }
    StringBuilder s = new StringBuilder();
    while (lengths[maxI][maxJ] != 0) {
      s.insert(0, str1.charAt(maxI - 1));
      maxI--;
      maxJ--;
    }
    return s.toString();
  }
}