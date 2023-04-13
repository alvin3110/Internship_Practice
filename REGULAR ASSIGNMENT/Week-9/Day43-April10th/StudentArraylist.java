import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public Student findStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student findStudentByName(String name) {
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public int size() {
        return studentList.size();
    }

    public Student get(int index) {
        return studentList.get(index);
    }
}

class StudentArraylist {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        studentList.addStudent(new Student("Alice", 123, 3.8));
        studentList.addStudent(new Student("Bob", 456, 3.4));
        studentList.addStudent(new Student("Charlie", 789, 3.2));

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println(student.getName() + " " + student.getId());
        }

        Student foundStudent = studentList.findStudentById(456);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getName());
        } else {
            System.out.println("Student not found.");
        }

        studentList.removeStudent(studentList.findStudentByName("Charlie"));
    }
}



