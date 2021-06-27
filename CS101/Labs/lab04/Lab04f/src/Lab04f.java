import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Lab04f assignment. In Lab04f's second part, we need to use "arrays" or at
 * least a "break;" statament in order to get same program as described in lab
 * paper (n amount of negative number at a random place). For lab purposes,
 * Instead of doing that I will print negative numbers with a possiblity
 * percentage which user decides.
 *
 * @author Berk Cakar // 22003021
 * @version 18.11.2020
 */
public class Lab04f {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        // Variables
        double possiblity;

        int amount;
        int amountInput;

        int min;
        int max;

        int lineNumber;
        int generatedNumber;

        String filename;
        String userChoice;

        // Program Code
        System.out.println(
                "\nIf you want to insert a \"-1\" at a specified location in " + "the output file please type \"x\" ");

        System.out.println("\nIf you want to insert as many numbers as you want at a random "
                + "location in the output file please type \"y\" \n");

        userChoice = scan.next();

        if (userChoice.equals("x")) {
            System.out.print("Please enter the amount of numbers that you want to generate: ");
            amountInput = scan.nextInt();

            System.out.println("Please enter the range of values that you want to generate: ");

            /*
             * Before adding "- 1" Java wasn't generating a random integer at 0. For example
             * in [0,2] it was generating only 1 and 2. So, I added -1 to fix the issue.
             */
            System.out.println("Minimum value in range is 0 by default. ");
            min = 0 - 1;

            System.out.print("Maximum value in range: ");
            max = scan.nextInt();

            System.out.print("Enter which line do you want to make \"-1\" appear: ");
            lineNumber = scan.nextInt();

            System.out.print("Enter a name for file output of generated numbers: ");
            filename = scan.next();

            amount = amountInput;

            PrintWriter fout = new PrintWriter(filename + ".txt");

            while (amount >= 1) {
                if (amountInput - amount + 1 == lineNumber) {
                    System.out.println(-1);
                    fout.println(-1);
                    amount = amount - 1;
                }

                else {
                    /*
                     * Math.random() * ( max - min ) returns a value in the range [0, max – min]
                     * where max is excluded. For example, if we want [5, 10], we need to cover 5
                     * integer values so we can use Math.random()*5 This would return a value in the
                     * range [0, 5], where 5 is not included. To get the max value included, we need
                     * to add 1 to (max - min). Then, in order to get [5, 10] instead of [0, 5] we
                     * are adding + min to the statement.
                     */
                    generatedNumber = min + (int) (1 + (Math.random() * (max - min)));
                    System.out.println(generatedNumber);
                    fout.println(generatedNumber);
                    amount = amount - 1;
                }
            }

            fout.close();
        }

        if (userChoice.equals("y")) {
            System.out.print("Please enter the amount of numbers that you want to generate: ");
            amountInput = scan.nextInt();

            System.out.println("Please enter the range of values that you want to generate: ");

            /*
             * Before adding "- 1" Java wasn't generating a random integer at 0. For example
             * in [0,2] it was generating only 1 and 2. So, I added -1 to fix the issue.
             */
            System.out.println("Minimum value in range is 0 by default. ");
            min = 0 - 1;

            System.out.print("Maximum value in range: ");
            max = scan.nextInt();

            System.out.println("Enter at which possiblity do you want to make \"negative numbers\" appear. ");
            System.out.println("Since the probability is in percent, you must enter a value between 0 and 100: ");
            possiblity = scan.nextDouble();

            System.out.print("Enter a name for file output of generated numbers: ");
            filename = scan.next();

            amount = amountInput;

            PrintWriter fout = new PrintWriter(filename + ".txt");

            while (amount >= 1) {
                if (Math.random() <= possiblity / 100) {
                    /*
                     * Math.random() * ( max - min ) returns a value in the range [0, max – min]
                     * where max is excluded. For example, if we want [5, 10], we need to cover 5
                     * integer values so we can use Math.random()*5 This would return a value in the
                     * range [0, 5], where 5 is not included. To get the max value included, we need
                     * to add 1 to (max - min). Then, in order to get [5, 10] instead of [0, 5] we
                     * are adding + min to the statement.
                     */
                    generatedNumber = -1 * (min + (int) (1 + (Math.random() * (max - min))));
                    System.out.println(generatedNumber);
                    fout.println(generatedNumber);
                    amount = amount - 1;
                }

                else {
                    /*
                     * Math.random() * ( max - min ) returns a value in the range [0, max – min]
                     * where max is excluded. For example, if we want [5, 10], we need to cover 5
                     * integer values so we can use Math.random()*5 This would return a value in the
                     * range [0, 5], where 5 is not included. To get the max value included, we need
                     * to add 1 to (max - min). Then, in order to get [5, 10] instead of [0, 5] we
                     * are adding + min to the statement.
                     */
                    generatedNumber = min + (int) (1 + (Math.random() * (max - min)));
                    System.out.println(generatedNumber);
                    fout.println(generatedNumber);
                    amount = amount - 1;
                }
            }

            fout.close();
        }

        scan.close();
    }
}
