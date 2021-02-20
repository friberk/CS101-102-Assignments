import java.util.Scanner;

/**
 * Lab05b assignment
 * @author Berk Cakar // 22003021
 * @version 25.11.2020 -- syntax revised on 19.02.2021
*/
public class Lab05b
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // constants
        final int CELL_WIDTH = 6;

        // variables
        int rowsInput;
        int columnsInput;

        int rows;
        int columns;

        int cellSpaces;

        int firstNumber;

        // program code

        System.out.print( "Enter the number of rows that you want to print: " );
        rowsInput = scan.nextInt();

        System.out.print( "Enter the number of columns that you want to print: " );
        columnsInput = scan.nextInt();

        if ( ( rowsInput <= 0 ) || ( columnsInput <= 0 ) ) {
            System.out.println( "All values must be positive!" );
        }

        else {
            //Loop for task 1
            System.out.println( "\n1. the row & column numbers as shown in the example" );

            for ( rows = 1; rows <= rowsInput; rows = rows + 1 ) {

                for ( columns = 1; columns <= columnsInput; columns = columns + 1 ) {
                    //Inserting spaces for a proper looking table.
                    for ( cellSpaces = (rows + "," + columns).length(); cellSpaces <= CELL_WIDTH; cellSpaces = cellSpaces
                            + 1 ) {
                        System.out.print( " " );
                    }

                    System.out.print( rows + "," + columns );
                }

                // Skipping a line for every row completed.
                System.out.println();
            }

            // Loop for task 2
            System.out.println( "\n2. the product of the row & column number (a multiplication table!)" );

            for ( rows = 1; rows <= rowsInput; rows = rows + 1 ) {

                for ( columns = 1; columns <= columnsInput; columns = columns + 1 ) {

                    // Inserting spaces for a proper looking table.
                    for ( cellSpaces = ( String.valueOf( rows * columns )
                            .length() ); cellSpaces <= CELL_WIDTH; cellSpaces = cellSpaces + 1 ) {
                        System.out.print( " " );
                    }

                    System.out.print( rows * columns );
                }

                // Skipping a line for every row completed.
                System.out.println();
            }

            // Loop for task 3
            System.out.println( "\n3. the cell number beginning from 0 and increasing left to right, top to bottom" );

            firstNumber = 0;

            for ( rows = 1; rows <= rowsInput; rows = rows + 1 ) {

                for ( columns = 1; columns <= columnsInput; columns = columns + 1 ) {
                    // Inserting spaces for a proper looking table.
                    for ( cellSpaces = ( ( firstNumber + "," ).length() ); cellSpaces <= CELL_WIDTH; cellSpaces = cellSpaces + 1 ) {
                        System.out.print( " " );
                    }

                    System.out.print( firstNumber );

                    if (columns < columnsInput) {
                        System.out.print( "," );
                    }

                    firstNumber = firstNumber + 1;
                }

                // Skipping a line for every row completed.
                System.out.println();
            }

            // Loop for task 4
            System.out.println( "\n4. the row number in the first column only, putting the String \"-\" into the other cells." );

            for ( rows = 1; rows <= rowsInput; rows = rows + 1 ) {

                for ( columns = 1; columns <= columnsInput; columns = columns + 1 ) {

                    // Inserting spaces for a proper looking table.
                    for ( cellSpaces = ( ( rows + "," ).length() ); columns == 1
                            && cellSpaces <= CELL_WIDTH; cellSpaces = cellSpaces + 1) {
                        System.out.print( " " );
                    }

                    for ( cellSpaces = 2; columns != 1 && cellSpaces <= CELL_WIDTH; cellSpaces = cellSpaces + 1 ) {
                        System.out.print( " " );
                    }

                    if ( columns == 1 ) {
                        System.out.print( rows );
                    }

                    else {
                        System.out.print( "-" );
                    }

                    if ( columns < columnsInput ) {
                        System.out.print( "," );
                    }

                }

                //Skipping a line for every row completed.
                System.out.println();
            }
        }

        scan.close();
    }
}