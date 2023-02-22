import java.util.Scanner;
class Validage{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i=0;
    do
    {
      System.out.println("Enter age:");
      int age=sc.nextInt();
      if(age>0)
      {
        i=1;
        System.out.println("Valid");
      }
      else 
        System.out.println("Invalid");
    }while(i!=1);
  }
}
  
      
      
      
  