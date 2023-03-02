import java.util.*;

public class TextAnalyzer{

    // Count the number of characters in the text
    public static int countCharacters(String text) {
      text=text.replaceAll(" ","");
      return text.length();
    }

    // Count the number of words in the text
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    // Count the number of lines in the text
    public static int countLines(String text) {
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    }

    // Find the most common words in the text with a minimum occurrence count
    public static void findMostCommonWords(String text) {
      String[] words = text.split(" ");
      boolean visited[]=new boolean[words.length]; 
      for(int i=0;i<=words.length;i++){
        if (visited[i] == true)
        continue;
      int p=1;
      for(int j = i + 1; j < words.length; j++) {
        if (words[i] == words[j]) 
        {
          visited[j] = true;
          p++;
        }
      }
      System.out.println(words[i] + "       " + p);
    }
  }
  
  
        
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Number of characters: " + countCharacters(text));
        System.out.println("Number of words: " + countWords(text));
        System.out.println("Number of lines: " + countLines(text));
        System.out.print("occurrence count for words: ");
        findMostCommonWords(text);
        
    }
}
