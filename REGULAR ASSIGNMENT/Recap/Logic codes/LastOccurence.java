//last Occurence?//
import java.util.Scanner;
 class LastOccurrence{
   private static Scanner sc;
	public static void main(String[] args) {
		String lastCharStr;
		char ch;
		
		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to find Last Occurrence =  ");
		lastCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Last Character to Find =  ");
		ch = sc.next().charAt(0);
		
		int x = lastCharStr.lastIndexOf(ch);
		
		System.out.format("\nThe Last Character Occurrence of %c at %d position", 
				lastCharStr.charAt(x), x);
	}
}