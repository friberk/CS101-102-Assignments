import java.util.Scanner;
import cardgame.*;

/**
 * Test Class to test the methods of other classes.
 * @author Berk Çakar
 * @author Borga Haktan Bilen
 * @version 20.02.2021
 */
public class CardGameTest {
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        System.out.println( "Start of CardGameTest\n" );

        // CONSTANTS

        // VARIABLES
        Card       c;
        Card       c1;
        Card       c2;
        Cards      cards;
        ScoreCard  scores;
        Player     p;
        Player     p1;
        Player     p2;
        Player     p3;
        Player     p4;
        CardGame   game;

        // PROGRAM CODE

        // test Card class
        c = new Card( 0 );
        c1 = new Card( 23 );
        c2 = new Card( 12 );
        System.out.println( c );
        System.out.println( c1.equals( c2 ) );
        System.out.println( c2.compareTo( c1 ) );

        // test Cards class
        cards = new Cards( true );
        cards.addTopCard( c );
        //cards.testOnlyPrint();  // remove method after testing!

        // test ScoreCard class
        scores = new ScoreCard( 4 );
        scores.update( 3, 1 );
        scores.update( 1, 2 );
        System.out.println( "\n" + scores );

        // test Player class
        p = new Player( "Linus Torvalds" );
        p1 = new Player( "Ali" );
        p2 = new Player( "Mehmet" );
        p3 = new Player( "Can" );
        p4 = new Player( "Lewis" );
        System.out.println( p.getName() );
        p.add( c );
        System.out.println( p.playCard().getFaceValue() );

        // test CardGame class
        game = new CardGame( p1, p2, p3, p4 );
        System.out.println( play( p1, game ) );
        System.out.println( play( p2, game ) );
        System.out.println( play( p3, game ) );
        System.out.println( play( p4, game ) );
        System.out.println( game.getTurnOfPlayerNo() );
        System.out.println( game.getName( 2 ) );
        System.out.println( game.getScore( 2 ) );
        System.out.println( game.getRoundNo() );
        System.out.println( game.isGameOver() );
        System.out.println( game.isTurnOf( p1 ) );
        System.out.println( game.showScoreCard() );

       /* 
        * Once you have all the bits working, complete the MyCardGame program
        * that provides a menu allowing any of the players to play their card,
        * an option to see the score card, and one to quit the game at any time.
        * When the game is over it should print out the winners.
        */

        System.out.println( "\nEnd of CardGameTest\n" );
        scan.close();
    }

    /**
     * Plays the top card of the player.
     * Completely same method with the one in the main Game class.
     * @param p is the player who will be play the turn.
     * @param game is the current CardGame object.
     * @return {@code true} if the game accepted the card and played the turn,
     * {@code false} if the card is not accepted and turn is not played.
     */
    private static boolean play( Player p, CardGame game ) {
        Card       c;
        boolean    accepted;

        c = p.playCard();

        if ( game.playTurn( p, c ) ) {
            accepted = true;
        }

        else {
            p.add( c );
            accepted = false;
        }

        return accepted;
    }
}
