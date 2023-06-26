import java.util.*;

public class ProductOfDig{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    int product=1,digit=0;
    while(n>0){
       digit=n%10;
      product=product*digit;
      n=n/10;

    }
     System.out.println("the product of digits is " +product);
  }

}