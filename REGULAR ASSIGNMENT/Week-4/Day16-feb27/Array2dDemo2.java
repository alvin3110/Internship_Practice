import java.util.Scanner;
class Array2dDemo2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of row:");
    int n=sc.nextInt();
    
    int a[][]=new int[n][n];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]>10 || a[i][j]!=20){
          count++;
          break;
        }
      }
    }
    if(count==0)
      System.out.print("yes");
    else
      System.out.print("no");
  }
  
}