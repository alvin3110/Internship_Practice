import java.util.Scanner;
class Percentage{
  public static void main(String args[]){
    double pmark,cmark,bmark,mmark,compumark,percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of five subjects");
     pmark=sc.nextDouble();
     cmark=sc.nextDouble();
     bmark=sc.nextDouble();
     mmark=sc.nextDouble();
     compumark=sc.nextDouble();
    percentage=((pmark+cmark+bmark+mmark+compumark)/500*100);
    System.out.println(percentage);
    if(percentage>=90){
      System.out.println("Grade A");
    }
    else if((percentage>=80)&&(percentage<90)){
      System.out.println("Grade B");
    }
    else if((percentage>=70)&&(percentage<80)){
      System.out.println("Grade C");
    }
    else if((percentage>=60)&&(percentage<70)){
      System.out.println("Grade D");
    }
    else if((percentage>=40)&&(percentage<60)){
      System.out.println("Grade E");
    }
    else{
        System.out.println("Grade F");
    } 
  }
}