import java.util.Scanner;
class Validname{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    boolean valid=true;
    do
    {
      System.out.println("Enter Name:");
      String name=sc.next();
      if(name.length()>5)
      {
        System.out.println("Valid");
        valid=false;
      }
      else 
      {
        System.out.println("Invalid");
      }
    }while(valid);
  }
}

