import java.util.Scanner;
class StringCharOccurence
{
  static void countstring(String str){
    str=str.toUpperCase();
    str=str.replaceAll(" ","");
    char a[]=str.toCharArray();
    boolean visited[] = new boolean[a.length];
    System.out.println("Value Frequency");
    for(int i=0;i<a.length;i++)
    {
      if (visited[i] == true)
        continue;
      int p=1;
      for(int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) 
        {
          visited[j] = true;
          p++;
        }
      }
      System.out.println(a[i] + "       " + p);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String str=sc.nextLine();
    countstring(str);
  }
}