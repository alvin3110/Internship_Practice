public class Customer{
  private  int cid;
  private  String cname;
  private  int no_of_orders;
//setters
  void setCid (int cid ){
    this.cid=cid;
  }
  void setCname (String cname ){
    this.cname=cname;
  }
  void setNo_of_orders (int no_of_orders ){
    this.no_of_orders=no_of_orders;
  }
   //getters
  int getCid(){
    return this.cid;
  }
  String getCname(){
    return this.cname;
  }
  int getNo_of_orders(){
    return this.no_of_orders;
  }
}


