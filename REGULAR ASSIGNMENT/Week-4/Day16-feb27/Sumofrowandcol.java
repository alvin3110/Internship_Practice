import java.util.Scanner;
class Sumofrowandcol{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of row");
    int r=sc.nextInt();
    System.out.println("Enter number of col");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    System.out.println("Enter elements of array");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
    }
    int rsum=0;
    int csum=0;
    System.out.println("Sum of rows:");
    for(int i=0;i<r;i++){
      rsum=0;
      for (int j=0;j<c;j++){
        rsum=a[i][j]+rsum;
      }
      System.out.println(rsum);
    }
    System.out.println("Sum of columns");
    for(int j=0;j<c;j++){
      csum=0;
      for (int i=0;i<r;i++){
        csum=a[i][j]+csum;
      }
      System.out.println(csum);
    }
  }
}