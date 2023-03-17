interface Product{
  int quantityOne=40;
  int quantityTwo=50;
  int quantityThree=80;
  void getName();
  void getPrice();
  void getQuantity();
  void removeProduct();
  void addProduct();
  void getTotalCost();
}
class PointOfSale implements Product{
  public void getName(){
    
  }
  public void getPrice(){
    int p1Price=2000;
    int p2Price=4000;
    int p3Price=3000;
    int total_price=p1Price+p2Price+p3Price;
    System.out.println("the tota price is "+total_price);
  }
  public void getQuantity(){
    int quantity1=40;
    int quantity2=50;
    int quantity3=80;
    int total_qantity=quantity1+quantity2+quantity3;
    System.out.println("the total quantity is "+total_qantity);
  }
  public void removeProduct(){
    int removeP1=quantityOne-10;
    int removeP2=quantityTwo-20;
    int removeP3=quantityThree-15;
    int remaining_product=removeP1+removeP2+removeP3;
    System.out.println("rmaining products are"+remaining_product);
  }
  public void addProduct(){
    int addP1=quantityOne+15;
    int addP2=quantityTwo+12;
    int addP3=quantityThree+13;
    int additional_product=addP1+addP2+addP3;
    System.out.println("after adding products "+additional_product);
  }
  public void getTotalCost(){
    int priceP1=quantityOne*2000;
    int priceP2=quantityTwo*4000;
    int priceP3=quantityThree*3000;
    int total_cost=priceP1+priceP2+priceP3;
    System.out.println("total price is "+total_cost);
  }
  
}
class Assignment1{
  public static void main(String args[]){
    Product p=new PointOfSale();
    p.getQuantity();
    p.getPrice();
    p.getTotalCost();
    p.removeProduct();
    p.addProduct();
    
  }
}