import java.util.Scanner;
class ElectricityBill{
  public static void main(String args[]) {
    int unit;
    double amount, totalAmount, chargeAmount;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    unit = sc.nextInt();
    if (unit <= 50) {
      amount = unit * 0.50;
    }
    else if(unit <= 150) {
      amount = 25 + ((unit - 50) * 0.75);
    } 
    else if(unit <= 250) {
      amount = 100 + ((unit - 150) * 1.20);
    } 
    else{
      amount = 220 + ((unit - 250) * 1.50);
    }
    chargeAmount = amount * 0.20;
    totalAmount = amount + chargeAmount;
    System.out.println("Electricity bill price=" + totalAmount);
  }
}
 