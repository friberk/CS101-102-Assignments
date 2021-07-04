import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hangman game for CS102 HW1.
 * @author Berk Çakar (22003021)
 * @version 13.02.2021
 */
public class HangmanMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        // Variables
        Hangman hangmanGame;
        char letter;

        // Initialize variables
        hangmanGame = new Hangman();

        System.out.println( "Welcome to hangman game! Good luck!" );

        while ( !hangmanGame.isGameOver() ) {
            // I used .replace() method to not count the whitespaces in knownSoFar.
            System.out.println( "\nYou are going to guess this " + hangmanGame.getKnownSoFar().replace( " ", "" ).length() + 
                                " letter word: " + hangmanGame.getKnownSoFar() );
            System.out.println( "You have " + ( hangmanGame.getMaxAllowedIncorrectTries() - hangmanGame.getNumberOfIncorrectTries() ) + 
                                " attempts left." );
            System.out.println( "The letters you tried are: " + hangmanGame.getUsedLetters() );
            
            // Guess a letter
            System.out.print("Guess a letter: ");
            letter = scan.next().toLowerCase().charAt( 0 );

            // If the given letter does not exist in the string print an error message accoordingly.
            if ( hangmanGame.tryThis( letter ) == 0 ) {
                System.out.println("\nThis letter does not exist in the word! Try again.");
            }

            // If it exists, print a success message accoordingly
            else if ( hangmanGame.tryThis( letter ) != -1 && hangmanGame.tryThis( letter ) != -2 && hangmanGame.tryThis( letter ) != -3 ) {
                System.out.println("\nYou guessed it right! Well done.");
            }
        }   

        // After a game ends, print whether the player won or lost
        if ( hangmanGame.hasLost() ) {
            System.out.println( "\nYou have lost. Better luck next time :)" );
            System.out.println( "The word was: " + hangmanGame.secretWord );
        }
        
        else {
            System.out.println( "\nYou have won. Well played." );
            System.out.println( "The word was: " + hangmanGame.secretWord );
        }

        scan.close();
    }
}
