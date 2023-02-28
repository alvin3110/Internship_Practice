import java.util.Scanner;
class Methodsmaxnum{
  static int maxNumber(int num1,int num2){
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int max=maxNumber(num1,num2);
    System.out.println(max);
  }
}
