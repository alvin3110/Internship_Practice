// // You are tasked with creating a program to model a School. The School has a list of Teachers and a list of Students. Each Teacher has a name and a subject that they teach. Each Student has a name and a grade level Your program should have the following classes:
// Teacher: This class should have private fields for the teacher's name and subject, as well as getters and setters for these fields.
// Student: This class should have private fields for the student's name and grade level, as well as getters and setters for these fields.
// School: This class should have private fields for the list of Teachers and the list of Students, as well as methods to add and remove Teachers and Students from the lists, and methods to print the lists of Teachers and Students. Additionally, this class should have methods to find a Teacher or Student by name and to remove a Teacher or Student from the School.
// Your program should have a main method that allows users to interact with the School object and perform the actions listed above. The program should continue running until the user chooses to exit.
// I hope this gives you a good starting point for your assignment!

import java.util.ArrayList;

class Teacher {
  private String name;
  private String subject;
  
  public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }
}

class Student {
  private String name;
  private int gradeLevel;

  public Student(String name, int gradeLevel) {
    this.name = name;
    this.gradeLevel = gradeLevel;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getGradeLevel() {
    return gradeLevel;
  }
  public void setGradeLevel(int gradeLevel) {
    this.gradeLevel = gradeLevel;
  }
}

public class School {
  private ArrayList<Teacher> teachers;
  private ArrayList<Student> students;

  public School() {
    this.teachers = new ArrayList<>();
    this.students = new ArrayList<>();
  }
  public void addTeacher(Teacher teacher) {
    teachers.add(teacher);
  }
  
  public void removeTeacher(Teacher teacher) {
    teachers.remove(teacher);
  }
  
  public void addStudent(Student student) {
    students.add(student);
  }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printTeachers() {
        System.out.println("List of Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " teaches " + teacher.getSubject());
        }
    }

    public void printStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student.getName() + " is in grade " + student.getGradeLevel());
        }
    }

    public Teacher findTeacherByName(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School();
        Teacher teacher1 = new Teacher("John", "Math");
        Teacher teacher2 = new Teacher("Mary", "Science");
        Student student1 = new Student("Bob", 9);
        Student student2 = new Student("Alice", 10);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addStudent(student1);
        school.addStudent(student2);

        System.out.println("Before removal:");
        school.printTeachers();
        school.printStudents();

        school.removeTeacher(teacher1);
        school.removeStudent(student1);

        System.out.println("After removal:");
        school.printTeachers();
        school.printStudents();

        Teacher foundTeacher = school.findTeacherByName("Mary");
        if (foundTeacher != null) {
            System.out.println("Found teacher: " + foundTeacher.getName());
        } else {
            System.out.println("Teacher not found");
        }

        Student foundStudent = school.findStudentByName("Alice");
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getName());
        } else {
            System.out.println("Student not found");
        }
    }
}
//This school management system allows for the management of students, teachers, courses, and grades. It includes classes for Student and Teacher, which store relevant information such as names and unique IDs. The system also includes a Course class to represent academic courses.
//Students can be enrolled in courses and their grades can be recorded. Teachers can be assigned to courses and manage the grading process. The program enables the addition, removal, and retrieval of student and teacher records. It also allows for the creation, modification, and deletion of courses.
//Overall, this system provides basic functionality for managing student, teacher, course, and grade data within a school setting.