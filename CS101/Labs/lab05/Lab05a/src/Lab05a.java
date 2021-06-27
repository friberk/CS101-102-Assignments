import java.util.Scanner;

/**
 * Wall with a hole generator
 *
 * @author Berk Cakar // 22003021
 * @version 24.11.2020
 */
public class Lab05a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        String doItAgain;

        int width;
        int height;
        int thickness;

        int rows;
        int columns;

        // Program Code
        do {
            doItAgain = "y";

            System.out.print("Enter wall width: ");
            width = scan.nextInt();

            System.out.print("Enter wall height: ");
            height = scan.nextInt();

            System.out.print("Enter wall thickness: ");
            thickness = scan.nextInt();

            if (width <= 0 || height <= 0 || thickness <= 0) {
                System.out.println("All values must be positive!");
            }

            // Printing the rectangles which cannot have a hole
            else if (thickness * 2 >= width || thickness * 2 >= height) {
                // Printing the rows until height value is reached.
                for (rows = 1; rows <= height; rows = rows + 1) {
                    // Printing the stars
                    for (columns = 1; columns <= width; columns = columns + 1) {
                        System.out.print("*");
                    }

                    // Skipping a line after every for loop completed.
                    System.out.println();
                }

                System.out.println("Oops... no hole!");
            }

            else {
                /*
                 * Printing the rows until height value is reached.
                 *
                 * I didn't initialized rows = rows + 1 there, because rows variable needs to be
                 * updated in every while loop below. Otherwise it will loop to forever.
                 */
                for (rows = 1; rows <= height;) {
                    /*
                     * Printing the rows which are above or below the hole. For example if our
                     * width=10 height=10 thickness=3 this loop will print 1., 2., 3. and 8., 9.,
                     * 10. rows.
                     */
                    while (rows <= thickness || rows > height - thickness && rows <= height) {
                        for (columns = 1; columns <= width; columns = columns + 1) {
                            System.out.print("*");
                        }

                        rows = rows + 1;
                        // Skipping a line after while loop completed.
                        System.out.println();
                    }

                    /*
                     * Printing the stars and empty characters that consist the "hole". For example
                     * if our width=10 height=10 thickness=3 this loop will arrange the shape of 4.,
                     * 5., 6. and 7. rows.
                     */
                    while (rows > thickness && rows <= height - thickness) {
                        /*
                         * I didn't initialized columns = columns + 1 there, because columns variable
                         * needs to be updated in every while loop below. Otherwise it will loop
                         * forever.
                         */
                        for (columns = 1; columns <= width;) {
                            // Printing the stars for left side of the hole.
                            while (columns <= thickness) {
                                System.out.print("*");
                                columns = columns + 1;
                            }

                            // Inserting empty characters for the hole.
                            while (columns > thickness && columns <= width - thickness) {
                                System.out.print(" ");
                                columns = columns + 1;
                            }

                            // Printing the stars for right side of the hole.
                            while (columns > width - thickness && columns <= width) {
                                System.out.print("*");
                                columns = columns + 1;
                            }

                            rows = rows + 1;
                            // Skipping a line after while loop completed.
                            System.out.println();
                        }
                    }
                }

                System.out.println("If you want to print another wall with a hole type \"Y\" or \"y\": ");
                System.out.print("If you want to exit type anything else: ");
                doItAgain = scan.next();

                if (!(doItAgain.equalsIgnoreCase("y"))) {
                    System.out.println("Goodbye");
                }
            }
        } while (doItAgain.equalsIgnoreCase("y"));

        scan.close();
    }
}
