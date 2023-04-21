interface Calculator{
  int add(int a,int b);
  int sub(int a, int b);
  int multiply(int a,int b);
  int divide(int a,int b);
}
class BasicCalculator implements Calculator{
  public int add(int a, int b){
    return a+b;
  }
  public int sub(int a,int b){
    return a-b;
  }
  public int multiply(int a, int b){
    return a*b;
  }
  public int divide(int a,int b){
    return a/b;
  }
}

 

public class CalculatorInterface
{
  public static void main(String args[]){
    BasicCalculator bc = new BasicCalculator();
    int a =10 ,b=6;
    System.out.println("Addition of two numbers:"+cc.add(a,b));
     System.out.println("Substraction of two numbers:"+cc.sub(a,b));
     System.out.println("Multiplication of two numbers:"+cc.multiply(a,b));
     System.out.println("Division of two numbers:"+cc.divide(a,b));
    
  }
}