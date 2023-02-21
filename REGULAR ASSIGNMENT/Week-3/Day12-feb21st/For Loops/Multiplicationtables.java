import java.util.*;
class Multiplicationtables{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=0;
    System.out.println("Enter number");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      m=n*i;
      System.out.println(n+"*"+i+"="+m);
    }
   }
}