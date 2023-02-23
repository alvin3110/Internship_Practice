import java.util.Scanner;
class ArrayInsertmiddle 
{
  public static void main(String[] args) 
  {
    int n, p,e;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of an array:");
    n = sc.nextInt();
    int arr[] = new int[n+1];
    System.out.println("Enter "+n+" all the elements:");
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    p =n/2;
    System.out.print("Enter the element which you want to insert:");
    e = sc.nextInt();
    for(int i = n-1; i>=p; i--)
    {
      arr[i+1] = arr[i];
    }
    arr[p] = e;
    System.out.println("After inserting : ");
    for(int i = 0; i <=n; i++)
    {
      System.out.println("a["+i+"]="+arr[i]);
    }
  }
}