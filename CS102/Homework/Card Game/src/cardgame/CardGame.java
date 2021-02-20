package cardgame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * CardGame class which maintains game initialization and basic backend of the game.
 * @author Berk Çakar
 * @author Borga Haktan Bilen
 * @version 19.02.2021
 */
public class CardGame {
    // Properties
    Cards             fullPack;
    ArrayList<Player> players;
    ScoreCard         scoreCard;
    Cards[]           cardsOnTable;
    int               roundNo;
    int               turnOfPlayer;

    // Constructors
    public CardGame( Player p1, Player p2, Player p3, Player p4 ) {
        players = new ArrayList<Player>();
        players.addAll( Arrays.asList( p1, p2, p3, p4 ) );

        fullPack = new Cards( true );
        fullPack.shuffle();

        scoreCard = new ScoreCard( 4 );

        cardsOnTable = new Cards[ 4 ];
        Arrays.fill( cardsOnTable, new Cards( false ) );

        roundNo = 1;
        turnOfPlayer = 0;

        for ( int index = 0; index < 52; index = index + 1 ) {
            if ( index % 4 == 0 ) {
                p1.add( fullPack.getTopCard() );
            }

            else if ( index % 4 == 1 ) {
                p2.add( fullPack.getTopCard() );
            }

            else if ( index % 4 == 2 ) {
                p3.add( fullPack.getTopCard() );
            }

            else if ( index % 4 == 3 ) {
                p4.add( fullPack.getTopCard() );
            }
        }
    }

    // Methods

    /**
     * This method makes the passed player to play the desired card.
     * @param p is the player who plays the card.
     * @param c is the card to be played.
     * @return {@code true} if the player is able to play the card, {@code false} if not.
     */
    public boolean playTurn( Player p, Card c ) {  
        if ( isGameOver() || !isTurnOf( p ) ) { 
            return false;
        }

        else if ( isTurnOf( p ) ) {
            cardsOnTable[ turnOfPlayer ].addTopCard( c );
            turnOfPlayer = turnOfPlayer + 1;

            if ( turnOfPlayer == 4 ) {
                updateScores();
           }
        }

        return true;
    }

    /**
     * This method checks if it is passed player's turn or not.
     * @param p is the player to check.
     * @return {@code true} if it is player's turn, otherwise {@code false}.
     */
    public boolean isTurnOf( Player p ) {
        if ( players.get( turnOfPlayer ).equals( p ) ) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * This method checks if game is over or not.
     * @return {@code true} if game is over, otherwise {@code false}.
     */
    public boolean isGameOver() {
        if ( roundNo > 13 ) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * This method gets the score of the passed player.
     * @param playerNumber is the number of the player whose score is to be gotten.
     * @return Score of the player.
     */
    public int getScore( int playerNumber ) {
        return scoreCard.getScore( playerNumber );
    }

    /**
     * This method gets the name of the passed player.
     * @param playerNumber is the number of the player whose name is to be gotten.
     * @return Name of the player.
     */
    public String getName( int playerNumber ) {
        return players.get( playerNumber - 1 ).getName();
    }

    /**
     * This method gets the current round number.
     * @return Current round number.
     */
    public int getRoundNo() {
        return roundNo;
    }

    /**
     * This method gets the number of the player whose turn it is for that round.
     * @return Number of the player whose turn it is for that round.
     */
    public int getTurnOfPlayerNo() {
        return turnOfPlayer + 1;
    }

    /**
     * This method returns the winners of the game as an array.
     * @return A Player[] array consisting of players who won the game.
     */
    public Player[] getWinners() {
        Player[] winners;

        winners = new Player[ scoreCard.getWinners().length ];
        
        for ( int index = 0; index < winners.length; index = index + 1 ) {
           winners[ index ] = players.get( ( scoreCard.getWinners() )[ index ] );
        }
        return winners;
    }

    /**
     * This method returns the score card.
     * @return String representation of the score card.
     */
    public String showScoreCard() {
        return scoreCard.toString();
    }

    /**
     * This is an additional method which helps to update scores in playTurn() method
     * @see {@link #playTurn( Player p, Card c )}
     */
    private void updateScores() {
        Card max;
        Card[] cards;

        cards = new Card[ 4 ];

        for ( int index = 0; index < 4; index = index + 1 ) {
            cards[ index ] = cardsOnTable[ index ].getTopCard();
        }

        max = cards[ 0 ];

        for ( int index = 0; index < 4; index = index + 1 ) {
            if ( cards[ index ].compareTo( max ) == 1 ) {
                max = cards[ index ]; 
            }
        }

        for ( int index = 0; index < 4; index = index + 1 ) {
            if ( cards[ index ].compareTo( max ) == 0) {
                scoreCard.update( index + 1, 1 );
                break;
            }
        }

        turnOfPlayer = 0;
        roundNo = roundNo + 1;
    }
}