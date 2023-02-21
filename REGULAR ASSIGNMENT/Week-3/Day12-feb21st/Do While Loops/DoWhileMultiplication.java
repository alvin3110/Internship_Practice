import java.util.*;
class DoWhileMultiplication{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=0;
    System.out.println("Enter number");
    int n=sc.nextInt();
    int i=1;
    do
    {
      m=n*i;
      System.out.println(n+"*"+i+"="+m);
      i++;
    }while(i<=10);
   }
}