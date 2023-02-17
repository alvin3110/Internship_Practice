import java.util.Scanner;
class Weekdays{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = sc.nextInt();			
		switch(num){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:System.out.println("Invalid Choice!!!Enter 1 to 7...");
    }
  }

	@Override
	public String toString() {
		return "Weekdays []";
	}
}