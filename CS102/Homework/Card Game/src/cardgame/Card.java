package cardgame;

/**
 * Card class for handling single card objects.
 * @author Berk Çakar
 * @version 19.02.2021
 */
public class Card {
    // Constants
    final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs" };
    final String[] FACES = { "A", "2", "3", "4", "5",
                            "6", "7", "8", "9", "10",
                            "J", "Q", "K" };

    final int NO_OF_CARDS_IN_SUIT = 13;

    // Properties
    int  cardNo;

    // Constructors

    /**
     * This constructor initializes a single card with user defined face value and suit.
     * <p>
     * Available suits are (starting from 1 to 4): Hearts, Diamonds, Spades, Clubs
     * <p>
     * Available face values are (starting from 1 to 13): A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
     * @param faceValue of the card, represented as an integer (see the list above).
     * @param suit of the card, represented as an integer (see the list above).
     */
    public Card( int faceValue, int suit ) {
        cardNo = faceValue + suit * NO_OF_CARDS_IN_SUIT;
    }

    /**
     * This constructor initializes a single card with the given card number.
     * <p>
     * Card number is calculated as the following (use an integer to represent face value and suit): 
     * <p>
     * cardNo = faceValue + suit * NO_OF_CARDS_IN_SUIT
     * @param cardNumber of the card to be created.
     * @see {@link #Card( int faceValue, int suit )} for integer representations of face values
     * and suits.
     */
    public Card( int cardNumber) {
        cardNo = cardNumber;
    }

    // Methods

    /**
     * This method gets the integer representation for its face value.
     * <p>
     * Face values are represented as (starting from 1 to 13): 
     * A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
     * @return Card's face value as an integer.
     */
    public int getFaceValue() {
        return cardNo % NO_OF_CARDS_IN_SUIT;
    }

    /**
     * This method gets the integer representation for its suit.
     * <p>
     * Face values are represented as (starting from 1 to 4): Hearts, Diamonds, Spades, Clubs
     * @return Card's suit as an integer.
     */
    public int getSuit() {
        return cardNo / NO_OF_CARDS_IN_SUIT;
    }

    /**
     * This method returns the string representation of the card.
     * @return String representation of the card.
     */
    @Override
    public String toString() {
        return FACES[ getFaceValue() ] + " of " + SUITS[ getSuit() ];
    }

    /**
     * This method checks if the face number and suit (card number) of two cards are the same.
     * @param c card object to compare with.
     * @return {@code true} if two cards are equal to each other, if not {@code false}.
     */
    public boolean equals( Card c ) {
        if ( this.cardNo == c.cardNo ) {    /* getFaceValue() == c.getFaceValue() && getSuit() == c.getSuit() */
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * This method compares face values of two cards.
     * @param c card object to compare with.
     * @return {@code 0} if face values are equal, 
     * <p>
     * {@code 1} if this card object's face value is bigger than the compared card's, 
     * <p>
     * {@code -1} if this card object's face value is less than the compared card's.  
     */
    public int compareTo( Card c ) {
        if ( this.getFaceValue() == c.getFaceValue() ) {
            return 0;
        }

        else if ( this.getFaceValue() > c.getFaceValue() ) {
            return 1;
        }

        else { 
            return -1;
        }
    }
}