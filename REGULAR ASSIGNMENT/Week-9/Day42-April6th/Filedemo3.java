import java.io.FileWriter;
class FileDemo3{
  public static void main(String args[]){
    try{
      FileWriter fw=new FileWriter("messi.txt");
      fw.write("My name is lionel Andres messi");
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  
  }
}