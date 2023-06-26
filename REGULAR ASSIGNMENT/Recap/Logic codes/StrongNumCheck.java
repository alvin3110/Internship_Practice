//if the sum of factorials of the input number's every digit is equal to the same input number.
import java.util.Scanner;
class StrongNumCheck{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
     int n=sc.nextInt();  
    int fact=1;   
    int temp=n;  
    int r=0,sum=0; 
    while(n>0)    {  
      r=n%10; 
      fact=1; 
      for(int i=1;i<=r;i++){  
        fact=fact*i;  
      } 
      sum=sum+fact;  
      n=n/10;   
    }  
    if(sum==temp) 
      System.out.println(temp+" is a Strong number");  
    else  
      System.out.println(temp+" is not a Strong number");  
  }
}