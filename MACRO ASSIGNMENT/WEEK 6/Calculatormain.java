// Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.

class InvalidExpressionException extends Exception{
  InvalidExpressionException(String str){
    super(str);
  }
}
class Calculator{
  char op;int result,a=10,b=5;
  void add(char op) throws InvalidExpressionException{
    if(op=='+'){
      result=a+b;
      System.out.println("after adding the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  //substraction
  void sub(char op) throws InvalidExpressionException{
    if(op=='-'){
      result=a-b;
      System.out.println("after substracting the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  //multiplication
  void mul(char op) throws InvalidExpressionException{
    if(op=='*'){
      result=a*b;
      System.out.println("after multiplying the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  //division
  void div(char op) throws InvalidExpressionException{
    if(op=='/'){
      result=a/b;
      System.out.println("after dividing the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
}
class Calculatormain{
  public static void main(String args[]){
    Calculator operator=new Calculator();
    //addition
    try{
      operator.add('+');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    //substraction
    try{
      operator.sub('-');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    //multiplication
    try{
      operator.mul('*');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    //division
    try{
      operator.div('/');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
  }
}