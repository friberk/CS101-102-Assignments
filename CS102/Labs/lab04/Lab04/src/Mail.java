/**
 * Mail class for Lab04 assignment.
 */
public class Mail extends Delivery {
    // Properties
    String content;

    // Constructors

    /**
     * This constructor initializes the content, sender, receiver and package number of a mail.
     * @param content is the content of the delivery.
     * @param sender is the sender of the mail.
     * @param receiver is the receiver of the mail.
     * @param packageNo is the package number of the mail.
     */
    public Mail( String content, Customer sender, Customer receiver, int packageNo ) {
        super( sender, receiver, packageNo );
        this.content = content;
    }

    // Methods

    /**
     * This method gets the weight of the mail.
     * @return Mail's weight (0.1 indepented from content).
     */
    @Override
     public double getWeight() {
        return 0.1;
    }

    /**
     * This method returns the string representation of the mail.
     * @return The string representation of the mail.
     */
    @Override
    public String toString() {
        return "Mail's content: " + this.content + ", Weight: <=" + this.getWeight() + ", Sender: " +
               this.sender.name + ", Receiver: " + this.receiver.name + ", Receiver location (x, y): " +
               "(" + this.receiver.posX + ", " + this.receiver.posY + ")" + ", Package no: " + this.packageNo;
    }

}
