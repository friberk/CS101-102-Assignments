package cardgame;

/**
 * Maintains a collection of zero or more playing cards.
 * Provides facilities to create a full pack of 52 cards and to shuffle the cards.
 * @author Borga Haktan Bilen
 * @author Berk Çakar
 * @version 19.02.2021 
*/
public class Cards {
    // Properties
    final int NO_OF_CARDS_IN_FULL_PACK = 52;

    int    cardinality;  // number of cards currently in collection
    Card[] cards;

    // Constructors

    /**
     * Public constructor that creates a full pack of cards if {@code true} passed,
     * otherwise creates empty pack.
     * @param fullPack {@code true} to create a full pack of card, 
     * {@code false} to create an empty pack.
     */
    public Cards( boolean fullPack ) {
        cards = new Card[ NO_OF_CARDS_IN_FULL_PACK ];

        if ( fullPack ) {
            createFullPackOfCards();
            cardinality = NO_OF_CARDS_IN_FULL_PACK;
        }

        else {
            cardinality = 0;
        }
    }

    // Methods

    /**
     * This method gets the top card from the card collection.
     * @return Top card's object or {@code null} if the collection is empty.
     */
    public Card getTopCard() {
        Card temp;

        if ( cardinality <= 0 ) {
            return null;
        }

        else {
            cardinality = cardinality - 1;
            temp = cards[ cardinality ];
            cards[ cardinality ] = null;
            return temp;
        }
    }

    /**
     * This method adds a card to the top of the card collection if there is space in the collection.
     * @param c is the card object that will be added.
     * @return {@code true} if the card is added, {@code false} if it fails to add.
     */
    public boolean addTopCard( Card c ) {
        if ( cardinality < cards.length ) {
            cards[ cardinality ] = c;
            cardinality = cardinality + 1;
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * This method creates full pack of card objects and adds them to the card collection
     */
    private void createFullPackOfCards() {
        for ( int index = 0; index < NO_OF_CARDS_IN_FULL_PACK; index = index + 1 ) {
            addTopCard( new Card( index ) );
        }
    }

    /**
     * This method randomizes the order of elements of the card collection.
     */
    public void shuffle() {
        final int NUMBER_OF_SHUFFLES = 10;

        int randomIndex;
        Card temporary;

        for ( int shuffleCounter = 0; shuffleCounter < NUMBER_OF_SHUFFLES; shuffleCounter = shuffleCounter + 1 ) {
            for ( int index = 0; index < cardinality; index = index + 1 ) {
                randomIndex = ( int )( Math.random() * cardinality );
                temporary = cards[ randomIndex ];
                cards[ randomIndex ] = cards[ index ];
                cards[ index ] = temporary;
            }
        }
    }
}