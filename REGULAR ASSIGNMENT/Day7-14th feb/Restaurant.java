import java.util.Scanner;
class Restaurant{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Food Cost");
    double fc=sc.nextDouble();
    double tax=0.05*fc;
    System.out.println("Tax:"+tax);
    System.out.println("Enter Tip:");
    double tip=sc.nextDouble();
    double bill=fc+tax+tip;
    System.out.println("Total Bill:" +bill); 
  }
}