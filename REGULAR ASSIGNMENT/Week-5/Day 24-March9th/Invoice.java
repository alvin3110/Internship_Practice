class Invoice {

  String customerName;
  String productName;
  int quantity;
  double price;

  Invoice(String customerName, String productName, int quantity, double price) {
    this.customerName = customerName;
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  void display() {
    System.out.println(customerName);
    System.out.println(productName);
    System.out.println(quantity);
    System.out.println(price);
  }

  double getInvoiceAmount() {
    return quantity * price;
  }
}

public class InvoiceUsingConstructor {
  public static void main(String[] args) {
    Invoice I = new Invoice("John", "Pen", 10, 10.0);
    System.out.println("total price of the product is: " + (I.getInvoiceAmount()));
  }

}
