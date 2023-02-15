import java.util.Scanner;
class Unitcharges
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Electricity Unit : ");
		double unit = sc.nextDouble();
		double amt,surcharge,billamt;
		if(unit<=50)
			amt=50*0.50;
    else if(unit<=150)
      amt=25+((unit-50)*0.75);
    else if(unit<=250)
      amt=100+((unit-150)*1.20);
    else 
      amt=220+((unit-150)*1.50);
		surcharge = amt*0.2;
		billamt= amt+surcharge;
		System.out.println("Total Electricity Bill : "+billamt);
	}
}