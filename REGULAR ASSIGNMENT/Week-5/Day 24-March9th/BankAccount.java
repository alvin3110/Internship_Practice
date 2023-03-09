public class BankAccount {
  int balance;
  int account_number;
  public void deposit(int amount) {
    balance = balance + amount;
  }
  public void withdraw(int amount) {
    balance = balance - amount;
  }
  public void display() {
    System.out.println("Balance is: " + balance);
  }
  public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    obj.balance = 1000;
    obj.account_number = 12345;

    obj.deposit(500);
    obj.withdraw(200);
    obj.display();

  }

}