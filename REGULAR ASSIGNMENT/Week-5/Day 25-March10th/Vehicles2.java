class Vehicle{
  String make,model;
  int year;
  
}
class Car extends Vehicle{
  String color;
  int noOfDoor;
  void  getInfo(){
   System.out.println("Make "+make);
    System.out.println("model "+model);
    System.out.println("year "+year);
    System.out.println("color "+color);
    System.out.println("no of door  "+noOfDoor);
    
  }
}
  class SuperCar extends Car{
    int topSpeed;
    void rev_engine(){
      System.out.println(".........vroom.................");
    }
  }

public class Vehicles2{
  public static void main(String args[]){
      SuperCar vh = new SuperCar();
    vh.color="blue";
    vh.model="rx200";
    vh.year=2011;
    vh.noOfDoor=2;
    vh.make="bmw";
    vh.getInfo();
    vh.rev_engine();
    
  }
}