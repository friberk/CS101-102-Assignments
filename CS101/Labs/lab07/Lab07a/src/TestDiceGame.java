import java.util.Scanner;

/**
 * Lab07a part 5 assignment
 * 
 * @author Berk Çakar
 * @version 13.12.2020
 */
public class TestDiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        DiceGame dice;

        // Program Code
        dice = new DiceGame();

        System.out.println("The program rolled the dice " + dice.play() + " times until double six are thrown.");

        scan.close();
    }
}
