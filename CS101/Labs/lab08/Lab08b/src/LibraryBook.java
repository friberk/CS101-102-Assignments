/**
 * "LibraryBook" class for Lab07b.
 */
public class LibraryBook {
    // Properties
    String title;
    String author;
    String dueDate;

    int timesLoaned;

    boolean onLoan;
    boolean equals;

    // Constructors
    public LibraryBook(String theTitle, String theAuthor, String theDueDate, int theTimesLoaned, boolean theOnLoan) {
        title = theTitle;
        author = theAuthor;
        dueDate = theDueDate;

        timesLoaned = theTimesLoaned;

        onLoan = theOnLoan;
    }

    public LibraryBook(String theTitle, String theAuthor) {
        title = theTitle;
        author = theAuthor;
    }

    public LibraryBook(LibraryBook book) {
        title = book.title;
        author = book.author;
        dueDate = book.dueDate;

        timesLoaned = book.timesLoaned;

        onLoan = book.onLoan;
    }

    // Methods

    public String toString() {
        return "\nBook Title: " + title + "\nBook Author: " + author + "\nBook Due Date: " + dueDate
                + "\nTimes Loaned: " + timesLoaned + "\nLoan Status: " + onLoan;
    }

    public int getTimesLoaned() {
        return timesLoaned;
    }

    public String getDueDate() {
        return dueDate;
    }

    /**
     * This is a brief description of the method.
     * 
     * @param loan        user choice to loan or return.
     * @param loanDueDate user decided due date if loan is selected.
     * @return The book's on loan status.
     */
    public boolean onLoan(String loan, String loanDueDate) {
        if (loan.equalsIgnoreCase("loan")) {
            onLoan = true;
            dueDate = loanDueDate;
            timesLoaned = getTimesLoaned() + 1;
        }

        else if (loan.equalsIgnoreCase("return")) {
            onLoan = false;
            dueDate = "";
        }

        return onLoan;
    }

    public boolean equals(LibraryBook book) {
        if (this.title.equals(book.title) && this.author.equals(book.author)) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean hasSameTitle(LibraryBook book) {
        if (this.title.equals(book.title)) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean hasSameAuthor(LibraryBook book) {
        if (this.title.equals(book.author)) {
            return true;
        }

        else {
            return false;
        }
    }
}
