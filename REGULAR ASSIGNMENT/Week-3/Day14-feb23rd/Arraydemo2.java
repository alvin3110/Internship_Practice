import java.util.Scanner;
class Arraydemo2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //System.out.println("Enter Array length");
   // int n=sc.nextInt();
    double arr[]=new double[5];
    System.out.println("Enter Array values");// arr[i]=2
    for(int i=0;i<5;i++){
      arr[i]=sc.nextDouble();//arr[0]=1, arr[2]=5.....
    }
    for(int i=0;i<5;i++)
      System.out.println("a["+i+"]="+arr[i]);
  }
}