import java.util.Scanner;
class Library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Book id");
    int bid=sc.nextInt(); 
    System.out.println("Enter Book Name");
    String Bname=sc.next();
    System.out.println("Enter Author Name");
    String Aname=sc.next();
    System.out.println(" Enter Borrower id");
    int id=sc.nextInt();
    System.out.println(" Enter phone number");
    long ph=sc.nextLong();
    System.out.println("Book ID"+bid);
    System.out.println("Book Name"+Bname);
    System.out.println("Author Name"+Aname);
    System.out.println("Borrower ID:"+id);
    System.out.println("Phone Number: "+ph);
  }
}