/**
 * Package class for Lab04 assignment.
 */
public class Package extends Delivery {
    // Properties
    Item packedItem;

    // Constructors

    /**
     * This constructor initializes the content, sender, receiver and package number of a package.
     * @param content is the content of the package.
     * @param sender is the sender of the package.
     * @param receiver is the receiver of the package.
     * @param packageNo is the package number of the package.
     */
    public Package( Item content, Customer sender, Customer receiver, int packageNo ) {
        super( sender, receiver, packageNo );
        this.packedItem = content;
    }

    // Methods

    /**
     * This method gets the weight of the package.
     * @return Package's weight.
     */
    @Override
    public double getWeight() {
        return packedItem.weight;
    }

    /**
     * This method returns the string representation of the mail.
     * @return The string representation of the mail.
     */
    @Override
    public String toString() {
        return "Package's content: " + this.packedItem.content + ", Weight: " + this.packedItem.weight +
               ", Sender: " + this.sender.name + ", Receiver: " + this.receiver.name + ", Receiver location (x, y): "
               + "(" + this.receiver.posX + ", " + this.receiver.posY + ")" + ", Package no: " + this.packageNo;
    }
}
