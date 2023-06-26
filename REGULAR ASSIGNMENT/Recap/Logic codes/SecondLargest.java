//Write a JAVA program to find second largest element in an array.
public class SecondLargest{
    public static void main(String[] args) {
        int arr[] = { -16, 0, -6, 8, 10, -2 };
        int max = arr[0], secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second max value is " + secondMax);
    }
}