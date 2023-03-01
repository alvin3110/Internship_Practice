import java.util.*;
  class Concat{
 
  static void concat(String str1,String subString ){
    String newstring=str1.concat(subString);
    System.out.println(newstring);
  }
 
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1,subString;
    System.out.println("enter string1"); 
    str1=sc.nextLine();
    System.out.println("enter string2"); 
    subString=sc.nextLine();
    concat(str1, subString);
  
  }
}