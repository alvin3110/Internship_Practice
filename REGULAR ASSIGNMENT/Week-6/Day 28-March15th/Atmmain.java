interface  ATM{
  
  void withdraw(long account,double amount);
  void deposit(long account,double amount);
  void getbalance(long account);
}
class Operation implements ATM{
  double balance=10000;
  public void withdraw(long account,double amount){
   double balance=10000;
    if(amount<balance)
      System.out.println("Transaction Successful \nBalance="+(balance-amount));
    else
      System.out.println("Unsufficient Balance");
  }
  public void deposit(long account,double amount){
    this.balance=balance-amount;
    System.out.println("Account no:"+account+"\nBalance:"+this.balance);
  }
  public void getbalance(long account){
    this.balance=balance;
    System.out.println("Account no:"+account+"\nBalance:"+this.balance);
  }
}
 
class Atmmain{
  public static void main(String args[]){
    ATM opt=new Operation();
    opt.withdraw(23768374,6000);
    opt.deposit(3246757,6734);
    opt.getbalance(7465845);
  }
}