import java.util.Scanner;

/**
 * Lab07a part 3 assignment
 * 
 * @author Berk Çakar
 * @version 13.12.2020
 */
public class TestDie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        Die die1;
        Die die2;

        // Program Code
        die1 = new Die();
        die2 = new Die();

        // It prints out 0, because we didn't roll the dices yet.
        System.out.println(die1);
        System.out.println(die2);

        die1.roll();
        die2.roll();

        System.out.println(die1.getFaceValue());
        System.out.println(die2.getFaceValue());

        System.out.println(die1.toString());
        System.out.println(die2.toString());

        scan.close();
    }
}
