import java.util.Scanner;
class ArrayCounteven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    double arr[]=new double[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextDouble();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]%2==0)
        count++;
    }
    System.out.println("Count of even="+count);
  }
}