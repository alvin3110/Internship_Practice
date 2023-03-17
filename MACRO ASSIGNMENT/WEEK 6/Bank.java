// 1. Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
import java.util.*;
class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
  super(str);
} 
}
class BankAccount{
  int balance = 10000;
  Scanner sc = new Scanner(System.in);
 void deposit(){
   System.out.println("enter the money u wish to deposite");
   int dp=sc.nextInt();
   this.balance=balance+dp;  
   System.out.println("amount "+dp+" added succesfully"+"\n Balance="+this.balance);
 }
  void withdraw()throws InsufficientFundsException{
    System.out.println("enter how much money u wish to withdraw");
    int wd = sc.nextInt();
    if(wd>balance){
      throw new InsufficientFundsException("insufficient funds");
    }else{
      System.out.println("yes your entered amount is valid now you can take your money");
      this.balance=balance-wd; 
    }
    System.out.println("amount "+ wd +" withdrawn succesfully"+"\n Balance="+this.balance);
    
  }
  void checkBalance(){
    System.out.println("your a/c balance is = "+ balance);
  }
}
class Bank{
  public static void main(String args[]){
    BankAccount a=new BankAccount();
    a.deposit();
    try{
      a.withdraw();
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }
    a.checkBalance();
  }
}