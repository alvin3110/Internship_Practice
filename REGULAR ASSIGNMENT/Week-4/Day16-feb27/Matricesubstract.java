import java.util.Scanner;
class Matricesubstract{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of row:");
    int r=sc.nextInt();
    System.out.println("Enter no of col:");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    int sub[][]=new int[r][c];
    System.out.println("Enter mattrice A");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Enter matrice B");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        b[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Sum of Matrices:");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        sub[i][j]=a[i][j]-b[i][j];
        System.out.println(sub[i][j]);
      }
      System.out.println();
    }
    
    
  }
}
    