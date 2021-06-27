import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Random Integer Generator
 *
 * @author Berk Cakar // 22003021
 * @version 18.11.2020
 */
public class Lab04d {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        // Variables
        int amount;
        int amountInput;

        int min;
        int max;

        int generatedNumber;

        String filename;

        // Program Code

        // Ask and get the amount of the numbers that user wants.
        System.out.print("Please enter the amount of numbers that you want to generate: ");
        amountInput = scan.nextInt();

        System.out.println("Please enter the range of values that you want to generate: ");

        // Ask and get the minimum of the interval that user wants.
        System.out.print("Minumum value in range: ");

        /*
         * Before adding "- 1" Java wasn't generating a random integer at the minimum of
         * given interval. For example in [0,2] it was generating only 1 and 2. So, I
         * added -1 to fix the issue.
         */
        min = scan.nextInt() - 1;

        // Ask and get the maximum of the interval that user wants.
        System.out.print("Maximum value in range: ");
        max = scan.nextInt();

        // Ask and get the name of the output file.
        System.out.print("Enter a name for file output of generated numbers: ");
        filename = scan.next();

        amount = amountInput;

        PrintWriter fout = new PrintWriter(filename + ".txt");

        // It loops to generate a random Integer on the given Interval until "amount"
        // reaches to 1.
        while (amount >= 1) {
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

        System.out.println("Output file successfully generated in /src folder!");

        fout.close();
        scan.close();
    }
}
