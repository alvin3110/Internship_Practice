import java.util.Scanner;
class WeekDay{
  public static void main(String args[]){
    int weekNum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Week Number");
    weekNum=sc.nextInt();
    if(weekNum==1){
      System.out.println("Sunday");
    }
     else if(weekNum==2){
      System.out.println("Monday");
     }
     else if(weekNum==3){
      System.out.println("Tuesday");
     }
     else if(weekNum==4){
      System.out.println("Wednesday");
     }
     else if(weekNum==5){
      System.out.println("Thursday");
     }
     else if(weekNum==6){
      System.out.println("Friday");
     }
     else{
      System.out.println("Saturday");
     }
      
  }
    
}