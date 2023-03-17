class ProductNotFoundException extends Exception {
    ProductNotFoundException(String str) {
        super(str);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}

class Store {
    private Product[] pr = new Product[10];
    private int nextIndex = 0;

    void addProduct(Product product) {
        if (nextIndex == pr.length) {
            Product[] newPr = new Product[pr.length * 2];
            System.arraycopy(pr, 0, newPr, 0, pr.length);
            pr = newPr;
        }
        pr[nextIndex] = product;
        nextIndex++;
    }

    void removeProduct(Product product) throws ProductNotFoundException {
        int index = -1;
        for (int i = 0; i < nextIndex; i++) {
            if (pr[i].getId() == product.getId()) {
                index = i;
            }
        }
        if (index == -1) {
            throw new ProductNotFoundException("Product not found in store.");
        }
        for (int i = index; i < nextIndex - 1; i++) {
            pr[i] = pr[i + 1];
        }
        pr[nextIndex - 1] = null;
        nextIndex--;
    }

    void displayProducts() {
        for (int i = 0; i < nextIndex; i++) {
            System.out.println(pr[i].getId() + " " + pr[i].getName() + " - $" + pr[i].getPrice());
        }
    }
}
class Productmain {
    public static void main(String[] args) {
      Store store = new Store();
      Product p1 = new Product(1213, "Product 1", 9.99);
      Product p2 = new Product(223, "Product 2", 19.99);
      Product p3 = new Product(3213, "Product 3", 29.99);
      store.addProduct(p1);
      store.addProduct(p2);
      try{
        store.removeProduct(p1);
        System.out.println("Product removed from store.");
      }
      catch(ProductNotFoundException e) {
        System.out.println(e);
      }
      store.displayProducts();  
      }
    }

      
      

       
