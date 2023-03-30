import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String department;
    private int year;

    public Student(String name, int rollNumber, String department, int year) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }
}


class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the details of student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            System.out.print("Department: ");
            String department = sc.next();
            System.out.print("Year: ");
            int year = sc.nextInt();
            students.add(new Student(name, rollNumber, department, year));
        }
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Department: " + student.getDepartment());
            System.out.println("Year: " + student.getYear());
            System.out.println();
        }
    }
}
