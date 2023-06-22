import java.util.ArrayList;
class Product {
    String productName;
    String id;
    double price;

    Product(String productName, String id, double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }
}


public class Productmain {
  public static void main(String[] args) {
    ArrayList<Product> productList = new ArrayList<>();
    productList.add(new Product("Phone", "P001", 499.99));
    productList.add(new Product("Laptop", "L002", 1299.99));
    productList.add(new Product("Headphones", "H003", 99.99));
  }
}
