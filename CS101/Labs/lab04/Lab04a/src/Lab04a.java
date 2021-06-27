import java.util.Scanner;

/**
 * Lab04a assignment
 *
 * @author Berk Cakar // 22003021
 * @version 09.11.2020
 */
public class Lab04a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        int n;
        int negativeN;
        int nInput;
        int start;
        int breakCounter;
        // Program Code

        System.out.print("Enter a positive integer: ");
        nInput = scan.nextInt();

        n = nInput;
        negativeN = -1 * n;
        start = 0;
        breakCounter = 0;

        // Task 1
        System.out.println("\n Task 1 begins: ");

        while (start < n) {
            System.out.print(start++ + " ");
        }

        System.out.println("\n Task 1 ends.");

        n = nInput;
        negativeN = -1 * n;
        start = 0;
        breakCounter = 0;

        // Task 2
        System.out.println("\n Task 2 begins: ");

        while (start < n) {
            System.out.print(start++ + " ");

            if (start % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n Task 2 ends.");

        n = nInput;
        negativeN = -1 * n;
        start = 0;
        breakCounter = 0;

        // Task 3
        System.out.println("\n Task 3 begins: ");

        while (start <= n) {
            System.out.print(n-- + " ");
        }

        System.out.println("\n Task 3 ends.");

        start = 0;
        n = nInput;
        negativeN = -1 * n;
        breakCounter = 0;

        // Task 4
        System.out.println("\n Task 4 begins: ");

        while (negativeN <= n) {
            if (negativeN % 2 == 0) {
                System.out.print(negativeN + " ");
            }

            negativeN++;
        }

        System.out.println("\n Task 4 ends.");

        start = 0;
        n = nInput;
        negativeN = -1 * n;
        breakCounter = 0;

        // Task 5
        System.out.println("\n Task 5 begins: ");

        while (start <= n) {
            if (start % 2 != 0) {
                System.out.print((start) * (start) + " ");
                breakCounter++;

                if (breakCounter % 5 == 0) {
                    System.out.println();
                }
            }

            start++;
        }

        System.out.println("\n Task 5 ends.");

        start = 0;
        n = nInput;
        negativeN = -1 * n;
        breakCounter = 0;

        // Task 6
        System.out.println("\n Task 6 begins: ");

        while (n >= 3) {
            if (n % 3 == 0 || n % 4 == 0 && n % 12 != 0) {
                System.out.print(n + " ");
                breakCounter++;

                if (breakCounter % 5 == 0) {
                    System.out.println();
                }

            }

            n--;
        }

        System.out.println("\n Task 6 ends.");

        start = 2;
        n = nInput;
        negativeN = -1 * n;
        breakCounter = 0;

        // Task 7
        System.out.println("\n Task 7 begins: ");

        while (start <= n) {

            if (n % start == 0) {
                System.out.print(start + " ");
            }

            start++;
        }

        System.out.println("\n Task 7 ends.");
        scan.close();
    }
}
