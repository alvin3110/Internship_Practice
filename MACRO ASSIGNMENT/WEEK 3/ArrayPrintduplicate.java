import java.util.Scanner;
class ArrayPrintduplicate{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    int a[]=new int[n];
    boolean visited[] = new boolean[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Duplicate Elements");
    for(int i=0;i<n;i++)
    {
      if (visited[i] == true)
        continue;
      int p=1;
      for(int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) 
        {
          visited[j] = true;
          p++;
        }
      }
      if(p>1)
        System.out.println(a[i]);
    }
  }
}