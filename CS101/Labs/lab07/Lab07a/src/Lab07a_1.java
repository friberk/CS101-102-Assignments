import java.util.Scanner;

/**
 * Lab07a part 1 assignment
 * 
 * @author Berk Çakar
 * @version 13.12.2020
 */
public class Lab07a_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Constants
        final int DICE_FACE = 6;

        // Variables
        int dice1;
        int dice2;

        int rollCounter;

        // Program Code
        System.out.println("Welcome to dice roller!");

        rollCounter = 0;

        do {
            rollCounter = rollCounter + 1;

            /*
             * Generating random numbers between [1, 6]. Adding "1" to it ensures that there
             * isn't any "0"s generated.
             */
            dice1 = 1 + (int) (Math.random() * DICE_FACE);
            dice2 = 1 + (int) (Math.random() * DICE_FACE);

        } while (!(dice1 == 6 && dice2 == 6));

        System.out.println("Program made " + rollCounter + " rolls until two sixes are thrown.");

        scan.close();
    }
}
