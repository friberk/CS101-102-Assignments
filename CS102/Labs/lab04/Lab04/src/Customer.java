/**
 * Customer class for Lab04 assignment.
 */
public class Customer extends Person {
    // Properties
    Item currentItem;

    // Constructors

    /**
     * This constructor initializes the name of the customer and his/her position.
     * @param name is the name of the customer.
     * @param posX is the X position of the customer.
     * @param posY is the Y position of the customer.
     */
    public Customer ( String name, int posX, int posY ) {
        super( name, posX, posY );
    }

    /**
     * This constructor initializes the name of the customer and his/her position to 0.
     * @param name is the name of the customer.
     */
    public Customer( String name ) {
        super( name );
    }

    // Methods

    /**
     * This method gets the item of the customer.
     * @return Customer's item.
     */
    public Item getItem() {
        return this.currentItem;
    }

    /**
     * This method sets the item of the customer.
     * @param currentItem is the customer's item to be set.
     */
    public void setItem( Item currentItem ) {
        this.currentItem = currentItem;
    }

    /** TO DO
     * This method sends an item via given company to the receiver if an employee is available
     * (returns {@code false} otherwise). Item object is ignored if the customer already has an item to be sent.
     * @param company is the company that will carry the item.
     * @param item is the item to be sent. If customer has already an item in hold, this method will ship the
     * existent one instead of the passed one.
     * @param receiver is the receiver of the item.
     * @return {@code true} if the item is ready to be sent, {@code false} otherwise.
     */
    public boolean sendItem( Company company, Item item, Customer receiver ) {          /* Lab assignment is not clear about this method */
        if ( this.currentItem != null ) {
            return company.createDeliverable( this.currentItem, this, receiver );
        }

        else {
            return company.createDeliverable( item, this, receiver );
        }
    }

    /**
     * This method returns the string representation of the customer.
     * @return The string representation of the customer.
     */
    @Override
    public String toString() {
        return "Customer's name: " + this.name + ", (x, y): " +
               "(" + this.posX + ", " + this.posY + ")";
    }
}
