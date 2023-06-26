import java.util.Scanner;
class WhileNto1{
  public static void main(String args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    n=sc.nextInt();
    int i=n;
    while(i>=1){
    System.out.println(i);
      i--;
    }
  }
}