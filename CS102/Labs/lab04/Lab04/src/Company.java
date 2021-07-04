import java.util.ArrayList;
import java.util.Arrays;

/**
 * Company class for Lab04 assignment.
 */
public class Company implements Locatable {
    // Properties
    final int EMPLOYEE_CAPACITY = 15;

    Employee[] employees;
    ArrayList<Customer> customers;
    int numOfEmployees;
    int employeeNo;
    int packageNo;
    int posX;
    int posY;

    // Constructors

    /**
     * This constructor sets the position of the company and initializes instance variables.
     * @param posX is the X position of the company.
     * @param posY is the Y position of the company.
     */
    public Company( int posX, int posY ) {
        this.posX = posX;
        this.posY = posY;

        this.employees = new Employee[ EMPLOYEE_CAPACITY ];
        this.customers = new ArrayList<Customer>();
        this.numOfEmployees = 0;
        this.employeeNo = 0;
        this.packageNo = 0;
    }

    // Methods

    /**
     * This method gets the X position of the company.
     */
    @Override
    public int getX() {
        return this.posX;
    }

    /**
     * This method gets the Y position of the company.
     */
    @Override
    public int getY() {
        return this.posY;
    }

    /**
     * This method sets the X & Y position of the person.
     * @param posX is the X position to be set.
     * @param posY is the Y position to be set.
     */
    @Override
    public void setPos( int posX, int posY ) {
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * This method adds an employee to the company.
     * @param candidate is the employee to be added.
     * @return {@code true} if the employee is successfully added, {@code false} otherwise.
     */
    public boolean addEmployee( Employee candidate ) {
        if ( this.numOfEmployees < 15 ) {
            candidate.employeeNo = this.employeeNo;
            this.employeeNo = this.employeeNo + 1;

            employees[ this.numOfEmployees ] = candidate;
            this.numOfEmployees = this.numOfEmployees + 1;

            return true;
        }

        else {
            return false;
        }
    }

    /**
     * This method adds a customer to the company.
     * @param customer is the customer to be added.
     */
    public void addCustomer( Customer customer ) {
        this.customers.add( customer );
    }

    /**
     * This method terminates the contract of the employee at the given index.
     * @param employeeIndex is the index of the employee (index should be the same as employee number).
     * @return {@code true} if the employee at the given index is deleted, otherwise {@code false}.
     */
    public boolean terminateContract( int employeeIndex ) {
        if ( employees[ employeeIndex ] != null ) {
            employees[ employeeIndex ] = null;
            System.out.println( "Contract terminated." );
            return true;
        }

        else {
            System.out.println( "No employee at the given index!" );
            return false;
        }
    }

    /**
     * This method creates a deliverable object from the item.
     * @param sendItem is the item to be sent.
     * @param sender is the sender of the item.
     * @param receiver is the receiver of the item.
     * @return {@code true} if an employee is available to deliver the item, otherwise {@code false}.
     */
    public boolean createDeliverable( Item sendItem, Customer sender, Customer receiver ) {
        int index = 0;

        for( index = 0; index < numOfEmployees; index = index + 1 ) {
            if( employees[ index ].available == true ) {
                break;
            }
        }

        if ( index == numOfEmployees ) {
            System.out.println( "There is not any available employee to deliver this package: " +
                                sendItem.toString() );
            return false;
        }

        else if( employees[ index ].available == true ) {
            if ( employees[ index ].currentJobs == 0 && this.packageNo != 0 ) {
                this.packageNo = this.packageNo - 1;
            }

            employees[ index ].addJob( sendItem, sender, receiver, this.packageNo );

            this.packageNo = this.packageNo + 1;
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * This method delivers all the packages via employees and prints the delivery information.
     */
    public void deliverPackages() {
        for ( int index = 0; index < numOfEmployees; index = index + 1 ) {
            employees[ index ].deliverPackages();
        }
    }

    /**
     * This method returns the string representation of the company.
     * @return The string representation of the company.
     */
    @Override
    public String toString() {
        return "Company's employees: " + Arrays.toString( Arrays.copyOfRange( employees, 0, numOfEmployees ) )
               + "Company's customers: " + customers.toString();
    }
}
