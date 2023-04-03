import java.util.*;

class Person implements Comparable<Person> {
  private String name;
  private int age;
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
        return age;
    }
  public int compareTo(Person p) {
    
    if (age == p.age) {
      return this.name.compareTo(p.name);
    } else {
      return Integer.compare(this.age, p.age);
    }
  }
}

class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

public class Persondemo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Person> people = new ArrayList<>();
    for(int i=0;i<3;i++){
      people.add(new Person(sc.next(), sc.nextInt()));
    }
  
    System.out.println("Before sorting:");
    for (Person p : people) {
      System.out.println(p.getName() + " " + p.getAge());
    }
    Collections.sort(people, new AgeComparator());
    System.out.println("\nSorted by age:");
    for (Person p : people) {
      System.out.println(p.getName() + " " + p.getAge());
    }
    Collections.sort(people);
    System.out.println("\nSorted by age and name:");
    for (Person p : people) {
      System.out.println(p.getName() + " " + p.getAge());
    }
  }
}
