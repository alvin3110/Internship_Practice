class Animal{
  int noOfLegs;
  String color;
}
class Dog extends Animal{
  void bark(){
    System.out.println("Barking.......");
  }
}
class BabyDog extends Dog{
  void weep(){
    System.out.println("Weeping......");
  }
}
class Cat extends Animal{
  void meow(){
    System.out.println("Meow..........");
  }
}
class Animalmain{
  public static void main(String args[]){
    BabyDog bd=new BabyDog();
    bd.bark();
    bd.weep();
    Cat c=new Cat();
    c.meow();
  }
}