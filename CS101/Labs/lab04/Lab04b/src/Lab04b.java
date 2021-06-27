import java.util.Scanner;

/**
 * Lab04b assignment
 *
 * @author Berk Cakar // 22003021
 * @version 08.11.2020
 */
public class Lab04b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        int rows;
        int column;
        int numberOfRows;

        char character;

        // Program Code
        // Get the number of rows from the user
        System.out.println("Enter the number of row to print");
        numberOfRows = scan.nextInt();

        System.out.println("Enter which character you want to print");
        character = scan.next().charAt(0);

        System.out.println("Triangle");

        rows = 1;

        /*
         * Loops for amount of number of rows which user chose times. For example if
         * user wanted to be a 10 row triange it will loop 10 times.
         */
        while (rows <= numberOfRows) {
            column = 1;

            /*
             * In every row we want same amount of characters as our line number. example,
             * it should print 4 characters in the 4th line of the output. So, this
             * statement loops until line no == characters that printed.
             */
            while (column <= rows) {
                System.out.print(character);
                column++;
            }

            System.out.println();
            rows++;
        }

        scan.close();
    }
}
