abstract class Shape1{
  abstract void area();
  abstract void per();
}

 

class Rectangle extends Shape1{
  void area(){
    int l=5;
    int b = 3;
    int area = l*b;
    int peri = 2*(l+b);
    System.out.println("Area of rectangle: "+area);
    System.out.println("Perimeter of rectangle: "+peri);
  }
  
  void per(){
    int l=5;
    int b = 3;
    int area = l*b;
    int peri = 2*(l+b);
    System.out.println("Perimeter of rectangle: "+peri);
  }
}

 

class Square extends Shape1{
  void area(){
    int l =6;
    int area =l*l;
    System.out.println("Area of square: "+area);
  }
  
  void per(){
    int l =6;
    int peri = 4*l;
    System.out.println("Perimeter of square: "+peri);
  }
}

 

class Shape{
  public static void main(String args[]){
    Shape1 sh;
    sh = new Rectangle();
    sh.area();
    sh.per();
    sh = new Square();
    sh.area();
    sh.per();
  }
}