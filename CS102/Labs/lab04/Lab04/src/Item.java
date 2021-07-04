/**
 * Item class for Lab04 assignment.
 */
public class Item {
    // Properties
    double weight;
    String content;

    // Constructors

    /**
     * This constructor initializes the weight and the content of an item.
     * @param weight is the weight of the item.
     * @param content is the content of the item.
     */
    public Item( double weight, String content ) {
        this.weight = weight;
        this.content = content;
    }

    // Methods

    /**
     * This method gets the weight of the item.
     * @return Item's weight.
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * This method gets the content of the item.
     * @return Item's content.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * This method returns the string representation of the item.
     * @return The string representation of the item.
     */
    @Override
    public String toString() {
        return "Item's weight: " + this.weight + ", Content: " + this.content;
    }
}
