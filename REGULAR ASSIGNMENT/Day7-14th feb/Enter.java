import java.util.Scanner;
class Enter{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter integer number");
    int num1=sc.nextInt(); 
    System.out.println("Enter Double number");
    double num2=sc.nextDouble();
    System.out.println("Enter Boolean value");
    boolean bool=sc.nextBoolean();
    System.out.println("Enter Char");
    char c=sc.next().charAt(0);
    System.out.println("Integer:"+num1);
    System.out.println("Double:"+num2);
    System.out.println("Boolean:"+bool);
    System.out.println("Char:"+c);
  }
}