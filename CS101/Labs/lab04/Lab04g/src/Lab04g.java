import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Lab04g assignment
 *
 * @author Berk Cakar
 * @version 18.11.2020
 */
public class Lab04g {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner(new File("src/testdata.txt"));

        // Variables
        int number;
        int numbersProcessed;
        int sumOfNumbers;
        int min;
        int max;

        double average;

        // Program Code

        sumOfNumbers = 0;
        number = dataInputFile.nextInt();
        numbersProcessed = 0;

        /*
         * Assigning minimum value of integers to "max" and maximum value of integers to
         * "min". So, the first value in the dataInputFile always be the reference point
         * for comparison.
         */
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        while (number * -1 <= 0) {
            number = dataInputFile.nextInt();

            sumOfNumbers = sumOfNumbers + number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            numbersProcessed = numbersProcessed + 1;
        }

        average = (double) sumOfNumbers / (double) numbersProcessed;

        System.out.println("Program has processed " + numbersProcessed + " numbers."
                + "\nSum of the processed numbers is " + sumOfNumbers);

        System.out.println("Average of processed numbers is " + average);

        if (numbersProcessed != 1) {
            System.out.println("The minumum value among processed numbers is " + min);
            System.out.println("The maximum value among processed numbers is " + max);
        }

        scan.close();
    }
}
