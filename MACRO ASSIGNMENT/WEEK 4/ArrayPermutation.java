import java.util.Scanner;
public class ArrayPermutation {
  static void Rotate(int arr[], int index, int size)
{
    int temp[] = new int[size];
    
    for (int i = index; i < size; i++) {
      System.out.print(arr[i]+" ");
    }
   
  for (int i = 0; i < index; i++) {
      System.out.print(arr[i]+" ");
    }
}
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the index");
    int index = sc.nextInt();
    Rotate(arr,index, size);
    }
  }
