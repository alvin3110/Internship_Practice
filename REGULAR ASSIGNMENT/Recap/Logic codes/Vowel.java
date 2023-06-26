import java.util.Scanner;
public class Vowel{
  public static void main(String[] args){
    System.out.println("Enter the String");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int vowel=0;
    int consonant=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        vowel++;
      }else{
        consonant++;
      }
    }
    System.out.println("In given String the vowel count is "+vowel);
        System.out.println("In given String the consonant count is "+consonant);

  }
}