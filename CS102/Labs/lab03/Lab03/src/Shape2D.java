/**
 * Shape2D abstract class for Lab03 assignment.
 * @author Berk Çakar
 * @version 26.02.2021
 */
public abstract class Shape2D {
    // Properties
    int x;
	int y;

    // Constructors

    /**
     * Default and only constructor for Shape2D objects take object's center
     * x and y coordinates.
     * @param x is the x coordinate of the object's center.
     * @param y is the y coordinate of the object's center.
     */
    public Shape2D( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    // Methods

    /**
     * Abstract method for calculating shape perimeters.
     */
    public abstract double calculatePerimeter();

    /**
     * Abstract method for calculating shape areas.
     */
    public abstract double calculateArea();

    /**
     * This method calculates the distance between two shape objects from one's center
     * to other one's center.
     * @param anyShape is the other shape to calculate the distance between.
     * @return Distance between two shape objects. {@code -1} If anyShape parameter
     * is not a Shape2D instance
     */
    public double calculateDistance( Object anyShape ) {
        if ( anyShape instanceof Shape2D ) {
            Shape2D otherShape = ( Shape2D ) anyShape;
            return Math.sqrt( Math.pow( ( otherShape.y - this.y ), 2 ) + Math.pow( ( otherShape.x - this.x ), 2 ) );
        }

        else {
            return -1;
        }
    }

    /**
     * This method returns the String representation of the Shape2D object.
     * @return The String representation of the Shape2D object.
     */
    @Override
    public String toString() {
        return "[class Shape2D]" + "x = " + this.x + ", " + "y = " + this.y;
    }

    /**
     * This method checks whether two Shape2D objects are equal or not.
     * @return {@code false} if the passed object is null or from a different class,
     * {@code true} if compared Shape2D objects are equal.
     */
    @Override
    public boolean equals( Object anyShape ) {
        if ( anyShape == null ) {
            return false;
        }

        else if ( this.getClass() != anyShape.getClass() ) {
            return false;
        }

        else {
            Shape2D otherShape = ( Shape2D ) anyShape;
            return otherShape.x == this.x && otherShape.y == this.y;
        }
    }
}