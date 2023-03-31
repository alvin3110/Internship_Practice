import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String productName;
    String id;
    double price;

    Product(String productName, String id, double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class ProductList {
    ArrayList<Product> products = new ArrayList<Product>();

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(String id) {
        if (searchProduct(id)) {
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    products.remove(product);
                    System.out.println("Product Found and removed");
                    return;
                }
            }
        } else {
            System.out.println("Product Not found");
        }
    }

    void display() {
        for (Product product : products) {
            System.out.println(product.getProductName() + " " + product.getPrice());
        }
    }

    boolean searchProduct(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                System.out.println("Product Found");
                return true;
            }
        }
        System.out.println("Product Not found");
        return false;
    }

    void updateProduct(String id, String newProductName, double newPrice) {
        if (searchProduct(id)) {
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    product.setProductName(newProductName);
                    product.setPrice(newPrice);
                    System.out.println("Product Updated");
                    return;
                }
            }
        }
    }
}

class ProductMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ProductList p = new ProductList();

        while (true) {
            System.out.println("Enter a command (add, remove, display, search, update, exit): ");
            String command = sc.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Enter product details: ");
                p.addProduct(new Product(sc.next(), sc.next(), sc.nextDouble()));
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.println("Enter product id: ");
                p.removeProduct(sc.next());
            } else if (command.equalsIgnoreCase("display")) {
                p.display();
            } else if (command.equalsIgnoreCase("search")) {
                System.out.println("Enter product id: ");
                p.searchProduct(sc.next());
            } else if (command.equalsIgnoreCase("update")) {
                System.out.println("Enter product id: ");
                String id = sc.next();
                System.out.println("Enter new product name: ");
                String newProductName = sc.next();
                System.out.println("Enter new product price: ");
                double newPrice = sc.nextDouble();
                p.updateProduct(id, newProductName, newPrice);
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
