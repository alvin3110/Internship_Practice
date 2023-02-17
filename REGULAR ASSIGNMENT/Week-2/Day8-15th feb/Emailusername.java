import java.util.Scanner;
class Emailusername {
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        String Username,Email,userinput;
        Username =("user2");
        Email=("user@gmail.com");
        System.out.println("Please enter username/email");
        userinput = sc.next();
        System.out.println("Verifying");
        if (userinput.equals(Username) || userinput.equals(Email))
            System.out.println("Access Granted");
        else
            System.out.println("Access Denied");
    }
}