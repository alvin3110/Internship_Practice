import java.util.Scanner;

class Product {
    int id;
    double price;
    
    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }
    
    public double calculateDiscount() {
        return 0.0; 
    }
}

class Electronics extends Product {
    public Electronics(int id, double price) {
        super(id, price);
    }
    
    public double calculateDiscount(double purchaseAmount) {
        if (purchaseAmount >= 1000.0) {
            return 0.1 * price; 
        } else {
            return 0.05 * price; 
        }
    }
}

class Apparel extends Product {
    public Apparel(int id, double price) {
        super(id, price);
    }
    
    public double calculateDiscount(String season) {
        if (season.equals("Winter")) {
            return 0.2 * price; 
        } else {
            return 0.1 * price; 
        }
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Electronics laptop = new Electronics(231, 23123.0);
        double laptopDiscount = laptop.calculateDiscount(21623.0);
        System.out.println("Laptop discount: " + laptopDiscount);
        
        Apparel shirt = new Apparel(132, 812.0);
        double shirtDiscount = shirt.calculateDiscount("Winter");
        System.out.println("Shirt discount: " + shirtDiscount);
    }
}


