import java.time.LocalDate; 
import java.time.DayOfWeek;
import java.util.Scanner; 
class Dayfinder{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter date in YYYY-MM-DD format: "); 
    String i= sc.next(); 
    LocalDate date=  LocalDate.parse(i);
    DayOfWeek day = date.getDayOfWeek();
    System.out.println(day);
  }
}