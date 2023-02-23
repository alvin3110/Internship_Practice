import java.util.Scanner;
class ArrayMinval{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int min = arr[0];
		for(int i = 1; i < n;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
    System.out.print("Array values");
    for(int i=0;i<n;i++)
      System.out.println( arr[i]);
    System.out.println("Minimum Value="+min);
  }
}