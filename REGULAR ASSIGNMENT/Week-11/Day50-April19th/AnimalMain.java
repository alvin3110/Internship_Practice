class Animal {
  public void makeSound() {
    System.out.println("This animal makes a sound.");
  }
}
class Dog extends Animal {
  public void makeSound() {
    System.out.println("The dog barks.");
  }
}
class Cat extends Animal {
  public void makeSound() {
    System.out.println("The cat meows.");
  }
}
class Cow extends Animal {
  public void makeSound() {
    System.out.println("The cow moos.");
  }
}
public class AnimalMain {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    Animal dog1 = new Dog();
    Animal cat1 = new Cat();
    Animal cow1 = new Cow();
    
    animal1.makeSound(); 
    dog1.makeSound(); 
    cat1.makeSound(); 
    cow1.makeSound(); 
  }
}
