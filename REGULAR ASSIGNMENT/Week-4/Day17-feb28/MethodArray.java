import java.util.Scanner;
class MethodArray{
  static void insert(int n,int a[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Insert array Elements:");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  static void display(int n,int a[])
  {
    for(int i=0;i<n;i++){
      System.out.println("a["+i+"]="+ a[i]);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter array Size:");
    int n=sc.nextInt();
    int a[]=new int[n];
    insert(n, a);
    display(n,a);
  }
}