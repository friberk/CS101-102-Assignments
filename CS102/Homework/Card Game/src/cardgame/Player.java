package cardgame;

/**
 * Simple card game player with name and hand of cards.
 * @author Borga Haktan Bilen
 * @version 19.02.2021
 */
public class Player {
    // Properties
    String name;
    Cards hand;

    // Constructors

    /**
     * Public constructor for the Player class,
     * that creates a player with empty hand and sets player's name.
     * @param name is the name of the player.
     */
    public Player( String name ) {
        hand = new Cards( false );
        this.name = name;
    }

    // Methods

    /**
     * This method gets the name of the player.
     * @return Name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * This method adds a card to the player's hand.
     * @param theCard is the card that will be added.
     */
    public void add( Card theCard ) {
        hand.addTopCard( theCard );
    }

    /**
     * This method gets the player's top card if it is available, 
     * removes it from player's hand.
     * @return The top card in player's hand.
     */
    public Card playCard() {
        return hand.getTopCard();
    }
}