class Overiding{
  void hello(){
    System.out.println("basux");
  }
}
class Subclass extends Overiding{
  void hello(){
    System.out.println("Hi");
  }
}
class ExampleOverriding{
  public static void main(String args[]){
    Overiding ob1=new Overiding();
    ob1.hello();
    Subclass ob2=new Subclass();
    ob2.hello();
    
  }
}