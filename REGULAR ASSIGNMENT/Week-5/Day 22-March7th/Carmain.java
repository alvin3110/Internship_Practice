import java.util.Scanner;
class Car {
    String make;
    String model;
    int year;
    String color;
  
  public void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter make");
    make = sc.next();
    System.out.println("enter model");
    model= sc.next();
    System.out.println("Enter Year");
    year = sc.nextInt();
    System.out.println("Enter Color");
    color = sc.next();
  }
  void display() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Color: " + color);
  }
}
class Carmain{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Car car[] = new Car[n];
    for(int i=0;i<n;i++)
    {
      car[i] = new Car();
      car[i].read();
      car[i].display();
    }
}
}
