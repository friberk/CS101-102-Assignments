import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * Hangman class for CS102 HW1.
 * 
 * @author Berk Çakar (22003021)
 * @version 13.02.2021
 */
public class Hangman {

    // Constants
    final String[] wordList = { "rock", "meat", "coordinated", "snobbish", "satisfy", 
                               "sleepy", "weigh", "cabbage", "birds", "afraid", 
                               "island", "left", "rainy", "flower", "outrageous", 
                               "river", "carpenter", "telling", "decide", "bunny hop" };

    // Properties
    StringBuffer secretWord;
    StringBuffer allLetters;
    StringBuffer usedLetters;
    StringBuffer knownSoFar;

    int numberOfIncorrectTries;
    int maxAllowedIncorrectTries;

    /*
     * Apart from properties which are on HW assignment, I added this one in order
     * to check if user won the game.
     */
    int knownLetterCounter;

    // Constructors

    /**
     * Default constructor to initialize Hangman class.
     * @throws FileNotFoundException in the case of user might not have a words.txt file.
     */
    public Hangman() throws FileNotFoundException {
        secretWord = new StringBuffer( chooseSecretWordFromFile() );
        allLetters = new StringBuffer("abcdefghijklmnopqrstuwxyz");
        usedLetters = new StringBuffer();
        numberOfIncorrectTries = 0;
        knownLetterCounter = 0;

        /*
         * It can be a good idea to get the maximum number of incorrect tries from the
         * parameter (as input). However, in the prompt the defualt was defined as 6.
         * Thus, it was initialized as 6.
         */
        maxAllowedIncorrectTries = 6;

        // knownSoFar’s capacity was initialized according to the secret word’s.
        knownSoFar = new StringBuffer(secretWord.capacity());

        // Covering the secret words with "*" characters.
        for (int index = 0; index < secretWord.length(); index = index + 1) {
            if (secretWord.charAt(index) == ' ') {
                knownSoFar.append(" ");
            }

            else {
                knownSoFar.append("*");
            }
        }
    }

    // Methods

    /**
     * This method selects a random word from wordList.
     * @return randomly chosen word.
     */
    public String chooseSecretWord() {
        Random pickWord = new Random();
        return wordList[pickWord.nextInt(wordList.length)];
    }

    /**
     * This method selects a random word from the provided file.
     * @return a random word which is selected among the other words in the specified file.
     * @throws FileNotFoundException in the case of user might not have a words.txt file.
     */
    public String chooseSecretWordFromFile() throws FileNotFoundException {
        File wordList = new File( "src/words.txt" );
        Scanner fileScan = new Scanner( wordList );
        int lineCount = 0;

        while ( fileScan.hasNextLine() ) {
            fileScan.nextLine();
            lineCount = lineCount + 1;
        }

        // Resetting the scanner.
        fileScan = new Scanner( wordList );

        Random pickWord = new Random();
        
        for ( int index = 0; index < pickWord.nextInt( lineCount ); index = index + 1 ) {
            fileScan.nextLine();
        }

        return fileScan.nextLine();
    }

    /**
     * This method is a getter for allLetters property.
     * @return allLetters in String form.
     */
    public String getAllLetters() {
        return allLetters.toString();
    }

    /**
     * This method is a getter for usedLetters property.
     * @return usedLetters in String form.
     */
    public String getUsedLetters() {
        return usedLetters.toString();
    }

    /**
     * This method is a getter for numberOfIncorrectTries property.
     * @return int value of numberOfIncorrectTries.
     */
    public int getNumberOfIncorrectTries() {
        return numberOfIncorrectTries;
    }

    /**
     * This method is a getter for maxAllowedIncorrectTries property.
     * @return int value of maxAllowedIncorrectTries.
     */
    public int getMaxAllowedIncorrectTries() {
        return maxAllowedIncorrectTries;
    }
    
    /**
     * This method is a getter for knownSoFar property.
     * @return knownSoFar in String form.
     */
    public String getKnownSoFar() {
		return knownSoFar.toString();
	}

    /**
     * Checks if game is over, or not.
     * @return true if game is over, otherwise return false.
     */
    public boolean isGameOver() {
        if ( numberOfIncorrectTries == maxAllowedIncorrectTries || knownLetterCounter == secretWord.toString().replace( " ", "" ).length() ) {
            return true;
        }
        
        else {
            return false;
        }
    }

    /**
     * Checks if user has lost the game, or not.
     * @return true if user has lost the game, otherwise return false.
     */
    public boolean hasLost() {
        if ( numberOfIncorrectTries == maxAllowedIncorrectTries && !( knownLetterCounter == secretWord.toString().replace( " ", "" ).length() ) ) {
            return true;
        }

        else {
            return false;
        }
    }
    
    /**
     * This method takes a letter then counts how many times it occurs in the given word.
     * @param letter
     * @return int value of the corresponding letter's appearance count in secretWord. If user passes
     * an invalid character to this method return -1. If the same letter is passed
     * more than once return -2. If the game is over return -3.
     */
    public int tryThis( char letter ) {
        boolean letterHasFound;
        
        if ( allLetters.indexOf( Character.toString( letter ) ) == -1 ) {
            return -1;
        }

        else if ( usedLetters.indexOf( Character.toString( letter ) ) != -1 ) {
            return -2;
        }

        else if ( isGameOver() == true || hasLost() == true ) {
            return -3;
        }

        else {
            letterHasFound = false;

            usedLetters.append( letter );
            
            for ( int index = 0; index < secretWord.length(); index = index + 1 ) {
                if ( secretWord.charAt( index ) == letter ) {
                        knownSoFar.setCharAt( index, secretWord.charAt( index ) ); 
                        letterHasFound = true;
                        knownLetterCounter = knownLetterCounter + 1;
                }
            }
        }

        if ( letterHasFound == false ) {
            numberOfIncorrectTries = numberOfIncorrectTries + 1;
        }
        
        return knownLetterCounter;
    }
}
