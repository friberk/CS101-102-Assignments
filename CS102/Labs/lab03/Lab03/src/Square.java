/**
 * Square class for Lab03 assignment.
 * @author Berk Çakar
 * @version 26.02.2021
 */
public class Square extends Shape2D {

    // Properties
    double sideLength;

    // Constructors

    /**
     * Default and only constructor for Square objects take object's center
     * x and y coordinates and its side length.
     * @param x is the x coordinate of the square's center.
     * @param y is the y coordinate of the square's center.
     * @param sideLength is the height of the square.
     */
    public Square( int x, int y, double sideLength ) {
        super( x, y );
        this.sideLength = sideLength;
    }

    // Methods

    /**
     * This method calculates perimeter of the Square.
     * @return Perimeter of the Square.
     */
    public double calculatePerimeter() {
        return 4 * ( this.sideLength );
    }

    /**
     * This method calculates area of the Square.
     * @return Area of the Square.
     */
    public double calculateArea() {
        return Math.pow( this.sideLength, 2 );
    }

    /**
     * This method returns the String representation of the Square object.
     * @return The String representation of the Square object.
     */
    @Override
    public String toString() {
        return "[class Square]" + "x = " + this.x + ", " + "y = " + this.y +
               " and side = " + this.sideLength;
    }

    /**
     * This method checks whether two Square objects are equal or not.
     * @return {@code false} if the passed object is null or from a different class,
     * {@code true} if compared Square objects are equal.
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
            Square otherSquare = ( Square ) anyShape;
            return otherSquare.x == this.x && otherSquare.y == this.y &&
                   otherSquare.sideLength == this.sideLength;
        }
    }
}