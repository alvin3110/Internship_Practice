import java.util.Random; 
import java.util.Scanner;
class Guessinggame2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random = new Random(); 
    int randomnumber=random.nextInt(100);
    System.out.println(randomnumber);
    int Guess=0;
    int count=0;
    do{
      System.out.println("Guess Number:");
      Guess=sc.nextInt();
      if(randomnumber==Guess)
        System.out.println(" Correct Guess!!Congrats");  
      else{
        if(randomnumber>Guess)
          System.out.println("Guess number is less than random number");
        else
          System.out.println("Guess number is greater than random number");
      }
      count++;
      if(count>=3){
        System.out.println("Chances exceeded");
        break;
      }
    }while(randomnumber!=Guess);
  }
  
}