/**
 * "DiceGame" class for Lab07a
 */
public class DiceGame {
    // Properties
    Dice dice;

    int rollCount;

    // Constructors
    public DiceGame() {
        dice = new Dice();
    }

    // Methods
    public int play() {
        while (dice.roll() != 12) {
            rollCount = rollCount + 1;
        }

        return rollCount;
    }
}
