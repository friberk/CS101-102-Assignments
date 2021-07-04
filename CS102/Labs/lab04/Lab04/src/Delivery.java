/**
 * Delivery abstract class for Lab04 assignment.
 */
public abstract class Delivery {
    // Properties
    Customer sender;
    Customer receiver;

    int packageNo;

    // Constructors

    /**
     * This constructor initializes the sender, receiver and package number of a delivery.
     * @param sender is the sender of the delivery.
     * @param receiver is the receiver of the delivery.
     * @param packageNo is the package number of the delivery.
     */
    public Delivery( Customer sender, Customer receiver, int packageNo ) {
        this.sender = sender;
        this.receiver = receiver;

        this.packageNo = packageNo;
    }

    // Methods

    /**
     * This method gets the sender of the delivery.
     * @return Delivery's sender.
     */
    public Customer getSender() {
        return this.sender;
    }

    /**
     * This method gets the receiver of the delivery.
     * @return Delivery's receiver.
     */
    public Customer getReceiver() {
        return this.receiver;
    }

    /**
     * This method gets the package number of the delivery.
     * @return Delivery's package number.
     */
    public int getPackageNo() {
        return this.packageNo;
    }

    /**
     * Abstract class for getting delivery's weight.
     */
    public abstract double getWeight();
}
