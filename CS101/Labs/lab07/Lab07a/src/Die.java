/**
 * "Die" Java Class for Lab07a
 */
public class Die {
    // Properties
    int rollFaceValue;

    // Constructors
    public Die() {
    }

    // Methods
    public int roll() {
        /*
         * Generating random numbers between [1, 6]. Adding "1" to it ensures that there
         * isn't any "0"s generated.
         */
        rollFaceValue = 1 + (int) (Math.random() * 6);

        return rollFaceValue;
    }

    public int getFaceValue() {
        return rollFaceValue;
    }

    public String toString() {
        return "Die value is : " + getFaceValue();
    }
}
