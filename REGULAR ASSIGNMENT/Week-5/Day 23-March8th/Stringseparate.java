import java.util.Scanner;
class Stringseparate
{
  static void separate(String s)
  {
    char c[]=s.toCharArray();
    char num[]=new char[c.length];
    char alpha[]=new char[c.length];
    for(int i=0;i<c.length;i++)
    {
     if (c[i]>='0' && c[i]<='9')
     {
       //int j=0;
       num[i]=c[i];
       //j++;
     }
     else
     {
       //int k=0;
       alpha[i]=c[i];
       //k++;
     }
    }
    System.out.print("Digit:");
    for(int i=0;i<num.length;i++)
      System.out.print(num[i]);
    System.out.print("\nAlphabets:");
    for(int i=0;i<alpha.length;i++)
      System.out.print(alpha[i]);
    
  }
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      separate(s);
    }
}