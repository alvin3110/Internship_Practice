import java.util.Scanner;
class Purchase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to ecart:");
    double balance=2000;
    System.out.println("Enter item:");
    String Item=sc.next();
    int amt;
    if(Item.equals("pen")){
      System.out.println("quantity:");
      int q=sc.nextInt();
      amt=q*20;
      System.out.println("Amount"+amt);
      if(amt<=balance){
        System.out.println("Purchased "+Item);
        balance=balance-amt;
        System.out.println("Balance:"+balance);
      }
    }
    else  if(Item.equals("book")){
      System.out.println("quantity:");
      int q=sc.nextInt();
      amt=q*50;
      System.out.println("Amount:"+amt);
      if(amt<=balance){
        System.out.println("Purchased "+Item);
        balance=balance-amt;
        System.out.println("Balance:"+balance);
      }
      else
      System.out.println("Add more money to your account!!Insufficient balance");
    }
    else
      System.out.println("Out of Stock!Try again later");
  }
}