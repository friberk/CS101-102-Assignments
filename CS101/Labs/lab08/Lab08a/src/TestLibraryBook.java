import java.util.Scanner;

/**
 * A simple library program (?)
 * 
 * @author Berk Cakar // 22003021
 * @version 23.12.2020
 */
public class TestLibraryBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Constants

        // Variables
        LibraryBook library;
        LibraryBook library2;

        String selection;
        String newDueDate;

        // Program Code
        // Book's name, author, current due date, times loaned, on loan status.
        library = new LibraryBook("Harry Potter", "J.K. Rowling", "31.12.2020", 3, true);
        library2 = new LibraryBook(library);

        System.out.println(library2);

        System.out.println("\n" + library.toString());

        do {
            System.out.print("\nDo you want to loan or return this book? \n" + "Type \"loan\" or \"return\": ");
            selection = scan.next();

            if (selection.equalsIgnoreCase("loan")) {
                if (library.onLoan == true) {
                    System.out.println("This book is already on loan. You cannot loan it.");
                }

                else {
                    System.out.print("Please type in the due date (dd.mm.yyyy): ");
                    newDueDate = scan.next();

                    library.onLoan(selection, newDueDate);

                    System.out.println("You successfully loaned this book until due date: " + newDueDate);

                    System.out.println(library.toString());
                }
            }

            else if (selection.equalsIgnoreCase("return")) {
                if (library.onLoan == false) {
                    System.out.println("This book is already returned. You cannot return it.");
                }

                else {
                    library.onLoan(selection, library.getDueDate());

                    System.out.println("You returned the book");

                    System.out.println(library.toString());
                }
            }

            else {
                System.out.println("\nOops! Invalid selection.");
            }
        } while (!(selection.equalsIgnoreCase("loan") || selection.equalsIgnoreCase("return")));

        scan.close();
    }
}