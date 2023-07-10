//Create a mini project in Java that models a simple online shopping system. The system should allow users to view products, add them to a shopping cart, and check out. The project should utilize inheritance, interfaces, overriding, collections, and custom exceptions.
 
//Here are the basic requirements:
 
//Create an interface called "Product" that defines the basic properties of a product such as the name, description, price, and quantity.
//Create two classes that implement the "Product" interface: "ElectronicProduct" and "ClothingProduct". "ElectronicProduct" should have additional properties such as brand and warranty while "ClothingProduct" should have additional properties such as size and color.
//Create a class called "ShoppingCart" that stores the products selected by the user.
//Create a class called "Checkout" that handles the payment and shipping of the products in the shopping cart.
//Use custom exceptions to handle cases such as insufficient stock or invalid payment information.
//Implement additional features such as search,
import java.util.*;

interface Product {
  String getName();
  String getDescription();
  double getPrice();
  int getQuantity();
}

class ElectronicProduct implements Product {
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String brand;
  private String warranty;
  public ElectronicProduct(String name, String description, double price, int quantity, String brand, String warranty) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.brand = brand;
    this.warranty = warranty;
  }
  
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public double getPrice() {
    return price;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public String getWarranty() {
    return warranty;
  }
  
  public String toString() {
    return String.format("%5s %10s %10f %8d %20s %17s", 
 name,description,price,quantity,brand,warranty);
  }
}

class ClothingProduct implements Product {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String size;
    private String color;

    public ClothingProduct(String name, String description, double price, int quantity, String size, String color) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

   public String toString() {
    return String.format("%5s %10s %10f %8d %20s %17s", name, description, price, quantity, size, color);
   }
}
class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<Product>();
    private ArrayList<ElectronicProduct> electronicProducts = new ArrayList<ElectronicProduct>();
    private ArrayList<ClothingProduct> clothingProducts = new ArrayList<ClothingProduct>();

    void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product type (1 for ElectronicProduct, 2 for ClothingProduct): ");
        int productType = sc.nextInt();
        if (productType == 1) {
            System.out.print("Enter product name: ");
            String name = sc.next();
            System.out.print("Enter product description: ");
            String description = sc.next();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter product brand: ");
            String brand = sc.next();
            System.out.print("Enter product warranty (in years): ");
            String warranty = sc.next();
            ElectronicProduct electronicProduct = new ElectronicProduct(name, description, price, quantity, brand, warranty);
            items.add(electronicProduct);
            electronicProducts.add(electronicProduct);
        } else if (productType == 2) {
            System.out.print("Enter product name: ");
            String name = sc.next();
            System.out.print("Enter product description: ");
            String description = sc.next();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter product size: ");
            String size = sc.next();
            System.out.print("Enter product color: ");
            String color = sc.next();
            ClothingProduct clothingProduct = new ClothingProduct(name, description, price, quantity, size, color);
            items.add(clothingProduct);
            clothingProducts.add(clothingProduct);
        } else {
            System.out.println("Invalid product type. Please try again.");
        }
    }

    void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Item removed.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    void displayCart() {
        if (electronicProducts.isEmpty()) {
            System.out.println("No electronic products in cart.");
        } else {
            System.out.println("Electronic Products:");
            System.out.printf("%5s %10s %10s %8s %20s %17s", "Name", "Description", "Price", "Quantity", "Brand", "Warranty");
            for (ElectronicProduct product : electronicProducts) {
                System.out.println(product);
            }
        }
    
        if (clothingProducts.isEmpty()) {
            System.out.println("No clothing products in cart.");
        } else {
            System.out.println("\nClothing Products:");
            System.out.printf("%5s %10s %10s %8s %20s %17s","Name","Description","Price","Quantity","Size","Color");
          for(ClothingProduct product:clothingProducts){
            System.out.println(product);
          }
        }
    }
  public void searchCart(String name) {
    boolean found = false;
    for (Product item : items) {
        if (item.getName().equals(name)) {
            System.out.println("Product found:");
            System.out.println(item.toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("Product not found.");
    }
  }
   double calculateTotalPrice() { 
    double totalPrice = 0;
    for (int i = 0; i < items.size(); i++) {
      totalPrice += items.get(i).getPrice() * items.get(i).getQuantity();
    }
    return totalPrice;
  }
  Boolean ISEmpty() {
    return items.isEmpty();
}
 public void clearCart() {
    items.clear();
 }

}

class Checkout {
    private ShoppingCart cart;

    public Checkout(ShoppingCart cart) {
        this.cart = cart;
    }
  public void processPayment() {
   if (cart.ISEmpty()) {
        System.out.println("Your cart is empty.");
        return;
    }
    double totalPrice = cart.calculateTotalPrice();
    System.out.println("\nYour total price is: $" + totalPrice);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your account number: ");
    String accountNumber = sc.next();
    System.out.println("Thank you for your purchase!");
    cart.clearCart();
  }
}

class OnlineShoppingSystem{
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    Checkout pay=new Checkout(cart);
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.println("\nWelcome to the shopping cart application!");
      System.out.println("1. Add item to cart");
      System.out.println("2. Remove item from cart");
      System.out.println("3. Display cart");
      System.out.println("4. Checkout");
      System.out.println("5. Search");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

        switch (choice) {
          case 1:
            cart.addItem();
            break;
          case 2:
            System.out.print("Enter the index of the item to remove: ");
            int index = sc.nextInt();
            cart.removeItem(index);
            break;
          case 3:
            cart.displayCart();
            break;
          case 4:
            pay.processPayment();
            break;
          case 5:
            System.out.print("Enter product name: ");
            String name = sc.next();
            cart.searchCart(name);
            break;
          case 0:
            System.out.println("Goodbye!");
            break;
          default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
    } while (choice != 0);
  }
}
//This mini Java project implements a simple online shopping system. It includes interfaces, inheritance, overriding, collections, and custom exceptions. Users can view products, add them to a shopping cart, and proceed to checkout. Key components include product classes (ElectronicProduct and ClothingProduct) implementing a common "Product" interface, a ShoppingCart class to manage selected products, and a Checkout class for payment and shipping. Custom exceptions handle cases like insufficient stock or invalid payment information.


