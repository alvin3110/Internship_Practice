import java.util.Scanner;

public class Password {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String mainpassword, userInput;
        mainpassword = "bob";
        System.out.println("Please enter the password to continue.");
        userInput = sc.next();
        System.out.println("Verifying Password");
        if (userInput.equals(mainpassword)){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
    }
}