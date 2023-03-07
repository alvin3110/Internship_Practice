import java.util.Scanner;
class Rectangle
{
  double l,b;
  void perimeter()
  {
    double peri=2*(l+b);
    System.out.println("Perimeter:"+peri);
  }
  void area()
  {
    double ar=l*b;
    System.out.println("Area:"+ar);
  }
}
class Rectanglemain{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    Rectangle r=new Rectangle();
    r.l=sc.nextDouble();
    r.b=sc.nextDouble();
    r.perimeter();
    r.area();
  }
}
  