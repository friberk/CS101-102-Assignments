import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * First part of the Lab04e assignment
 *
 * @author Berk Cakar // 22003021
 * @version 18.11.2020
 */

public class Lab04e {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner(new File("src/testdata.txt"));

        // Variables
        int numberAmountInput;
        int numberAmount;
        int number;
        int sumOfNumbers;
        int min;
        int max;

        double average;

        // Program Code

        // Task 1
        System.out.println("Task 1 begins: \n");

        System.out.print("How many numbers do you want to enter? ");
        numberAmountInput = scan.nextInt();

        numberAmount = numberAmountInput;
        sumOfNumbers = 0;

        while (numberAmount >= 1) {
            System.out.print("Enter the number: ");
            number = scan.nextInt();

            sumOfNumbers = sumOfNumbers + number;

            numberAmount = numberAmount - 1;
        }

        System.out.println("You have entered " + numberAmountInput + " numbers."
                + "\nSum of the numbers that you have entered is " + sumOfNumbers);

        System.out.println("\nTask 1 ends.");

        // Task 2
        System.out.println("\nTask 2 begins: \n");

        System.out.print("Until which line do you want to process numbers in \"testdata.txt\"? ");
        numberAmountInput = scan.nextInt();

        numberAmount = numberAmountInput;
        sumOfNumbers = 0;

        while (numberAmount >= 1) {
            number = dataInputFile.nextInt();

            sumOfNumbers = sumOfNumbers + number;

            numberAmount = numberAmount - 1;
        }

        System.out.println("Program has processed " + numberAmountInput + " numbers."
                + "\nSum of the numbers that you have entered is " + sumOfNumbers);

        System.out.println("\nTask 2 ends.");

        // Task 3
        System.out.println("\nTask 3 begins: \n");

        numberAmountInput = 100;

        numberAmount = numberAmountInput;
        sumOfNumbers = 0;
        average = 0;
        /*
         * Assigning minimum value of integers to "max" and maximum value of integers to
         * "min". So, the first value in the dataInputFile always be the reference point
         * for comparison.
         */
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        while (numberAmount >= 1) {
            number = dataInputFile.nextInt();

            sumOfNumbers = sumOfNumbers + number;

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            numberAmount = numberAmount - 1;
        }

        average = (double) sumOfNumbers / (double) numberAmountInput;

        System.out.println("Program has processed first " + numberAmountInput + " numbers."
                + "\nSum of the first 100 numbers is " + sumOfNumbers);

        System.out.println("Average of first 100 numbers is " + average);

        System.out.println("The minumum value among first 100 numbers is " + min);
        System.out.println("The maximum value among first 100 numbers is " + max);

        System.out.println("\nTask 3 ends.");

        // Task 4
        System.out.println("\nTask 4 begins: \n");

        numberAmountInput = 10000;

        numberAmount = numberAmountInput;
        sumOfNumbers = 0;
        average = 0;
        /*
         * Assigning minimum value of integers to "max" and maximum value of integers to
         * "min". So, the first value in the dataInputFile always be the reference point
         * for comparison.
         */
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        while (numberAmount > 1) {
            number = dataInputFile.nextInt();

            sumOfNumbers = sumOfNumbers + number;

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            numberAmount = numberAmount - 1;
        }

        average = (double) sumOfNumbers / (double) numberAmountInput;

        System.out.println("Program has processed first " + numberAmountInput + " numbers."
                + "\nSum of the first 10000 numbers is " + sumOfNumbers);

        System.out.println("Average of first 10000 numbers is " + average);

        System.out.println("The minumum value among first 10000 numbers is " + min);
        System.out.println("The maximum value among first 10000 numbers is " + max);

        System.out.println("\nTask 4 ends.");

        dataInputFile.close();
        scan.close();
    }
}
