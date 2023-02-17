import java.time.LocalDate;
import java.util.Scanner;
class Adddaystodate{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter date in YYYY-MM-DD format: ");
    String input = sc.next(); 
    LocalDate date=  LocalDate.parse(input);
    System.out.println("Enter number of days to be added: ");
    int n=sc.nextInt();
    LocalDate newdate=date.plusDays(n);
    System.out.println(newdate);
  }
}
    
  