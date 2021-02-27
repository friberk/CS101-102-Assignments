/**
 * Rectangle class for Lab03 assignment.
 * @author Berk Çakar
 * @version 26.02.2021
 */
public class Rectangle extends Shape2D {

    // Properties
    double height, width;

    // Constructors

    /**
     * Default and only constructor for Rectangle objects take object's center
     * x and y coordinates and its height and width.
     * @param x is the x coordinate of the rectangle's center.
     * @param y is the y coordinate of the rectangle's center.
     * @param height is the height of the rectangle.
     * @param width is the width of the rectangle.
     */
    public Rectangle( int x, int y, double height, double width ) {
        super( x, y );
        this.height = height;
        this.width = width;
    }

    // Methods

    /**
     * This method calculates perimeter of the Rectangle.
     * @return Perimeter of the Rectangle.
     */
    public double calculatePerimeter() {
        return 2 * ( this.height + this.width );
    }

    /**
     * This method calculates area of the Rectangle.
     * @return Area of the Rectangle.
     */
    public double calculateArea() {
        return this.height * this.width;
    }

    /**
     * This method returns the String representation of the Rectangle object.
     * @return The String representation of the Rectangle object.
     */
    @Override
    public String toString() {
        return "[class Rectangle]" + "x = " + this.x + ", " + "y = " + this.y +
               " height = " + this.height + " and width = " + this.width;
    }

    /**
     * This method checks whether two Rectangle objects are equal or not.
     * @return {@code false} if the passed object is null or from a different class,
     * {@code true} if compared Rectangle objects are equal.
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
            Rectangle otherRectangle = ( Rectangle ) anyShape;
            return otherRectangle.x == this.x && otherRectangle.y == this.y &&
                otherRectangle.height == this.height && otherRectangle.width == this.width;
        }
    }
}