import java.util.Scanner;

/**
 * CompanyTester class for Lab04 assignment.
 * @author Berk Çakar
 * @version 07.03.2021
 */
public class CompanyTester {
    public static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        int selection;

        Company myCompany = new Company( 0, 0 );

        Item item1 = new Item( 0.05, "Letter" );
        Item item2 = new Item( 2, "Food" );
        Item item3 = new Item( 1, "Clothes" );
        Item item4 = new Item( 5, "Electronic" );
        Item item5 = new Item( 0.2, "Toys" );
        Item item6 = new Item( 3, "Text Book" );

        Customer linus = new Customer( "Linus Torvalds", 36, 42 );
        Customer mark = new Customer( "Mark Shuttleworth", 26, 45 );

        Employee tux = new Employee( 1337, "Tux the Penguin");
        Employee bear = new Employee( 88, "Polar Bear" );

        do {
            System.out.println( "*MENU*" );
            System.out.println( "1 - Add 2 Customers and 2 Employees to the company" );
            System.out.println( "2 - Customers send items to each other" );
            System.out.println( "3 - Make employees busy by giving them max amount of jobs" );
            System.out.println( "4 - Case where customer couldn't send the item because there isn't any employee available" );
            System.out.println( "5 - Terminate the contract of employee Tux the Penguin" );
            System.out.println( "0 - Exit" );

            System.out.print( "Selection: " );

            selection = scan.nextInt();

            if ( selection == 1 ) {
                myCompany.addEmployee( tux );
                myCompany.addEmployee( bear );
                myCompany.addCustomer( linus );
                myCompany.addCustomer( mark );

                System.out.println( myCompany.toString() );
            }

            else if( selection == 2 ) {
                linus.sendItem( myCompany, item1, mark );
                mark.sendItem( myCompany, item2, linus );

                myCompany.deliverPackages();
            }

            else if( selection == 3 ) {
                myCompany.createDeliverable( item1, linus, mark );
                myCompany.createDeliverable( item2, mark, linus );
                myCompany.createDeliverable( item3, linus, mark );
                myCompany.createDeliverable( item4, mark, linus );
                myCompany.createDeliverable( item5, linus, mark );
                myCompany.createDeliverable( item6, mark, linus );
                myCompany.createDeliverable( item1, linus, mark );
                myCompany.createDeliverable( item2, mark, linus );
                myCompany.createDeliverable( item3, linus, mark );
                myCompany.createDeliverable( item4, mark, linus );
                myCompany.createDeliverable( item5, linus, mark );
                myCompany.createDeliverable( item6, mark, linus );

                myCompany.deliverPackages();
            }

            else if( selection == 4 ) {
                myCompany.createDeliverable( item1, linus, mark );
                myCompany.createDeliverable( item2, mark, linus );
                myCompany.createDeliverable( item3, linus, mark );
                myCompany.createDeliverable( item4, mark, linus );
                myCompany.createDeliverable( item5, linus, mark );
                myCompany.createDeliverable( item6, mark, linus );
                myCompany.createDeliverable( item1, linus, mark );
                myCompany.createDeliverable( item2, mark, linus );
                myCompany.createDeliverable( item3, linus, mark );
                myCompany.createDeliverable( item4, mark, linus );
                myCompany.createDeliverable( item5, linus, mark );
                myCompany.createDeliverable( item6, mark, linus );
                myCompany.createDeliverable( item1, linus, mark );
                myCompany.createDeliverable( item2, mark, linus );

                myCompany.deliverPackages();
            }

            else if( selection == 5 ) {
                myCompany.terminateContract( 0 );

                myCompany.toString();
            }

        } while( selection != 0 );

        scan.close();
    }
}
