import java.util.Scanner;
class Arraycopy {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length of an array:");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter "+n+" all the elements:");
      for(int i = 0; i < n; i++)
      { 
        arr[i] = sc.nextInt();
      }
      int[] copy = new int[n];
      for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
      }
      System.out.println("Copy Array:");
      for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"]="+copy[i]);
        }
    }
}
