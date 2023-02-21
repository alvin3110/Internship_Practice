import java.util.*;
class WhileMultiplication{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=0;
    System.out.println("Enter number");
    int n=sc.nextInt();
    int i=1;
    while(i<=10)
    {
      m=n*i;
      System.out.println(n+"*"+i+"="+m);
      i++;
    }
   }
}