import java.util.Scanner;
class Getbytes{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();  
    byte[] barr=s1.getBytes();  
    for(int i=0;i<barr.length;i++){  
      System.out.println(barr[i]); 
    }
  }
}