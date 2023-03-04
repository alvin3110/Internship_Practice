import java.util.Scanner;
class Indexof{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  System.out.println("Enter the element");
  int e = sc.nextInt();
  for(int i=0;i<size;i++)
    if(arr[i]==e){
      System.out.println(i);
  }
}
}