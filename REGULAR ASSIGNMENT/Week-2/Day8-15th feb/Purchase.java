import java.util.Scanner;
class Purchase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to ecart:");
    double balance=2000;
    System.out.println("Select item:pen,book");
    String Item=sc.next();
    int amt=0;
    System.out.println("quantity:");
    int q=sc.nextInt();
    if(Item.equals("pen"))
    {
      amt=q*20;
      System.out.println("Amount"+amt);
    }
    else  if(Item.equals("book"))
    {
      amt=q*50;
      System.out.println("Amount"+amt);
    }
    else
      System.out.println("Add more money to your account!!Insufficient balance");
    
    if(amt<=balance)
    {
        System.out.println("Purchased "+Item);
        balance=balance-amt;
        System.out.println("Balance:"+balance);
    }
    else
      System.out.println("Add more money to your account!!Insufficient balance");
  }
}


