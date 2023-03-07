import java.util.StringTokenizer;
public class Maxlength {
	public static void main(String args[])
	{
    StringTokenizer s= new StringTokenizer("Welcome to GeeksforGeeks");
    int maxcount=0;
    String max=" ";
    while(s.hasMoreTokens()){
      String a=s.nextToken();
      System.out.println(a.length());
      if(maxcount<a.length()){
        maxcount=a.length();
        max=a;
      }
    }
  }
}
