import java.util.*;
class ProductOfDigitOfNum{
	public static void main(String arg[]){
    long n,Product=1,digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number "); 
    n=sc.nextLong();
    while(n>0){
      digit = n%10;
      Product = Product* digit;
      n=n/10;
    }
    System.out.println("Product of digits of a number is "+Product);          
  }
}
	   