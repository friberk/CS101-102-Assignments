import java.util.Scanner;

/**
 * SimpleCalculator
 * @author Berk Cakar // 22003021
 * @version 25.11.2020 -- syntax revised on 19.02.2021
*/
public class Lab05c
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Variables
        boolean quit;

        double result;
        double userChoiceValue;

        String userChoiceOperator;

        // Program Code
        System.out.println( "Welcome to \"SimpleCalc\"..." );

        quit = false;
        result = 0.0;

        do {
        System.out.println( "\n------------------" );
        System.out.println( "[ " + result + " ]" );
        System.out.println( "------------------" );
        System.out.println( "+,-,*,/ value" +
                            "\nClear" +
                            "\nQuit" );
        System.out.println( "------------------" );
        System.out.print( "Select: " );
        userChoiceOperator = scan.next();
        userChoiceValue = scan.nextDouble();

        if ( userChoiceOperator.charAt(0) == '+' ) {
            result = result + userChoiceValue;
        }

        else if ( userChoiceOperator.charAt(0) == '-' ) {
            result = result - userChoiceValue;
        }

        else if ( userChoiceOperator.charAt(0) == '*' ) {
            result = result * userChoiceValue;
        }

        else if ( userChoiceOperator.charAt(0) == '/' ) {
            result = result / userChoiceValue;
        }

        if ( userChoiceOperator.equalsIgnoreCase ( "Clear" ) || userChoiceOperator.equalsIgnoreCase ( "C" ) ) {
            result = 0.0;
        }

        if ( userChoiceOperator.equalsIgnoreCase ( "Quit" ) || userChoiceOperator.equalsIgnoreCase ( "q" ) ) {
            quit = true;
        }

        } while ( quit == false );


        System.out.println( "\nThanks for using \"SimpleCalc\", goodbye." );
        scan.close();
    }

}