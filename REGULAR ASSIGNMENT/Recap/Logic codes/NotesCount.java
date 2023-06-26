import java.util.Scanner;
class NotesCount{
  public static void main(String args[]){
    Scanner sc=new scanner(System.in);
    System.out.println("Enter the amount:");
    int amt=sc.nextInt();
    int n2000,n500,n200,n100,n50,n20,n10,n5;
    n2000=n500=n200=n100=n50=n20=n10=n5=0;
    if(amt>=2000){
      n2000=amt/2000;
      amt=amt-n2000*2000;
        System.out.println("number of 2000 notes="+n2000);
    }
    if(amt>=500){
      n500=amt/500;
      amt=amt-n500*500;
         System.out.println("number of 500 notes="+n500);
    }
    
    if(amt>=200){
      n200=amt/200;
      amt=amt-n200*200;
         System.out.println("number of 200 notes="+n200);
    }
    
    if(amt>=100){
      n100=amt/100;
      amt=amt-n100*100;
         System.out.println("number of 100 notes="+n100);
    }
    
    if(amt>=50){
      n50=amt/50;
      amt=amt-n50*50;
         System.out.println("number of 50 notes="+n50);
    }
    
    if(amt>=20){
      n20=amt/20;
      amt=amt-n20*20;
         System.out.println("number of 20 notes="+n20);
    }
    
    if(amt>=10){
      n2000=amt/10;
      amt=amt-n10*10;
         System.out.println("number of 10 notes="+n10);
    
    }
    if(amt>=5){
      n5=amt/5;
      amt=amt-n5*5;
         System.out.println("number of 5 notes="+n5);
    }
    System.out.println("total number of notes="+(n2000=n500=n200=n100=n50=n20=n10=n5));
  }
}