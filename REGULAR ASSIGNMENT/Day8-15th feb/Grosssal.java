import java.util.Scanner;
class Grosssal{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Basic Salary");
    double Basic=sc.nextDouble();
    double DA=0,HRA=0,gross;
    if(Basic<= 10000)
    {
      DA=Basic* 0.8;
      HRA= Basic*0.2;
    }
    else if(Basic<= 20000)
    {
      DA= Basic*0.9;
      HRA=Basic*0.25;
    }
    else if(Basic> 20000)
    {
      DA=Basic*0.95;
      HRA=Basic*0.3;
    }
    gross=Basic+DA+HRA;
    System.out.println("Gross Salary:"+gross);
  }
}