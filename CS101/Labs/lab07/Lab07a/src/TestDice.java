import java.util.Scanner;

/**
 * Lab07a part 4 assignment
 * 
 * @author Berk Çakar
 * @version 13.12.2020
 */
public class TestDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        Dice die;

        // Program Code
        die = new Dice();

        // Triggering the roll method to get values of both die.
        die.roll();

        // Printing all methods in Dice class one by one.
        System.out.println("\nProgram rolled a pair of dice!");
        System.out.println("\nFirst dice: " + die.getDie1FaceValue());
        System.out.println("Second dice: " + die.getDie2FaceValue());
        System.out.println("Dice Total: " + die.getDiceTotal());

        // Using toString method in Dice class to print out values in a pre-arranged
        // form.
        System.out.println("\n" + die.toString());

        scan.close();
    }
}
