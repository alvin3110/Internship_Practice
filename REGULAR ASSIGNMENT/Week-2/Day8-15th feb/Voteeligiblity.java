import java.util.Scanner;
class Vote{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=sc.nextInt();
    if(age>=18){
      System.out.println("Eligible");
    }
    else{
       System.out.println("Not Eligible");
    }
  }
}