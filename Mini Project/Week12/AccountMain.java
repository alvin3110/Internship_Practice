/*Create an interface called "Account" that defines the basic properties of an account such as the account number, account type, balance, and interest rate.
Create two classes that implement the "Account" interface: "CheckingAccount" and "SavingsAccount". "CheckingAccount" should allow users to withdraw and deposit money while "SavingsAccount" should have an additional method to calculate interest.
Create a class called "Bank" that stores the accounts and handles the creation and deletion of accounts.
Implement a method in the "Bank" class to transfer funds between accounts.
Use custom exceptions to handle cases such as insufficient funds or invalid account information.
Implement additional features such as searching for accounts by account number or account type, and displaying the account transactions.*/
import java.util.*;

interface Account {
    String getAccountNumber();
    String getAccountType();
    double getBalance();
    double getInterestRate();
}

class CheckingAccount implements Account {
  private String accountNumber;
  private String accountType;
  private double balance;
  private double interestRate;

  public CheckingAccount(String accountNumber, String accountType, double balance, double interestRate){
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;
    this.interestRate = interestRate;
  }

  public String getAccountNumber(){
    return accountNumber;
  }

  public String getAccountType(){
    return accountType;
  }

  public double getBalance(){
    return balance;
  }

  public double getInterestRate(){
    return interestRate;
  }

  public void depositMoney(double amount){
    balance += amount;
  }

  public void withdrawMoney(double amount) {
    if(balance > amount){
      balance -= amount;
    }
  }

}

class SavingsAccount implements Account{
  private String accountNumber;
  private String accountType;
  private double balance;
  private double interestRate;

  public SavingsAccount(String accountNumber, String accountType, double balance, double interestRate){
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;
    this.interestRate = interestRate;
  }

  public String getAccountNumber(){
    return accountNumber;
  }

  public String getAccountType(){
    return accountType;
  }

  public double getBalance(){
    return balance;
  }

  public double getInterestRate(){
    return interestRate;
  }

  public double calculateInterest(){
    return balance * interestRate;   
  }
}

class Bank{
  private ArrayList<Account> accounts = new ArrayList<Account>();

  public void createAccount(Account account){
    accounts.add(account);
  }

  public void deleteAccount(Account account){
    accounts.remove(account);
  }

  public void transferFund(){
    
  }

  public void searchByAccountNumber(String accountNum){
    int count = 0;
    for(Account account : accounts){
      if(account.getAccountNumber().equals(accountNum)){
        count++;        
      }
    
    if(count>0){
          System.out.println("Account Number is present and is a "+account.getAccountType() + " Account");
      }
    
      else{
        System.out.println("Account Number is not present in the bank");
        
      }
  }
  }

  public void searchByAccountType(String accountType){
    for(Account account : accounts){
      if(account.getAccountType().equals(accountType)){
        System.out.println("The Account type is present"+account.getAccountType() +" and has the Account number" + account.getAccountNumber());
        break;
      }
      else{
        System.out.println("Account Type is not present in the bank");
        break;
      }
    }
  }
  
}

public class AccountMain{
  public static void main(String[] args){
    Bank bank = new Bank();

    Account checkingAccount = new CheckingAccount("1234567890", "Checking", 1000.0, 0.01);
    Account savingsAccount = new SavingsAccount("1987654321", "Savings", 5000.0, 0.02);

    bank.createAccount(checkingAccount);
    bank.createAccount(savingsAccount);
    
    bank.searchByAccountNumber("1987654321");
    bank.searchByAccountType("Savings");
  }
}
//The given code implements a basic banking system with checking and savings accounts. It includes classes for CheckingAccount, SavingsAccount, and Bank. The CheckingAccount and SavingsAccount classes represent different types of accounts and have methods to retrieve account information, deposit and withdraw money, and calculate interest (only in the SavingsAccount class).
//The Bank class manages a list of accounts and provides methods to create and delete accounts, as well as search for accounts by account number or account type.
//In the main method, a Bank object is created, and instances of CheckingAccount and SavingsAccount are added to the bank. The code demonstrates searching for accounts by account number and account type.