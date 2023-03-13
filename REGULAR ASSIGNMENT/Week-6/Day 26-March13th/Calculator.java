import java.util.Scanner;
class Add
{
  public void sum(int a,int b)
  {
    System.out.println("Sum 1="+(a+b));
  }
  public void sum(double a,double b)
  {
    System.out.println("Sum 2="+(a+b));
  }
  public void sum(int a,int b,long c)
  {
    System.out.println("Sum 3="+(a+b+c));
  }
}
class Calculator
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Add s1 =new Add();
    s1.sum(sc.nextInt(),sc.nextInt());
    s1.sum(sc.nextDouble(),sc.nextDouble());
    s1.sum(10,20,39846783);
  }
}