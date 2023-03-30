import java.util.ArrayList;
import java.util.Scanner;
class Rectangle {
  private double length;
  private double width;
  
  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  double getLength() {
    return length;
  }
  double getWidth() {
    return width;
  }
  double getArea() {
        return length * width;
    }
}

class Rectanglemain{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Rectangle> rectangles = new ArrayList<>();
    System.out.println("Enter no of Rectangle You want to add to list");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Enter Length");
      int l=sc.nextInt();
      System.out.println("Enter Breadth");
      int b=sc.nextInt();
      rectangles.add(new Rectangle(l,b));
    }
    for (Rectangle r : rectangles) {
        System.out.println("Length: " + r.getLength() + ", Width: " + r.getWidth() + ", Area: " + r.getArea());
    }
  }
}
    
      
