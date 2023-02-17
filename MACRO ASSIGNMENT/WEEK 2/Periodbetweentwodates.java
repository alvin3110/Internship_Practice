import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Period;  
import java.util.Scanner;  
class Periodcalculator{  
  public static void main(String args[])   
  {  
    System.out.println("Enter dates in dd-MM-yyyyformat: ");  
    Scanner sc = new Scanner(System.in);  
    String a = sc.next();   
    String b = sc.next(); 
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate d1=  LocalDate.parse(a,dateFormat);
    LocalDate d2=  LocalDate.parse(b,dateFormat);
    Period period = Period.between(d1,d2);  
    System.out.println("\n Years="+period.getYears()+"\n Months="+period.getMonths()+"\n Days="+period.getDays());
  }
}