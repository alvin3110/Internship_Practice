import java.util.Scanner;
class Calgrade{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Physics marks:");
    double s1=sc.nextDouble();
    System.out.println("Enter Chemistry marks:");
    double s2=sc.nextDouble();
    System.out.println("Enter Mathematics marks:");
    double s3=sc.nextDouble();
    System.out.println("Enter Biology marks:");
    double s4=sc.nextDouble();
    System.out.println("Enter Computers marks:");
    double s5=sc.nextDouble();
    double per=((s1+s2+s3+s4+s5)/500)*100;
    System.out.println("Percentage:" +per); 
    if(per>=90)
      System.out.println("Grade:A");
    else if(per>=80 && per<90)
      System.out.println("Grade:B");
    else if(per>=70 && per<80)
      System.out.println("Grade:C");
    else if(per>=60 && per<70)
      System.out.println("Grade:D");
    else if(per>=50 && per<40)
      System.out.println("Grade:E");  
    else 
      System.out.println("FAIL");
    }
}