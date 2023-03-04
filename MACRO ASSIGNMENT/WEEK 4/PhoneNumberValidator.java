import java.util.Scanner;
class PhoneNumberValidator{
  static void validate(int ph[]){
    if((ph[0]==9 ||ph[0]== 8 ||ph[0]== 7 ||ph[0]== 6) &&  (ph.length==10)) 
      System.out.println("valid");
    else
      System.out.println("invalid");
  }
      
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int ph[]=new int[10];
    for(int i=0;i<10;i++)
      ph[i]=sc.nextInt();
    validate(ph);
  }
}