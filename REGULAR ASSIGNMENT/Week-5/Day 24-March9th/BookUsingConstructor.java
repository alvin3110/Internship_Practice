public class Book {

  String title;
  String author;
  int publicationYear;

  public Book(String title, String author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
  }
}
  public class BookUsingConstructor {
    public static void main(String[] args) {
      Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
      Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
      Book book3 = new Book("The Grapes of Wrath", "John Steinbeck", 1939);

      System.out.println(book1.title + " was written by " + book1.author + " in " + book1.publicationYear + ".");
      System.out.println(book2.title + " was written by " + book2.author + " in " + book2.publicationYear + ".");
      System.out.println(book3.title + " was written by " + book3.author + " in " + book3.publicationYear + ".");
    }
  }