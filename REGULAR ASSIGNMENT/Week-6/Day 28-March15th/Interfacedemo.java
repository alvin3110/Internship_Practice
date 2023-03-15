interface Shape{
  void draw();
}
class Rectangle implements Shape{
  public void draw(){
    System.out.println("Rectangle");
  }
}
class Circle implements Shape{
  public void draw(){
    System.out.println("Circle");
  }
}
class Interfacedemo{
  public static void main(String args[]){
    Shape s=new Rectangle();
    s.draw();
  }
}