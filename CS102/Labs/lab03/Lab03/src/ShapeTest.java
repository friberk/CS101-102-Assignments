import java.util.Arrays;

/**
 * ShapeTest class for Lab03 assignment.
 * @author Berk Çakar
 * @version 26.02.2021
*/
public class ShapeTest {

    /**
     * This method finds the shape object with largest area among the other objects in array.
     * @param shapeObjects is the array containing shape objects.
     * @return The shape object with largest area.
     */
    public static Shape2D findLargestArea( Shape2D[] shapeObjects ) {
        Shape2D maxArea = shapeObjects[ 0 ];

        for ( int index = 0; index < shapeObjects.length; index = index + 1 ) {
            if ( shapeObjects[ index ].calculateArea() > maxArea.calculateArea() ) {
                maxArea = shapeObjects[ index ];
            }
        }

        return maxArea;
    }

    /**
     * This method finds the shape object with longest perimeter among the other objects in array.
     * @param shapeObjects is the array containing shape objects.
     * @return The shape object with longest perimeter.
     */
    public static Shape2D findLongestPerimeter( Shape2D[] shapeObjects ) {
        Shape2D maxPerimeter = shapeObjects[ 0 ];

        for ( int index = 0; index < shapeObjects.length; index = index + 1 ) {
            if ( shapeObjects[ index ].calculatePerimeter() > maxPerimeter.calculatePerimeter() ) {
                maxPerimeter = shapeObjects[ index ];
            }
        }

        return maxPerimeter;
    }
    public static void main(String[] args) {
        // Variables
        Circle circle = new Circle( 13, 15, 7 );
        Rectangle rectangle = new Rectangle( 2, 3, 8, 15 );

        Square square = new Square( -2, -5, 5 );
        Square square2 = new Square( -2, -5, 5 );
        Square square3 = new Square( -1, -5, 5 );
        Square square4 = null;

        // Program Code
        System.out.println( rectangle.toString() );
        System.out.println( circle.toString() );
        System.out.println( "sq: " + square.toString() );
        System.out.println( "sq2: " + square2.toString() );
        System.out.println( "sq3: " + square3.toString() );
        System.out.println( "sq4: " + String.valueOf( square4 ) );
        System.out.println( "sq.equals( sq2 ) is " + square.equals( square2 ) );
        System.out.println( "sq.equals( sq3 ) is " + square.equals( square3 ) );
        System.out.println( "sq.equals( sq4 ) is " + square.equals( square4 ) );
        System.out.println( "sq.equals( circle ) is " + square.equals( circle ) );
        Shape2D[] shapeObjects = { rectangle, circle, square };
        System.out.println( "The shape array: " + Arrays.toString( shapeObjects ) );
        System.out.println( findLargestArea( shapeObjects ).getClass().getName() + " has largest area" );
        System.out.println( findLongestPerimeter( shapeObjects ).getClass().getName() + " has longest perimeter" );
        System.out.println( "Distance between shape 1 shape 2 is " +
                            shapeObjects[ 0 ].calculateDistance( shapeObjects[ 1 ] ) );
        System.out.println( "Distance between shape 1 shape 3 is " +
                            shapeObjects[ 0 ].calculateDistance( shapeObjects[ 2 ] ) );
        System.out.println( "Distance between shape 2 shape 3 is " +
                            shapeObjects[ 1 ].calculateDistance( shapeObjects[ 2 ] ) );
    }
}