import java.util.*;
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

// Library Class (HAS-A list of books) → Aggregation
class Library {
    private List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    void showLibraryBooks() {
        System.out.println("Library contains:");
        for (Book b : books) {
            b.showBook();
        }
    }
}

// Main Class
public class Agreegation {
    public static void main(String[] args) {
        // Create Books independently
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Add books to a list
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        // Create Library with list of books (Aggregation)
        Library library = new Library(bookList);
        library.showLibraryBooks();

        // Books still exist independently (even without Library)
        System.out.println("\nBooks can exist independently:");
        b1.showBook();
    }
}
