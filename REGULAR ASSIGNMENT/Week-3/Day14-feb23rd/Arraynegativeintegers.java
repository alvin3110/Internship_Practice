import java.util.Scanner;
class Arraynegativeintegers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Positive Integers are:");
    for(int i=0;i<n;i++)
      if(arr[i]<0)
        System.out.println(arr[i]);
  }
}