class Bank{
  int bid=123;
  void rateOfInterest(){
    System.out.println("rate of interest is 10rs");
  }
}
class SBI extends Bank{
  void rateOfInterest(){
    System.out.println("12rs");
  }
}
class HDFC extends Bank{
  int bid=345;
  void print(){
    System.out.println(super.bid);
    System.out.println(bid);
  }
  void rateOfInterest(){
    super.rateOfInterest();
    System.out.println("14rs");
  }
}
class Overridingdemo{
  public static void main(String args[]){
    HDFC hdfc=new HDFC();
    hdfc.rateOfInterest();
    hdfc.print();
  }
}
