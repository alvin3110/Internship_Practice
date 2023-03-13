class Student
{
  public void read()
  {
    System.out.println("Welcome");
  }
  public void read(String name)
  {
    System.out.println("Welcome "+name);
  }
  public void read(int no_of_copies)
  {
    System.out.println("my age is "+no_of_copies);
  }
}
class Methodoverloading
{
  public static void main(String args[])
  {
    Student student=new Student();
    student.read();
    student.read("alvin");
    student.read(10);
  }
}