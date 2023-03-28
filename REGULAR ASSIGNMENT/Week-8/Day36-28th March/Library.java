import java.util.ArrayList;
import java.util.Scanner;
class Book {
  private String title;
  private String author;
  private String publisher;
  private int publicationYear;
  private double price;
  Book(String title, String author, String publisher, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }
}
class Library{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
     for (int i = 0; i < 5; i++) {
            System.out.println("Enter the details of book " + (i+1) + ":");
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Author: ");
            String author = sc.next();
            System.out.print("Publisher: ");
            String publisher = sc.next();
            System.out.print("Publication Year: ");
            int publicationYear = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            books.add(new Book(title, author, publisher, publicationYear, price));
        }
    for(Book book : books) {
      System.out.println("Title: " + book.getTitle());
      System.out.println("Author: " + book.getAuthor());
      System.out.println("Publisher: " + book.getPublisher());
      System.out.println("Publication Year: " + book.getPublicationYear());
      System.out.println("Price: $" + book.getPrice());
      System.out.println();
    }
  }
}

