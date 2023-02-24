import java.util.Random; 
import java.util.Scanner;
class Guessinggame{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random = new Random(); 
    int randomnumber=random.nextInt(100);
    System.out.println(randomnumber);
    int Guess=0;
    do{
      System.out.println("Guess Number:");
      Guess=sc.nextInt();
      if(randomnumber==Guess)
        System.out.println(" Correct Guess!!Congrats");
      else
        System.out.println(" Incorrect Guess!!Try Again");
    }while(randomnumber!=Guess);
  }
}
