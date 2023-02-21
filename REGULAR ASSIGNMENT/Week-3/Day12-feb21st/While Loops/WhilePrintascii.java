import java.util.*;
class WhilePrintascii{
  public static void main(String args[])
  {
    char c='A'; 
    System.out.println("Alphabets:");
    while(c<='Z')
    {
      System.out.println(c+"="+(int)c);
      c++;
    }
  }
}