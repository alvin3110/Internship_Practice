import java.util.Scanner;
class Grade{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Grade in sub1");
    int s1=sc.nextInt();
    System.out.println("Enter Grade in sub2:");
    int s2=sc.nextInt();
    System.out.println("Enter Grade in sub3:");
    int s3=sc.nextInt();
    int avg=(s1+s2+s3)/3;
    System.out.println("Avg Grade:" +avg); 
  }
}