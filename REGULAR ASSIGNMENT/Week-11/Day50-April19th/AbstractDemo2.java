abstract class Animal{
  String name;
  abstract void move();
  void eat(){
    System.out.println(name+" is moving");
  }
  void getName(){
    System.out.println(" name: "+name);
  }
 
}
class Dog extends Animal{
  void move(){
    System.out.println(name+" is moving");
  }
}
class Bird extends Animal{
  void move(){
    System.out.println(name+" bird is flying");
  }
}
class AbstractDemo2{
  public static void main(String args[]){
    Animal d=new Dog();
    Animal b=new Bird();
    d.name="doggyy";
    b.name="parrot";
    d.getName();
    d.move();
    b.move();
    b.getName();
  }
}