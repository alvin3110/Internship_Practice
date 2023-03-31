import java.util.Scanner;
import java.util.*;

class Item {
  private String name;
  private double price;
  
  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }
  
  public String getName() {
    return name;
  }
  
  public double getPrice() {
    return price;
  }
}

class ShoppingCart {
  Scanner sc = new Scanner(System.in);
  ArrayList<Item> cart;
  ShoppingCart() {
    cart = new ArrayList<>();
  }

  public void add() {
    System.out.print("Enter item name: ");
    String name = sc.nextLine();
    System.out.print("Enter item price: ");
    double price = sc.nextDouble();
    Item item = new Item(name, price);
    cart.add(item);
    System.out.println(name + " added to cart.");
  }

  public void remove() {
    System.out.print("Enter index of item to remove: ");
    int index = sc.nextInt();
    if (index < 0 || index >= cart.size()) {
      System.out.println("Invalid index.");
      return;
    }
    Item removedItem = cart.remove(index);
    System.out.println(removedItem.getName() + " removed from cart.");
  }

  public void display() {
    System.out.println("Items in cart:");
    for (Item item : cart) {
      System.out.println("- " + item.getName() + " (Rs" + item.getPrice() + ")");
    }
    System.out.println("Total cost: Rs" + getTotalCost());
  }
  
  public double getTotalCost() {
    double total = 0.0;
    for (Item item : cart) {
      total += item.getPrice();
    }
    return total;
  }
}

public class Cart {
  public static void main(String[] args) {
    ShoppingCart s = new ShoppingCart();
    int choice=0;
    do {
      System.out.println("Menu:");
      System.out.println("1. Add item to cart");
      System.out.println("2. Remove item from cart");
      System.out.println("3. Display cart contents");
      System.out.println("4. Quit");
      System.out.print("Enter choice: ");
      Scanner sc = new Scanner(System.in);
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          s.add();
          break;
        case 2:
          s.remove();
          break;
        case 3:
          s.display();
          break;
        case 4:
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    } while (choice != 4);
  }
}

