import java.util.Scanner;
	class FirstOccurrence{
	public static void main(String args[]){
	String firstCharStr;
	char ch;
	 Scanner sc=new Scanner(System.in);
	System.out.print("enter the string to find first occurance");
	firstCharStr=sc.nextLine();
	System.out.print("enter the character to find");
	ch=sc.next().charAt(0);
	int x=firstCharStr.indexOf(ch);
	System.out.format("the first occurance of %c at %d position",firstCharStr.charAt(x),x);
  }
}