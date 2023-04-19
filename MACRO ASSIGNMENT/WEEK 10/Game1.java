import java.util.*;
class Game1{
  public static void main(String args[]){    
    System.out.println("Enter the age : ");
    int age=sc.nextInt();
    
    if(age>=8 && age<=10){
      System.out.println("Enter angle 1 :");
      int angle1 = sc.nextInt();
      System.out.println("Enter angle 2 :");
      int angle2 = sc.nextInt();
      System.out.println("Enter angle 3 :");
      int angle3 = sc.nextInt();
      int sum = angle1 + angle2 + angle3;
      if (sum == 180) {
        if (angle1 == angle2 && angle2 == angle3) {
          System.out.println("Prize 3");
        } 
        else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
          System.out.println("Prize 2");
        } 
        else {
          System.out.println("Prize 1");
        }
      } 
      else {    
        System.out.println("No Prize");
      }
    }
    else{
      System.out.println("You are not eligible ");
    }
  }
}
