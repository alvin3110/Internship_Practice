import java.util.Scanner;
class student{
  private int rollno;
  private String Sname;
  private String Dept;

  void setrollno(int rollno)
  {
    this.rollno=rollno;
  }
  void setSname(String Sname)
  {
    this.Sname=Sname;
  }
  void setDept(String Dept)
  {
    this.Dept=Dept;
  }
  int getrollno()
  {
    return rollno;
  }
  String getSname()
  {
    return Sname;
  }
  String getDept()
  {
    return Dept;
  }
}
class Studentmain{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    student st[]=new student[3];
    for(int i=0;i<3;i++){
      st[i]=new student();
      st[i].setrollno(sc.nextInt());
      st[i].setSname(sc.next());
      st[i].setDept(sc.next());
    }
    for(int i=0;i<3;i++){
      System.out.println("Roll no:"+st[i].getrollno());
      System.out.println("Name:"+st[i].getSname());
      System.out.println("Department:"+st[i].getDept());
    }
  }
}