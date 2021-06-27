/**
 * "Dice" class for Lab07a
 */
public class Dice {
    // Properties
    Die die1;
    Die die2;

    // Constructors
    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }

    // Methods
    public int roll() {
        return die1.roll() + die2.roll();
    }

    public int getDie1FaceValue() {
        return die1.getFaceValue();
    }

    public int getDie2FaceValue() {
        return die2.getFaceValue();
    }

    public int getDiceTotal() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public String toString() {
        return "\n" + "Face value of Die 1: " + getDie1FaceValue() + "\n" + "Face value of Die 2: " + getDie2FaceValue()
                + "\n" + "Total: " + getDiceTotal();
    }
}
