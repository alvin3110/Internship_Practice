import java.util.Scanner;
class ArrayCountPosNeg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    double arr[]=new double[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextDouble();
    }
    int countp=0;
    int countn=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>0)
        countp++;
      else
        countn++;
    }
    System.out.println("Count of positive numbers="+countp);
    System.out.println("Count of negative numbers="+countn);
  }
}