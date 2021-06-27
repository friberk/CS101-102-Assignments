import java.util.Scanner;

/**
 * Lab07a part 2 assignment
 * 
 * @author Berk Çakar
 * @version 13.12.2020
 */
public class Lab07a_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Constants
        final int DICE_FACE = 6;

        // Variables
        int pairNumberInput;
        int pairNumber;

        int dice;

        int rollCounter;

        // Program Code
        System.out.println("\nWelcome to dice roller!");

        System.out.print("\nHow many pairs of dice you want to roll?: ");
        pairNumberInput = scan.nextInt();

        rollCounter = 0;

        for (pairNumber = 1; pairNumber <= pairNumberInput; pairNumber = pairNumber + 1) {
            System.out.print("Pair number " + pairNumber + ":");

            for (rollCounter = 1; rollCounter <= 2; rollCounter = rollCounter + 1) {
                /*
                 * Generating random numbers between [1, 6]. Adding "1" to it ensures that there
                 * isn't any "0"s generated.
                 */
                dice = 1 + (int) (Math.random() * DICE_FACE);

                System.out.printf("%20s", rollCounter + ". " + "Dice: " + dice);
            }

            System.out.println();
        }

        scan.close();
    }
}
