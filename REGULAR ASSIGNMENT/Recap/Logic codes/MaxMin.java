//Write a JAVA program to find maximum and minimum element in an array.
public class MaxMin {
    public static void main(String[] args) {
        int arr[] = { -16, 0, -6, 8, 10, -2 };
        int max = arr[0], min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min " + min + "\nMax " + max);
    }
}