import java.util.Scanner;
class Arraysum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    double arr[]=new double[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextDouble();
    }
    double sum=0;
    for(int i=0;i<n;i++)
      sum=sum+arr[i];
    System.out.println("Sum="+sum);
  }
}