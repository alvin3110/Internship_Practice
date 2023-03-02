import java.util.*;
import java.util.Scanner;
class StringFormat{
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float n1=sc.nextFloat(),n2=sc.nextFloat();
    float result=n1*n2;
    String result1=String.format("%-12.2f%-12.2f%-12.2f",result,result,result);
    System.out.println(result1);
    String result2=String.format("%-12.2f%-12.2f%-12.2f",result,result,result);
    System.out.println(result2);
  }
}