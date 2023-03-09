import java.util.*;

class BankLoan {

  double loanAmount;
  double interestRate;
  int paymentPeriod;

  BankLoan(double loanAmount, double interestRate) {
    this.loanAmount = loanAmount;
    this.interestRate = interestRate;
    this.paymentPeriod = (int) (loanAmount / interestRate);
  }
}

public class BankLoanUsingCons {
  public static void main(String[] args) {
    BankLoan loan = new BankLoan(1000, 10);
    System.out.println("Loan Amount: " + loan.loanAmount);
    System.out.println("Interest Rate: " + loan.interestRate);
    System.out.println("Payment Period: " + loan.paymentPeriod);
  }
}