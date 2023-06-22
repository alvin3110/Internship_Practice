import java.util.*;

class Student {
    private String name;
    private String id;
    private int marks;

    Student(String name, String id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class StudentMain {
    public static void main(String args[]) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student details:");
        for (int i = 0; i < 3; i++) {
            list.add(new Student(sc.next(), sc.next(), sc.nextInt()));
        }
        for (Student student : list) {
            System.out.println(student.getName() + " " + student.getMarks() + " " + student.getId());
        }
    }
}
