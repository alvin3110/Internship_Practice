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

public class StudentQueue {
    public static void main(String args[]) {
        Queue<Student> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student details for the queue:");
        for (int i = 0; i < 3; i++) {
            queue.offer(new Student(sc.next(), sc.next(), sc.nextInt()));
        }

        System.out.println("Students in the queue:");
        while (!queue.isEmpty()) {
            Student student = queue.poll();
            System.out.println(student.getName() + " " + student.getMarks() + " " + student.getId());
        }
    }
}
