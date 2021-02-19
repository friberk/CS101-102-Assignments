import java.util.Scanner;

/**
 * Value of Pi finder 
 * @author Berk Cakar // 22003021
 * @version 24.11.2020 -- syntax revised on 19.02.2021
*/ 
public class Lab05d
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final int SERIES_NUMERATOR = 4;
        
        // Variables
        boolean closeEnough;

        double errorMargin;
        double computedPi;
        
        int seriesDenominator;
        int numberOfTerms;
        int termCounter;
        int i;

        String userChoice;
        
        // Program Code
        System.out.println( "\nWelcome to Pi Calculator! " + "The real value of Pi is " + Math.PI );
        System.out.println( "\nIf you want to use a math series to compute pi " + "please type \"x\" " );
        System.out.println( "\nIf you want to compute the series to a specified accuracy " + "please type \"y\" \n" );

        userChoice = scan.next();
        
        // Algorithm for "x" option.
        if ( userChoice.equalsIgnoreCase ( "x" ) ) { 
            System.out.print( "\nPlease enter the number of terms of the series to compute Pi: " );
            numberOfTerms = scan.nextInt();

            seriesDenominator = 1;
            computedPi = 0;

            for ( i = 1; i <= numberOfTerms; i = i + 1 ) {
                /*
                Checking if denominator value fits the i value. For example for the 1st term
                it would be 1, for 2nd term 3, 3rd -> 5... (2n-1)
                */
                for ( ; seriesDenominator == ( 2 * i ) - 1; seriesDenominator = seriesDenominator + 2 ) {
                    if ( i % 2 == 0 ) {
                        computedPi = computedPi - ( SERIES_NUMERATOR / ( double ) seriesDenominator );
                    }

                    else {
                        computedPi = computedPi + ( SERIES_NUMERATOR / ( double ) seriesDenominator );
                    }  

                }
            }
            
            System.out.println( "For " + numberOfTerms + " terms " + "Result of the series is: " + computedPi );
        }

        // Algorithhm for "y" option.
        if ( userChoice.equalsIgnoreCase ( "y" ) ) { 
            System.out.print( "\nPlease enter the error margin when compared to actual pi value: " );
            errorMargin = scan.nextDouble();

            seriesDenominator = 1;
            computedPi = 0;
            termCounter = 0;

            closeEnough = false;

            for ( i = 1; closeEnough == false && i <= Integer.MAX_VALUE; i = i + 1 ) {
                /*
                Checking if denominator value fits the i value. For example for the 1st term
                it would be 1, for 2nd term 3, 3rd -> 5... (2n-1)
                */
                for ( ; seriesDenominator == ( 2 * i ) - 1; seriesDenominator = seriesDenominator + 2 ) {
                    if ( i % 2 == 0 ) {
                        computedPi = computedPi - ( SERIES_NUMERATOR / ( double ) seriesDenominator );
                        termCounter = termCounter + 1;
                    }

                    else {
                        computedPi = computedPi + ( SERIES_NUMERATOR / ( double ) seriesDenominator );
                        termCounter = termCounter + 1;
                    }  

                    if ( Math.abs( Math.PI - computedPi ) <= errorMargin ) {
                        closeEnough = true;
                    }
                }
            }
            
            System.out.println( "For the term " + termCounter + ", error margin is less than " + errorMargin );
            System.out.println( "|" + "Real pi value" + " - " + "Computed pi value" + "|" + " <= " + errorMargin );
            System.out.println( "|" + Math.PI + " - " + computedPi + "|" + " <= " + errorMargin );
            System.out.println( Math.abs( Math.PI - computedPi ) + " <= " + errorMargin );
        }
        
        scan.close();
    }
}
