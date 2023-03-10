class Animal {
  String name;
  String color;
  int tailLength;
  int no_of_legs;
  void eat() {
    System.out.println("eating......");
  }
}
class Dog extends Animal {
  String bread;
  String type_of_dog;
  void bark() {
    System.out.println("barking......");
  }
  void displayProperties() {
    System.out.println(name + " " + color + " " + tailLength + " " + no_of_legs + " " + bread + " " + type_of_dog);
  }
}
public class Inheritancedemo {
  public static void main(String args[]) {
    Dog dog = new Dog();
    dog.name = "puppy";
    dog.color = "white";
    dog.no_of_legs = 4;
    dog.tailLength = 2;
    dog.bread = "lab";
    dog.type_of_dog = "petdog";
    dog.displayProperties();
    dog.eat();
    dog.bark();
  }
}