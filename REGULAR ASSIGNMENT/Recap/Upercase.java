import java.util.Scanner;

 class Upercase{
   String upperCase(String input){
     //Char str[]=input.toCharArray();
     String op="";
     for(int i=0;i<input.length();i++){
       if(input.charAt(i)>='a' && input.charAt(i)<='z')
       {
         op+=(char)(int)(input.charAt(i)-32);
       }
       else if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
         op+=(char)(int)(input.charAt(i)+32);         
       }
     }
     return op;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = scanner.nextLine();
      Upercase a=new Upercase();
      String ans=a.upperCase(inputString);
      System.out.println(ans);
  
        //String uppercaseString = inputString.toUpperCase();
        //System.out.println("Uppercase string: " + uppercaseString);
    }
}