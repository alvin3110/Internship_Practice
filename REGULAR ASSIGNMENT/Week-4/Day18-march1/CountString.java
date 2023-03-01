import java.util.Scanner;

class CountString{
  static void countstring(String str){
    int a=0,b=0,c=0;
    str=str.toLowerCase();
    char arr[]=str.toCharArray();
    for(int i=0;i<str.length();i++){
      if(arr[i] >= 'a' && arr[i] <='z'){
        a++;
      }
      else if(arr[i] >= '0' && arr[i] <='9'){
        b++;
      }
      else
        c++;
      }
    System.out.println("Alphabet count="+a);
    System.out.println("Digit count="+b);
    System.out.println("Special Char count="+c);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    countstring(str);
  }
}