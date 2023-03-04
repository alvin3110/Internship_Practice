import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class UsernamePasswordValidator {
  static void usernamePasswordVerifier(String username, String password) 
  {
    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    if (username.matches(regex))  
    {
      System.out.println("Valid Username");
    } 
    else 
    {
      System.out.println("Valid Username");
    }
    if(password.matches(regex))
    {
      System.out.println("Valid Password");
    } 
    else 
    {
      System.out.println("Invalid Password");
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your username: ");
    String username = sc.next();
    System.out.println("Enter your password: ");
    String password = sc.next();
    usernamePasswordVerifier(username, password);
  }
}