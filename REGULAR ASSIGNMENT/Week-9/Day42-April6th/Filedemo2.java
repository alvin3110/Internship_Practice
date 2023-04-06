import java.io.FileOutputStream;
import java.io.FileWriter;
class Filedemo2 {
  public static void main(String args[]) {
    try{
      FileOutputStream fw=new FileOutputStream("a1.txt");
      String str="Alvin";
      fw.write(bytes);
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}