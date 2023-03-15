public class Emp {
  public static void main(String args[]) {
    Customer c = new Customer();
    c.setCid(1);
    c.setCname("adgc");
    c.setNo_of_orders(12);
    System.out.println(c.getCid() + " " + c.getCname() + " " + c.getNo_of_orders());
  }
}