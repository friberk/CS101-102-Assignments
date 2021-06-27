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

    // Constructors
    public LibraryBook(String theTitle, String theAuthor, String theDueDate, int theTimesLoaned, boolean theOnLoan) {
        title = theTitle;
        author = theAuthor;
        dueDate = theDueDate;

        timesLoaned = theTimesLoaned;

        onLoan = theOnLoan;
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
}
