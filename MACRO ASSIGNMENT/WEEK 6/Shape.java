// Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.

class InvalidDimensionsException extends Exception{
  InvalidDimensionsException(String str){
    super(str);
  }
}
class Circle{
  double pi=3.14,area,perimeter;
  void validateCircleArea(int r) throws InvalidDimensionsException{
    if(r<=0){
      throw new InvalidDimensionsException("enter the radius greater than zero");
    }
    else{
      area=pi*r*r;
      System.out.println("the area of circle is "+area);
    }
  }
  void validateCirclePerimeter(int r)throws InvalidDimensionsException{
    if(r<=0){
      throw new InvalidDimensionsException("enter the radius greater than zero");
    }
    else{
      perimeter=pi*r*2;
      System.out.println("the area of perimeter is "+perimeter);
    }
  }
}
class Rectangle{
  double pi=3.14,area,perimeter;
  void validateRectagleArea(int l,int b) throws InvalidDimensionsException{
    if(l<=0 && b<=0){
      throw new InvalidDimensionsException("enter proper length and breadth");
    }
    else{
      area=l*b;
      System.out.println("area of rectangle is "+area);
    }
  }

  void validateRectanglePerimeter(int l,int b) throws InvalidDimensionsException{
    if(l<=0 && b<=0){
      throw new InvalidDimensionsException("enter corrrect length and breadth");
    }
    else{
      perimeter=2*(l+b);
      System.out.println("the perimeter of rectangle is "+perimeter);
    }
  }
}
class Triangle{
  double area,perimeter;
  void validateTriangleArea(int b,int h) throws InvalidDimensionsException{
    if(b<=0 && h<=0){
      throw new InvalidDimensionsException("enter proper base and height");
    }
    else{
      area=1/2*(b*h);
      System.out.println("area of triangle is "+area);
    }
  }

  void validateTrianglePerimeter(int s1,int s2,int s3) throws InvalidDimensionsException{
    if(s1<=0 && s2<=0 && s3<=0){
      throw new InvalidDimensionsException("enter corrrect sides of triangle ");
    }
    else{
      perimeter=s1+s3+s2;
      System.out.println("the perimeter of triangle  is "+perimeter);
    }
  }
}

class Shape{
  public static void main(String args[]){
    Circle circle=new Circle();
    Rectangle rect=new Rectangle();
    Triangle tri=new Triangle();
    try{
      rect.validateRectagleArea(0,0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      rect.validateRectanglePerimeter(0,0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    } 
    try{
      circle.validateCircleArea(0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      circle.validateCirclePerimeter(0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      tri.validateTriangleArea(0,0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      tri.validateTrianglePerimeter(0,0,0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
  }
}