import java.util.Scanner;
class Student{
  int id;
  String name;
  String Branch;
  double s1,s2,s3;
  void average(){
    double avg=(s1+s2+s3)/3;
    System.out.println(name+" Average is "+avg);
  }
  void percentage(){
    double per=((s1+s2+s3)/300)*100;
    System.out.println(name+" percentage is "+per);
  }
}
class StudentMain{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of student:");
    int n=sc.nextInt();
    Student st[]=new Student[n];
    for(int i=0;i<n;i++)
    {
      st[i]=new Student();
      System.out.println("Enter id:");
      st[i].id=sc.nextInt();
      System.out.println("Enter name:");
      st[i].name=sc.next();
     
      System.out.println("Enter 3 subs marks:");
      st[i].s1=sc.nextDouble();
      st[i].s2=sc.nextDouble();
      st[i].s3=sc.nextDouble();
      st[i].average();
      st[i].percentage();
    }
  }
}