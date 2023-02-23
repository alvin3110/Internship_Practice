import java.util.Scanner;
class ArrayVowel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int n=sc.nextInt();
    char arr[]=new char[n];
    System.out.println("Enter Array values");
    for(int i=0;i<n;i++){
      arr[i]=sc.next().charAt(0);
    }
    System.out.println("Vowels are:");
    for(int i=0;i<n;i++)
      switch(arr[i]){
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
          System.out.println(arr[i]);
      }
  }
}
