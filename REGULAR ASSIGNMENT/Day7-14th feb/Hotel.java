import java.util.Scanner;
class Hotel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter RoomRate");
    int roomrate=sc.nextInt();
    System.out.println("Enter Number of nights staying:");
    int nights=sc.nextInt();
    System.out.println("Total Cost:" +roomrate*nights);
  }
}