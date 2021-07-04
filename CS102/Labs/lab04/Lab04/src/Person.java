/**
 * Person abstract class for Lab04 assignment.
 */
public abstract class Person implements Locatable {
    // Properties
    String name;

    int posX;
    int posY;

    // Constructors

    /**
     * This constructor initializes the name of the person and his/her position.
     * @param name is the name of the person.
     * @param posX is the X position of the person.
     * @param posY is the Y position of the person.
     */
    public Person( String name, int posX, int posY ) {
        this.name = name;

        this.posX = posX;
        this.posY = posY;
    }

    /**
     * This constructor initializes the name of the person and his/her position to 0.
     * @param name is the name of the person.
     */
    public Person( String name ) {
        this.name = name;

        this.posX = 0;
        this.posY = 0;
    }

    // Methods

    /**
     * This method gets the name of the person.
     * @return Person's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * This method sets the name of the person.
     * @param name Person's name to be set.
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * This method gets the X position of the person.
     */
    @Override
    public int getX() {
        return this.posX;
    }

    /**
     * This method gets the Y position of the person.
     */
    @Override
    public int getY() {
        return this.posY;
    }

    /**
     * This method sets the X & Y position of the person.
     * @param posX is the X position to be set.
     * @param posY is the Y position to be set.
     */
    @Override
    public void setPos( int posX, int posY ) {
        this.posX = posX;
        this.posY = posY;
    }
}
