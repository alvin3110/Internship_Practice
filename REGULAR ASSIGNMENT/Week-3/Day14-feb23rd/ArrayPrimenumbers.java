import java.util.Scanner;
class ArrayPrimenumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Prime Numbers are:");
    
    for(int i=0;i<n;i++){
      int count=0;
      for(int j=1;j<=arr[i];j++){
        if(arr[i]%j==0)
          count++;
      }
      if(count==2)
        System.out.println(arr[i]);
    }
  }
}