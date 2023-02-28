import java.util.Scanner;
class MethodArrayEven{
  static void insert(int n,int a[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Insert array Elements:");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  static int[] display(int n,int a[]){
      
        return a;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array Size:");
    int n=sc.nextInt();
    int a[]=new int[n];
    insert(n, a);
    int d[]=display(n,a);
    System.out.print("Array:");
    for(int i=0;i<n;i++)
      if(d[i]%2==0)
      System.out.println(d[i]);
  }
}