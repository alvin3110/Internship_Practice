import java.util.Scanner;
class MethodPrintnumber{
  static void Printnumbers(int a,int b){
    for(int i=a;i<=b;i++)
      System.out.println(i);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    Printnumbers(a,b);
  }
}
  
