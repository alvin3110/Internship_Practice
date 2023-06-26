//number that is equal to the reverse of that same number
import java.util.*;
class PalindromeCheck{
  public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
  int remainder,sum=0,temp;    
  int num;
    System.out.println("Enter the number");
    num = sc.nextInt();
    temp=num;  
    while(num>0){    
      remainder=num%10; 
      sum=(sum*10)+remainder;    
      num=num/10;    
    }    
    if(temp==sum)    
      System.out.println("palindrome number ");    
    else    
      System.out.println("not a palindrome number");    
  }  
} 
