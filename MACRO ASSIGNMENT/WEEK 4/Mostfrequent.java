import java.util.Scanner;
class Mostfrequent{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in) ;
    String s=sc.next();
    char a[]=s.toCharArray();
    boolean visited[] = new boolean[a.length];
    System.out.println("Value Frequency");
    int maxcount=1;
    char max=' ';
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
          if(maxcount<=p)
          {
            maxcount++;
            max=a[i];
          }
        }
      }
      
    }
    System.out.println(max + "       " + maxcount);
  }
}
    
  