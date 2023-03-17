import java.util.Scanner;
  class BankAccount{
    double balance=2000;
    float interstRate=10.0f;
    
  }
class SavingsAccount extends BankAccount{
  Scanner sc=new Scanner(System.in);
  double minBalance=600;

  void withdraw(){
    while(true){
    System.out.println("enter amount");
    double amount=sc.nextDouble();
    double balance=balance-amount;
    if(balance1>minBalance){
      balance=balance-amount;
      
      System.out.println("balance is"+balance);
      break;
      
    }else{
      System.out.println("amount is greater than minimum balance");
    }
  }
}}
public class BankAccountEH.java{
  public static void main(String args[]){
    SavingsAccount sa= new SavingsAccount();
    sa.withdraw();
  }
}