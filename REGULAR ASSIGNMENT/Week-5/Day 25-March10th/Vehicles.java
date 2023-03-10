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
public class Vehicles{
  public static void main(String args[]){
    Car vh = new Car();
    vh.color="blue";
    vh.model="rx200";
    vh.year=2011;
    vh.noOfDoor=2;
    vh.make="bmw";
    vh.getInfo();
    
  }
}