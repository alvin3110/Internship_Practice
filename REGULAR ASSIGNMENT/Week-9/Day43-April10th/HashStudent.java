import java.util.*;
class Student{
  String name;
  int id;
  int grade;
}
class HashStudent{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Student s = new Student();
    HashSet<Student> h = new HashSet<>();
    System.out.println("enter u r name");
    s.name =sc.next();
    System.out.println("enter id");
    s.id = sc.nextInt();
    System.out.println("enter grade");
    s.grade=sc.nextInt();
   // h.add(sc.next());
    h.add(s);
    //h.add(s.grade);
    System.out.println(s.name);
    for (Student student : h) {
      System.out.println(student.name+"\n "+student.grade+" \n"+student.id);
}
  }
}