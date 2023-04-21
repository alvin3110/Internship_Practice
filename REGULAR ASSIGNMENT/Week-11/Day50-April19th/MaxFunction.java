class MaxFunction {
  static void max(int a, int b) {
    if(a > b) 
       System.out.println(a+" IS MAX");
    else
      System.out.println(b+" IS MAX");
  }
  
  static void max(double a, double b) {
    if(a > b) 
       System.out.println(a+" IS MAX");
    else
      System.out.println(b+" IS MAX");
  }
  
  static void max(int a, int b, int c) {
    if((a > b)&&(a > c)) 
       System.out.println(a+" IS MAX");
    else if((b > a)&&(b > c))
      System.out.println(b+" IS MAX");
    else 
      System.out.println(c+" IS MAX");
  }
  public static void main(String[] args) {
    MaxFunction mathFunctions = new MaxFunction();
    mathFunctions.max(5, 10);
    mathFunctions.max(5.5, 10.1);
    mathFunctions.max(5, 10, 15);
    
  }
}
