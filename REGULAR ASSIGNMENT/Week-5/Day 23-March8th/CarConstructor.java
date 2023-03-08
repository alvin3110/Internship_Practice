import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class CarConstructor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(sc.next(), sc.next(), sc.nextInt());
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
    }
}
