//Bank Account: Create a class called BankAccount that has properties such as account number, balance, and account holder name. Create subclasses such as CheckingAccount, SavingAccount and CreditAccount that inherit from BankAccount and add additional properties such as interest rate or credit limit. Create methods to deposit and withdraw money, check the balance and return the account details in the parent class, and override them in the subclasses to implement specific behavior for each account type.
class BankAccount {
  private String accountNumber;
  private double balance;
  private String accountHolderName;
  
  public BankAccount(String accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }
  public String getAccountNumber() {
    return accountNumber;
  }
  public double getBalance() {
    return balance;
  }
  public String getAccountHolderName() {
    return accountHolderName;
  }
  public void deposit(double amount) {
    balance += amount;
  }
  public void withdraw(double amount) {
    balance -= amount;
  }
  public void checkBalance() {
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: $" + balance);
  }
}

class CheckingAccount extends BankAccount {
    private double interestRate;
  public CheckingAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
    super(accountNumber, balance, accountHolderName);
    this.interestRate = interestRate;
  }
  public double getInterestRate() {
    return interestRate;
  }

    public void checkBalance() {
        System.out.println("Account Type: Checking Account");
        super.checkBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    public void checkBalance() {
        System.out.println("Account Type: Savings Account");
        super.checkBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CreditAccount extends BankAccount {
    private double creditLimit;
    
    public CreditAccount(String accountNumber, double balance, String accountHolderName, double creditLimit) {
        super(accountNumber, balance, accountHolderName);
        this.creditLimit = creditLimit;
    }
    
    public double getCreditLimit() {
        return creditLimit;
    }
    public void checkBalance() {
        System.out.println("Account Type: Credit Account");
        super.checkBalance();
        System.out.println("Credit Limit: $" + creditLimit);
    }
}

public class Bankoops {
    public static void main(String[] args) {
        BankAccount checkingAccount = new CheckingAccount("123456789", 1000.00, "John Smith", 0.5);
        checkingAccount.checkBalance();
        checkingAccount.deposit(500.00);
        checkingAccount.checkBalance();
        checkingAccount.withdraw(200.00);
        checkingAccount.checkBalance();
        
        BankAccount savingsAccount = new SavingsAccount("987654321", 5000.00, "Jane Doe", 1.2);
        savingsAccount.checkBalance();
        savingsAccount.deposit(1000.00);
        savingsAccount.checkBalance();
        savingsAccount.withdraw(3000.00);
        savingsAccount.checkBalance();
        
        BankAccount creditAccount = new CreditAccount("567890123", -2000.00, "Bob Johnson", 5000.00);
        creditAccount.checkBalance();
        creditAccount.deposit(2000.0);
       creditAccount.checkBalance();
    }
}
      

