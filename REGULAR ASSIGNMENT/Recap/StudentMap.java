import java.util.*;

class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class StudentHashMap {
    private HashMap<Integer, Student> hashmap = new HashMap<>();

    public void addStudent(int id, String name, int age, int marks) {
        hashmap.put(id, new Student(name, age, marks));
    }

    public void removeStudent(int id) {
        hashmap.remove(id);
    }

    public void searchStudent(int id) {
        Student student = hashmap.get(id);
        if (student != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Marks: " + student.getMarks());
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }

    public void display() {
        System.out.println("Student List:");
        for (Map.Entry<Integer, Student> entry : hashmap.entrySet()) {
            Student student = entry.getValue();
            System.out.println("ID: " + entry.getKey());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Marks: " + student.getMarks());
        }
    }
}

public class StudentMap {
    public static void main(String[] args) {
        StudentHashMap studentMap = new StudentHashMap();
        studentMap.addStudent(1, "Alvin", 23, 77);
        studentMap.display();
    }
}
