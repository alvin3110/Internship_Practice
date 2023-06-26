//A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number. In other
import java.util.*;
class PerfectNumCheck{ 
  public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);  
    System.out.println("Enter n value"); 
    int n=sc.nextInt();    
    int sum=0;   
    for(int i=1;i<=n/2;i++){      
      if(n%i==0){     
        sum=sum+i; 
      }     
    }   
    if(sum==n){    
      System.out.println("its perfect number");   
    }     
    else{  
      System.out.println("its not a perfect number");    
    }  
  } 
}