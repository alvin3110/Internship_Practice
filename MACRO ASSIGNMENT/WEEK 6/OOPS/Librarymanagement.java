class Book {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    
    public Book(String title, Author author, String ISBN, String publisher) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String getPublisher() {
        return publisher;
    }
}
class Author {
    private String name;
    private String email;
    private Book[] books;
    private int numBooks;
    
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.books = new Book[10];
        this.numBooks = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Error: Author has reached maximum number of books.");
        }
    }
    
    public void printBooks() {
        System.out.println("Books by " + name + ":");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i].getTitle());
        }
    }
}
public class Librarymanagement {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jkrowling@gmail.com");
        Author author2 = new Author("George R.R. Martin", "grrmartin@gmail.com");
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "978-0747532743", "Bloomsbury Publishing");
        Book book2 = new Book("A Game of Thrones", author2, "978-0553103540", "Bantam Spectra");
      author1.addBook(book1);
      author2.addBook(book2);
      System.out.println("Book 1 Title: " + book1.getTitle());
      System.out.println("Book 1 Author: " + book1.getAuthor().getName());
      System.out.println("Book 1 ISBN: " + book1.getISBN());
      System.out.println("Book 1 Publisher: " + book1.getPublisher());
      System.out.println("Book 2 Title: " + book2.getTitle());
      System.out.println("Book 2 Author: " + book2.getAuthor().getName());
      System.out.println("Book 2 ISBN: " + book2.getISBN());
      System.out.println("Book 2 Publisher: " + book2.getPublisher());

      System.out.println("Author 1 Name: " + author1.getName());
      System.out.println("Author 1 Email: " + author1.getEmail());
      System.out.println("Author 1 Books:");
      author1.printBooks();

      System.out.println("Author 2 Name: " + author2.getName());
      System.out.println("Author 2 Email: " + author2.getEmail());
      System.out.println("Author 2 Books:");
      author2.printBooks();
    }
}
