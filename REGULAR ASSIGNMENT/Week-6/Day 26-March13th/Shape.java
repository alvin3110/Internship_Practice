class ShapeMain {
    public double getArea() {
        return 0.0; // default implementation for area calculation
    }
}

class Circle extends ShapeMain {
  double getArea(double radius) {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends ShapeMain {
  double getArea(double length,double width) {
    return length * width;
  }
}

public class Shape {
    public static void main(String[] args) {
      Circle c=new Circle();
      double carea=c.getArea(6.0);
      System.out.println(carea);
      Rectangle r=new Rectangle();
      double rarea=c.getArea(6.0,8.0);
      System.out.println(rarea);
    }
}
      
      
       
