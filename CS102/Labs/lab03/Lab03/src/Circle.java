/**
 * Circle class for Lab03 assignment.
 * @author Berk Çakar
 * @version 26.02.2021
 */
public class Circle extends Shape2D {

    // Properties
    double radius;

    // Constructors

    /**
     * Default and only constructor for Circle objects take object's center
     * x and y coordinates and its radius.
     * @param x is the x coordinate of the cirle's center.
     * @param y is the y coordinate of the circle's center.
     * @param radius is the radius of the circle.
     */
    public Circle( int x, int y, double radius ) {
        super( x, y );
        this.radius = radius;
    }

    // Methods

    /**
     * This method calculates perimeter of the Circle.
     * @return Perimeter of the Circle.
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    /**
     * This method calculates area of the Circle.
     * @return Area of the Circle.
     */
    public double calculateArea() {
        return Math.PI * Math.pow( this.radius, 2 );
    }


    /**
     * This method returns the String representation of the Circle object.
     * @return The String representation of the Circle object.
     */
    @Override
    public String toString() {
        return "[class Circle]" + "x = " + this.x + ", " + "y = " + this.y +
               " and radius = " + this.radius;
    }

    /**
     * This method checks whether two Circle objects are equal or not.
     * @return {@code false} if the passed object is null or from a different class,
     * {@code true} if compared Circle objects are equal.
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
            Circle otherCircle = ( Circle ) anyShape;
            return otherCircle.x == this.x && otherCircle.y == this.y &&
                   otherCircle.radius == this.radius;
        }
    }
}