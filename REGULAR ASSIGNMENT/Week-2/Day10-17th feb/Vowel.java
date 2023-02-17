import java.util.Scanner;
class Vowel{
  public static void main(String args[]){
   char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter character");
    ch=sc.next().charAt(0);
    switch(ch){
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("vowel");
        break;
      default:
        System.out.println("consonant");
    }
  }
}