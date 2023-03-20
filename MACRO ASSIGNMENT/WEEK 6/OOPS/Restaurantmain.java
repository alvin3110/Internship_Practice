class Dish {
    private String name;
    private String[] ingredients;
    private double price;

    public Dish(String name, String[] ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}
class Restaurant {
    private Dish[] dishes;
    private int numDishes;

    public Restaurant() {
        this.dishes = new Dish[10];
        this.numDishes = 0;
    }

    public void addDish(Dish dish) {
        if (numDishes < dishes.length) {
            dishes[numDishes] = dish;
            numDishes++;
        } else {
            System.out.println("Error: Restaurant is full");
        }
    }

    public void removeDish(Dish dish) {
        int index = -1;
        for (int i = 0; i < numDishes; i++) {
            if (dishes[i] == dish) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < numDishes - 1; i++) {
                dishes[i] = dishes[i + 1];
            }
            dishes[numDishes - 1] = null;
            numDishes--;
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < numDishes; i++) {
            totalCost += dishes[i].getPrice();
        }
        return totalCost;
    }
}
public class Restaurantmain {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Spaghetti Bolognese", new String[]{"spaghetti", "tomato sauce", "Fish"}, 125.99);
        Dish dish2 = new Dish("Margherita Pizza", new String[]{"pizza dough", "tomato sauce", "mozzarella"}, 229.99);
        Dish dish3 = new Dish("Chicken Caesar Salad", new String[]{"romaine lettuce", "grilled chicken", "croutons", "caesar dressing"}, 118.99);

        Restaurant restaurant = new Restaurant();
        restaurant.addDish(dish1);
        restaurant.addDish(dish2);
        restaurant.addDish(dish3);

        System.out.println("Total cost of all dishes: " + restaurant.getTotalCost());
        restaurant.removeDish(dish2);
      System.out.println("Total cost of all dishes: " + restaurant.getTotalCost());
    }
}
