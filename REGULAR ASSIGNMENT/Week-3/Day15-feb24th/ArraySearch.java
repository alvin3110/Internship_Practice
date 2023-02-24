import java.util.Scanner;
class ArraySearch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter Element to search");
    int e=sc.nextInt();
    int p=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==e)
      {
        System.out.println("FOUND "+e+" at"+i+" position");
        p=i;
      }
    }
    if(a[p] != e)
        System.out.println("Not Found");
  }
}