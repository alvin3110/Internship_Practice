// Create an abstract class called Student with the following attributes:
// id (int): The unique ID of the student.
// name (String): The name of the student.
// grade (int): The grade or year of study for the student

// Create a subclass called RegularStudent that extends the Student class. Add an additional attribute:
// department (String): The department in which the regular student is enrolled.

// Create another subclass called DistanceLearningStudent that extends the Student class. Add an additional attribute:
// location (String): The location from which the distance learning student is studying.

// Create an interface called Study with the following methods:

// studyMaterials(): A method that displays the study materials for the student.
// submitAssignment(): A method that allows the student to submit an assignment.

// Implement the Study interface in both the RegularStudent and DistanceLearningStudent classes. Provide appropriate implementations for the methods in each class.


abstract class Student{
  private int id;
  private String name;
  private int grade;

  Student(int id,String name,int grade){
    this.name=name;
    this.id=id;
    this.grade=grade;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getGrade() {
    return grade;
  }
  public void setGrade(int grade) {
    this.grade = grade;
  }
}

interface Study{
  void studyMaterials();
  void submitAssignment();
}

class RegularStudent extends Student implements Study{
  private String department;

  RegularStudent(int id,String name,int grade,String department){
    super(id, name, grade);
    this.department=department;
  }
  public void studyMaterials(){
    System.out.println("study materials");
  }
  public void submitAssignment(){
    System.out.println("assignment submitted");
  }

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}
  
}

class DistanceLearningStudent extends Student implements Study{
  private String location;
  
  DistanceLearningStudent(int id,String name,int grade,String location){
    super(id, name, grade);
    this.location=location;
  }
  public void studyMaterials(){
    System.out.println("study materials");
  }
  public void submitAssignment(){
    System.out.println("assignment submitted");
  }
  

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}
  
}

public class StudentAbstract{
  public static void main(String args[]){
    RegularStudent s=new RegularStudent(11,"Alvin",10,"science");
    DistanceLearningStudent ls=new DistanceLearningStudent(101,"Alvin K Sebastian",8,"Bangalore");
    
    
    System.out.println(r.getId()+"\n"+r.getName()+"\n"+r.getGrade()+"\n"+r.getDepartment()+"\n"+d.getLocation());

    s.submitAssignment();
    s.studyMaterials();

    ls.submitAssignment();
    ls.studyMaterials();
  }
}