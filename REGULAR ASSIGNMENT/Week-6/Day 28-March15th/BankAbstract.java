abstract class BankAccount {
  abstract String getAccountNumber();
  abstract void withdraw(double amount);
  abstract void deposit(double amount);
}
class SavingsAccount extends BankAccount {
    private String accountNumber;
    private double balance;
  SavingsAccount(String accountNumber, double initialBalance) {
      this.accountNumber = accountNumber;
      this.balance = initialBalance;
    }
  String getAccountNumber() {
        return this.accountNumber;
    }
  void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Rs" + amount + " withdrawn from savings account " + this.accountNumber + ".");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Rs" + amount + " deposited into savings account " + this.accountNumber + ".");
    }
}

class CheckingAccount extends BankAccount {
    private String accountNumber;
    private double balance;

    CheckingAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    String getAccountNumber() {
        return this.accountNumber;
    }

    void withdraw(double amount) {
        double withdrawalFee = 1.5;
        if (amount + withdrawalFee > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount + withdrawalFee;
            System.out.println("Rs" + amount + " withdrawn from checking account " + this.accountNumber + ". Withdrawal fee of Rs" + withdrawalFee + " charged.");
        }
    }
  void deposit(double amount) {
    this.balance += amount;
    System.out.println("$" + amount + " deposited into checking account " + this.accountNumber + ".");
    }
}
class BankAbstract{
  public static void main(String args[]){
    BankAccount a=new SavingsAccount("ahasgd7635474",38621);
    a.deposit(15273);
    a.withdraw(6579);
    BankAccount b=new CheckingAccount("ahasgd7635474",38621);
    b.deposit(15273);
    b.withdraw(6579);
    
    
  }
  
}


  
