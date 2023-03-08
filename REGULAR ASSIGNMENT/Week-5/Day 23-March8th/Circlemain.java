import java.util.Scanner;
class Circle
{
  double r;
  double d;
  double circumference;
  double area;
  Circle(double r){
    this.r=r;
    this.d=2*r;
  }
  double getr()
  {
    return r;
  }
  double getd()
  {
    return d;
  }
  double getcircumference()
  {
    return 3.14*d;
  }
  double getarea()
  {
    return 3.14*r*r;
  }
}
class Circlemain{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    Circle c=new Circle(sc.nextDouble());
    System.out.println("Radius:"+c.getr());
    System.out.println("Diameter:"+c.getd());
    System.out.println("Circumference"+c.getcircumference());
    System.out.println("Area:"+c.getarea());
  }
}