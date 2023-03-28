import java.util.PriorityQueue;
public class ExtractElement{
  public static void main(String args[]){

    PriorityQueue<String> queue=new PriorityQueue<String>();
    queue.add("red");
    queue.add("yellow");
    queue.add("green");
    queue.add("violet");
    queue.add("pink");
    
    System.out.println(queue);
  }
}