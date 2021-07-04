/**
 * Employee class for Lab04 assignment.
 */
public class Employee extends Person {
    // Properties
    final int MAX_JOBS = 5;

    int currentJobs;
    Delivery[] deliveries;
    double salary;
    int employeeNo;
    boolean available;

    // Constructors

    /**
     * This constructor initializes the name of the employee and his/her employee number.
     * @param employeeNo is the employee number of the employee.
     * @param name is the name of the employee.
     */
    public Employee( int employeeNo, String name ) {
        super( name );
        this.employeeNo = employeeNo;

        this.currentJobs = 0;
        this.deliveries = new Delivery[ MAX_JOBS ];
        this.available = true;
    }

    // Methods

    /**
     * This method adjusts the employee’s salary by a given value.
     * @param value is the value to adjust employee's salary with.
     */
    public void adjustSalary( double value ) {
        this.salary = this.salary + value;
    }

    /**
     * This method returns if the employee is available or not.
     * @return {@code true} if the employee is available, otherwise
     * {@code false}.
     */
    public boolean getAvailability() {
        return available;
    }

    /**
     * This method determines the type of item and converts it to either mail (weight <= 0.1) or
     * package (weight > 0.1) and adds it to the array of deliveries.
     * @param sendItem is the item to be deliveried.
     * @param sender is the sender of the item.
     * @param receiver is the receiver of the item.
     * @param packageNo is the package number of the item.
     */
    public void addJob( Item sendItem, Customer sender, Customer receiver, int packageNo ) {
        if ( sendItem.getWeight() <= 0.1 && this.currentJobs < MAX_JOBS ) {
            // sender.currentItem = sendItem;
            deliveries[ this.currentJobs ] = new Mail( sendItem.getContent(), sender, receiver, packageNo );
            this.currentJobs = this.currentJobs + 1;
        }

        else if ( sendItem.getWeight() > 0.1 && this.currentJobs < MAX_JOBS ) {
            // sender.currentItem = sendItem;
            deliveries[ this.currentJobs ] = new Package( sendItem, sender, receiver, packageNo );
            this.currentJobs = this.currentJobs + 1;
        }

        else if ( this.currentJobs == MAX_JOBS ) {
            System.out.println( "This employee has reached the amount of maximum jobs: " + this.name );
            this.available = false;
        }
    }

    /**
     * This method prints the information of the delivered items and of the sender and receiver
     * customers. This method also clears the array of deliveries.
     */
    public void deliverPackages() {
        if ( this.currentJobs > 0 ) {
            System.out.println( "[Delivery List of the Employee: " + this.name + "]" );

            for ( int index = 0; index < currentJobs; index = index + 1 ) {
                System.out.println( deliveries[ index ].toString() );
                // deliveries[ index ].receiver.currentItem = deliveries[ index ].sender.currentItem;       /* I don't think it is a suitable design for this     */
                // deliveries[ index ].sender.currentItem = null;                                           /* Because in multiple deliveries, once you set the   */
                                                                                                            /* currentItem to null, all of the items will be null */
            }
        }

        this.currentJobs = 0;
        this.deliveries = new Delivery[ MAX_JOBS ];
        this.available = true;
    }

    /**
     * This method returns the string representation of the employee.
     * @return The string representation of the employee.
     */
    @Override
    public String toString() {
        return "Employee's name: " + this.name + ", Employee no: " + this.employeeNo + ", Salary: " + this.salary +
               ", Max jobs: " + this.MAX_JOBS + ", Current jobs: " + this.currentJobs + ", Availability: " +
               this.available + ", (x, y): " + "(" + this.posX + ", " + this.posY + ")";
    }
}
