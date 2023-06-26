import java.util.Scanner;
class NumberReverse{
  public static void main(String args[]){
    int a[]={12,23,30,42,52};
    int rev[]=new int[5];
    for(int i=0;i<a.length;i++){
      int reverse=0;
      while(a[i]!=0){
        reverse=reverse*10+a[i]%10;
        a[i]=a[i]/10;
      }
      a[i]=reverse;
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}