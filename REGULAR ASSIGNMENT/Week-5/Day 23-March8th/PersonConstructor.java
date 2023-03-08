import java.util.Scanner;
class Person {
  private String name;
  private int age;
  private String address = "Unknown";
  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
  String getName() {
        return name;
    }
  int getAge() {
        return age;
    }
  String getAddress() {
        return addss;
    }
}
class PersonConstructor {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        Person myCar = new Person(sc.next(),sc.nextInt(),sc.next());
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
    }
}

