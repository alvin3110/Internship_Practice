import java.util.*;
class Bank{
  double balance=50000;
  float intrestRate=10.00f;
  
}
class SavingsAccount extends Bank{
  double minBalance=500;
  Scanner sc = new Scanner(System.in);
    void withRaw(){
   while(true){
      System.out.println("Enter the Amount");
      double a = sc.nextDouble();
     double balance1 = balance-a;
    if(balance1>=minBalance){
      System.out.println("Balance is "+balance1);
      break;
    }
      else{
        System.out.println("Amount must be greater than minimum balance");
      }
    
   }
  }
}
public class BankAccount{
  public static void main(String args[]){
    SavingsAccount vh = new SavingsAccount();
    vh.withRaw();
    
  }
}