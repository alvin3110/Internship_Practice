import java.io.FileWriter;
class Filedemo1 {
  public static void main(String args[]) {
    try{
      FileWriter fw=new FileWriter("a.txt");
      fw.write("Good Afternoon , Alvin");
      fw.close();
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}