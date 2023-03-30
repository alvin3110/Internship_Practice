import java.util.*;
class Person {
    String name;
    int age;
  
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonArrayList{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> p = new ArrayList<Person>();


        for (int i = 0; i < 3; i++) {
            p.add(new Person(sc.next(), sc.nextInt()));
        }


        for (Person person : p) {
            System.out.println("Name : " + person.name + "\tAge : " + person.age);
        }
      
        int max = 0;
        for (Person person : p) {
            if (person.age > max) {
                max = person.age;
            }
        }


        System.out.println("person with highest age ");
        for (Person person : p) {
            if (person.age == max) {
                System.out.println("Name : " + person.name + "\tAge : " + person.age);
            }
        }
    }
}
