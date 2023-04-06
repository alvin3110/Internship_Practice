import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] arr = {2, 5, 7, 10, 15};
        System.out.println("Enter the element to search:");
        int key = input.nextInt();
        
        int index = search(arr, key);
        
        if(index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
    
    public static int search(int[] arr, int key) {
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        
        return -1;
    }

}
