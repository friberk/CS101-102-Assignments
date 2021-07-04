import java.util.ArrayList;

/**
 * Recursion class for Lab06 assignment.
 * @author Berk Çakar
 * @version 14.04.2021
 */
public class Recursion {

    /**
     * This method recursively deletes "r" letters from the passed word.
     * @param word is the word to be processed.
     * @return The passed word without "r" letters.
     */
    public static String removeR( String word ) {
        if ( word.length() == 0 ) {
            return "";
        }

        else if ( word.charAt( 0 ) == 'r' ) {
            return removeR( word.substring( 1 ) );
        }

        return word.charAt( 0 ) + removeR( word.substring( 1 ) );
    }

    /**
     * This method recursively converts a decimal to its corresponding hex value.
     * @param number is the decimal number to be converted.
     * @return Hex value of the passed decimal.
     */
    public static String decToHex( int number ) {
        final String CHAR_TO_HEX[] = { "0", "1", "2", "3", "4", "5","6","7","8","9","A","B","C","D","E","F" };

        int remainder;
        String recursiveHex;
        String decToHex = "";

       if ( number > 0 ) {
            recursiveHex = decToHex( number / 16 );
            remainder = number % 16;
            decToHex = recursiveHex + CHAR_TO_HEX[ remainder ];
        }

       return decToHex;
    }

    /**
    * This method checks if the strings in the array are in lexicographic order or not.
    * @param list is the ArrayList of strings.
    * @return {@code true} if the strings in the array are in lexicographic
    * (effectively alphabetic) order, and {@code false} otherwise.
    */
    public static boolean lexicographic( ArrayList<String> list ) {
        if ( list.size() < 2 ) {
           return true;
        }

        else if ( ( list.get( list.size() - 2 ).compareTo( list.get( list.size() - 1 ) ) ) > 0 ) {
           return false;
        }

        return lexicographic( new ArrayList<String>( list.subList( 0, list.size() - 1 ) ) );
    }

    /**
     * This method recursively reverses a string.
     * @param word is the string to be reversed.
     * @return Reversed string.
     */
    public static String reverseString( String word ) {
        if ( word.length() == 0 ) {
            return word;
        }

        return reverseString( word.substring( 1 ) ) + word.charAt( 0 );
    }

   /**
    * This method enumerates and prints all n-digit even numbers in which each digit of the number,
    * from its most-significant to least-significant digits, is greater than the previous one.
    * @param digitCount is the digit count for both minimum and maximum values of the interval.
    * @param min is the minimum value of the desired interval.
    * @param max is the maximum value of the desired interval.
    * @return An enumerated set of even numbers.
    * @apiNote {@code digitCount} have to be passed correctly by the user and {@code min} and {@code max}
    * have to have the same digit count, otherwise this method will not be able to work as expected.
    * @apiNote ie. while {@code evenEnumerator( 3, 100, 999 ) } is going to work well, {@code evenEnumerator( 2, 1000, 499 ) }
    * is not.
    */
    public static int evenEnumerator( int digitCount, int min, int max ) {
        if ( max == min ) {
            return 0; // have to return this to avoid exception... needs to be fixed.
        }

        else if ( min % 2 == 0) {
            evenEnumeratorHelper( digitCount, min );
        }

        return evenEnumerator( digitCount, min + 1, max );
    }

    /**
    * This is a helper method for {@link #evenEnumerator} which ensures that the digits increase from left to right,
    * and prints out the appropriate numbers.
    * @param digitCount is the digit count for the passed number.
    * @param number is the number to be checked.
    */
    public static void evenEnumeratorHelper( int digitCount, int number ) {
        if ( digitCount == 1 ) {
            System.out.print( number + ", " );
        }

        else if ( Character.toString( Integer.toString( number ).charAt( digitCount - 2 ) ).compareTo
                ( Character.toString( Integer.toString( number ).charAt( digitCount - 1 ) ) ) < 0 ) {

            evenEnumeratorHelper( digitCount - 1, number );
       }
    }

    public static void main( String[] args ) {
        final String MY_NAME = "Berk Çakar";
        ArrayList<String> list;

        // program code
        System.out.println( removeR( MY_NAME ) );
        System.out.println( "\n" + decToHex( 9 ) );

        list = new ArrayList<String>();

        list.add( "Aa" );
        list.add( "Bb" );
        list.add( "Cc" );
        list.add( "Dd" );
        list.add( "Ee" );
        list.add( "Gg" );
        list.add( "Tt" );

        System.out.println( "\n" + list );
        System.out.println("lexicographic: " + lexicographic( list ) );

        System.out.println( "\n" + reverseString( MY_NAME ) + "\n" );

        System.out.println( evenEnumerator( 3, 100, 999 ) );
    }
}
