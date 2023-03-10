class Shape {
  String color,filled;
}
class Rectangle extends Shape {
  double width;
  double height;
  double get_area() {
    return width*height;
  }
  void display() {
     System.out.println(color + " " +get_area());
  }
}
public class Studentinheritance {
  public static void main(String args[]) {
    Rectangle s1= new Rectangle();
    s1.color="red";
    s1.filled="yes";
    s1.height=10;
    s1.width=7;
    s1.display();    
  }
}