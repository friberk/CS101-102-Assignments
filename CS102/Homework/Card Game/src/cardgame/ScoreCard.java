package cardgame;
import java.util.Arrays;

/**
 * Maintains one integer score per player, for any number of players.
 * @author Borga Haktan Bilen
 * @author Berk Çakar
 * @version 19.02.2021
*/
public class ScoreCard {
    // Properties
    int[] scores;

    // Constructors

    /**
     * Public constructor for the ScoreCard class.
     * <p>
     * Initializes score cards by entering 0 for every score.
     * @param noOfPlayers is the number of players who play the game.
     */
    public ScoreCard( int noOfPlayers ) {
        scores = new int[ noOfPlayers ];

        // init all scores to zero
        for ( int index = 0; index < scores.length; index = index + 1 ) {
            scores[ index ] = 0;
        }
    }

    // Methods

    /**
     * This method gets the score of a player.
     * @param playerNo is the number of the player whom score belongs to.
     * @return Score of the player.
     */
    public int getScore( int playerNo ) {
        return scores[ playerNo - 1 ];
    }

    /**
     * This method updates the score cards by adding a specified amount of point.
     * @param playerNo is the number of the player.
     * @param amount is the point that will be added to the winner of that round.
     */
    public void update( int playerNo, int amount ) {
        scores[ playerNo - 1 ] = scores[ playerNo - 1 ] + amount;
    }

    /**
     * This method gets the winners.
     * @return Array of player numbers who have the highest scores.
     */
    public int[] getWinners() {
        int playerNoOfWinners[];
        int maxScore;
        int indexOfWinners;

        playerNoOfWinners = new int[ scores.length ];
        maxScore = 0;
        indexOfWinners = 0;

        for ( int index = 0; index < scores.length; index = index + 1 ) {
            if ( scores[ index ] > maxScore ) {
                maxScore = scores[ index ];
            }
        }

        // Check every players score to find if the player is a winner or not
        for ( int index = 0; index < scores.length; index = index + 1 ) {
            if ( scores[index] == maxScore ) {
                playerNoOfWinners[ indexOfWinners ] = index;
                indexOfWinners = indexOfWinners + 1;
            }
        }

        // Resize the array in order to prevent misprints
        return Arrays.copyOf( playerNoOfWinners, indexOfWinners );
    }

    /**
     * This method returns the string representation of the score card.
     * @return String representation of the score card.
     */
    @Override
    public String toString() {
        String s;
        s = "\n"
            + "_____________\n"
            + "\nPlayer\tScore\n"
            + "_____________\n";

        for ( int playerNo = 0; playerNo < scores.length; playerNo = playerNo + 1 ) {
            s = s + ( playerNo + 1 ) + "\t" + scores[ playerNo ] + "\n";
        }

        s = s + "_____________\n";

        return s;
    }
}