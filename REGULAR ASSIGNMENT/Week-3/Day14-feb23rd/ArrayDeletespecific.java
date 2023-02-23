import java.util.Scanner;
class ArrayDeletespecific
{
  public static void main(String[] args) 
  {
    int n, x;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) 
    {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter the index position  element you want to delete:");
    x= sc.nextInt();
    for(int i=x+1;i<n;i++)
    {
      a[i-1]=a[i];
    }
    System.out.println("After Deleting:");
    for (int i = 0; i < n-1; i++) 
    {
      System.out.println("a["+i+"]="+a[i]);
    }
  }
}
