import java.util.ArrayList;

/**
 * Library class for Lab08b
 */
public class Library {
    // properties
    ArrayList<LibraryBook> book;
    LibraryBook newBook;

    // constructors
    public Library() {
        book = new ArrayList<LibraryBook>();
    }

    // Methods

    public void addBook(String title, String author) {
        newBook = new LibraryBook(title, author);
        book.add(newBook);
    }

    public LibraryBook findByTitle(String bookName) {
        for (int i = 0; i < book.size(); i = i + 1) {
            if (bookName.equals(book.get(i).title)) {
                return book.get(i);
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (book.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String stringReport;
        int i;

        i = 1;
        stringReport = "";

        for (LibraryBook book : this.book) {
            if (book != null) {
                stringReport = stringReport + i + "." + " Title: " + book.title + " Author: " + book.author + "\n";
                i = i + 1;
            }
        }

        return stringReport;
    }

    public void remove(LibraryBook aBook) {
        for (int i = 0; i < book.size(); i = i + 1) {
            if (book.get(i) == aBook) {
                book.remove(i);
            }
        }
    }
}
