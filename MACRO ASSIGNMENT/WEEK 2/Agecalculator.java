import java.time.LocalDate;  
//import java.time.format.DateTimeFormatter;
import java.time.Period;  
import java.util.Scanner;  
public class Agecal{  
public static void main(String args[])   
  {  
    System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
    Scanner sc = new Scanner(System.in);  
    String input = sc.next();   
    LocalDate today = LocalDate.now(); 
    //DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dob=  LocalDate.parse(input);
    Period period = Period.between(dob, today);  
    System.out.println("You are "+period.getYears()+"years old");
    if(period.getYears()>=18)
      System.out.println("You are Adult");
    else
       System.out.println("You are Minor");
  }
}
