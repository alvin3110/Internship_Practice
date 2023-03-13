class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Dog barks");
        super.speak();
    }
}

public class Overridingdemo2{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
    }
}
