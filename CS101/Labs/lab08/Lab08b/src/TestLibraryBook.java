import java.util.Scanner;

/**
 * A simple library management program (?)
 * 
 * @author Berk Cakar // 22003021
 * @version 23.12.2020
 */
public class TestLibraryBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        Library library;

        String selection;
        String title;
        String author;
        String dueDate;
        String searchedTitle;

        // Program Code
        library = new Library();

        System.out.println("\nWelcome to Library Management Program!");

        do {
            System.out.print("\nType Show, Find, Add to perform an operation, type Exit to close the program: ");
            selection = scan.nextLine();

            if (selection.equalsIgnoreCase("Show")) {
                if (library.isEmpty()) {
                    System.out.println("\nThe Library is empty.");
                }

                else {
                    System.out.println("\n" + library.toString());
                }
            }

            if (selection.equalsIgnoreCase("Add")) {
                System.out.print("\nEnter the title: ");
                title = scan.nextLine();

                System.out.print("Enter the author: ");
                author = scan.nextLine();

                library.addBook(title, author);
            }

            if (selection.equalsIgnoreCase("Find")) {
                System.out.print("\nEnter the title of the book: ");
                searchedTitle = scan.nextLine();

                if (library.findByTitle(searchedTitle) == null) {
                    System.out.println("\nThere is not any book with title " + searchedTitle);
                }

                else {
                    System.out.println(library.findByTitle(searchedTitle) + "\n");

                    System.out.print(
                            "Type Loan, Return, Remove to perform an operation on this book, type Back to return: ");

                    selection = scan.nextLine();

                    if (selection.equalsIgnoreCase("Loan")) {
                        if (library.findByTitle(searchedTitle).onLoan == false) {
                            System.out.print("\nPlease type in the due date (dd.mm.yyyy): ");
                            dueDate = scan.nextLine();

                            library.findByTitle(searchedTitle).dueDate = dueDate;
                            library.findByTitle(
                                    searchedTitle).timesLoaned = library.findByTitle(searchedTitle).timesLoaned + 1;
                            library.findByTitle(searchedTitle).onLoan = true;

                            System.out.println("You loaned the book");
                        }

                        else {
                            System.out.println("This book is already on loan. You cannot loan it.");
                        }
                    }

                    else if (selection.equalsIgnoreCase("Return")) {
                        if (library.findByTitle(searchedTitle).onLoan == false) {
                            System.out.println("This book is already returned. You cannot return it.");
                        }

                        else {
                            library.findByTitle(searchedTitle).onLoan = false;

                            System.out.println("You returned the book");
                        }
                    }

                    else if (selection.equalsIgnoreCase("Remove")) {
                        library.remove(library.findByTitle(searchedTitle));
                    }
                }
            }
        } while (!selection.equalsIgnoreCase("Exit"));

        scan.close();
    }
}
