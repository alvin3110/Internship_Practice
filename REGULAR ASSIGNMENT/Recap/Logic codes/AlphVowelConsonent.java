import java.util.Scanner;
class AlphVowelConsonent{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("Enter the character");
    ch=sc.next().charAt(0);
    if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
      System.out.println("Alphabet");
    }
    else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
      System.out.println("the character is ovel");
    }
    else{
      System.out.println("the character is consonent");
    }
  }
}