import java.util.Scanner;
class Atm{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
    int balance=1000;
    int mpin=1234;
    System.out.println("Enter the PIN number");
		int in = sc.nextInt();	
    if (in==mpin)
    {
      System.out.println("Welcome to ATM");
      System.out.println("1.Balance\n 2.Withdraw\n 3.Deposit\n 4.Change Pin\n 5.Quit\n");
      System.out.println("Enter your Choice");
      int choice=sc.nextInt();
      switch(choice)
      {
        case 1:
          System.out.println("Your current Balance is :"+balance);
          break;
        case 2:
          System.out.println("Enter amount to be withdrawed");
          int withdraw=sc.nextInt();
          if(withdraw<=balance)
          {
            System.out.println("Withdraw successful");
            System.out.println("Current Balance:"+(balance-withdraw));
          }
          else
            System.out.println("insufficient balance!");    
          break;
      case 3:
          System.out.println("Enter amount to deposit");
          int deposit=sc.nextInt();
          System.out.println("deposit successful");
          System.out.println("Current balance:"+ (balance+deposit));
          break;
      case 4:
          System.out.println("Enter new pin");
          int npin=sc.nextInt();
          if(npin!=mpin){
            mpin=npin;      
            System.out.println("Pin changed Succesfully");
          }
          else
            System.out.println("Enter another pin ");
          break;
      case 5:
          System.out.println("Thank you,Please visit again");
          break;
      default:System.out.println("Invalid Choice!!!Enter 1 to 5...");
      }
    }
    else
    {
      System.out.println("Incorrect Pin");
    }
  }
}

      
    
	