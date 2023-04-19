public class Arrayneg {
  public static void main(String[] args) {
    int[] arr = {30, -99, 90, 77, -88, 89, 77, -66};
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        count++;
      }
    }
    System.out.println("Total number of negative numbers: " + count);
  }
}
