/**
 * Test class for Polynomial.java
 * @author Berk Çakar (22003021)
 * @version 16.02.2021
 */
public class PolynomialTester {
    public static void main(String[] args) throws Exception {

        // Variables
        Polynomial p1, p2, p3, p4, p5, p6, p7;
        double [] p2Array, p3Array, p5Array, p6Array, p7Array;

        // Program Code
        p2Array = new double[]{ 2, 4, 0, 7 };
        p3Array = new double[]{ 5, 8, 2, 3, 6 };
        p5Array = new double[]{ 3, 4, 1, 3, 0, 2 };
        p6Array = new double[]{ 2, 1 };
        p7Array = new double[]{ 3, 4, 1};

        p1 = new Polynomial( 5, 3 );
        p2 = new Polynomial( p2Array );
        p3 = new Polynomial( p3Array );
        p4 = new Polynomial();

        p5 = new Polynomial( p5Array );
        p6 = new Polynomial( p6Array );

        p7 = new Polynomial( p7Array );

        System.out.println( "String representation of the given polynomials: " );
        System.out.println( "p1 = " + p1.toString() );
        System.out.println( "p2 = " + p2.toString() );
        System.out.println( "p3 = " + p3.toString() );
        System.out.println( "p4 = " + p4.toString() );


        System.out.println( "\nDegrees of the given polynomials: " );
        System.out.println( "deg(p1) = " + p1.getDegree() );
        System.out.println( "deg(p2) = " + p2.getDegree() );
        System.out.println( "deg(p3) = " + p3.getDegree() );
        System.out.println( "deg(p4) = " + p4.getDegree() );

        System.out.println( "\ngetCoefficient testing: " );
        System.out.println( "Coefficient with degree 3 in p1 = " + p1.getCoefficient( 3 ) );
        System.out.println( "Coefficient with degree 1 in p2 = " + p2.getCoefficient( 1 ) );
        System.out.println( "Coefficient with degree 4 in p3 = " + p3.getCoefficient( 4 ) );
        System.out.println( "Coefficient with degree 0 in p4 = " + p4.getCoefficient( 0 ) );

        System.out.println( "\nEvaluation of the given polynomials in traditional way: " );
        System.out.println( "p1( 6 ) = " + p1.eval( 6 ) );
        System.out.println( "p2( 4 ) = " + p2.eval( 4 ) );
        System.out.println( "p3( 9 ) = " + p3.eval( 9 ) );
        System.out.println( "p3( 5 ) = " + p4.eval( 5 ) );

        System.out.println( "\nEvaluation of the given polynomials using Horner's Method: " );
        System.out.println( "p1( 6 ) = " + p1.eval2( 6 ) );
        System.out.println( "p2( 4 ) = " + p2.eval2( 4 ) );
        System.out.println( "p3( 9 ) = " + p3.eval2( 9 ) );
        System.out.println( "p3( 5 ) = " + p4.eval2( 5 ) );

        System.out.println( "\nPolynomial Sum: " );
        System.out.println( "p2(x) + p3(x) = " + p2.add( p3 ) );
        System.out.println( "p5(x) + p6(x) = " + p5.add( p6 ) );

        System.out.println( "\nPolynomial Subtraction: " );
        System.out.println( "p2(x) - p3(x) = " + p2.sub( p3 ) );
        System.out.println( "p5(x) - p6(x) = " + p5.sub( p6 ) );

        System.out.println( "\nPolynomial Multiplication: " );
        System.out.println( "p2(x) * p3(x) = " + p2.mul( p3 ) );
        System.out.println( "p5(x) * p6(x) = " + p5.mul( p6 ) );

        System.out.println( "\nPolynomial Composition: " );
        System.out.println( "p2( p3(x) ) = " + p2.compose( p3 ) );
        System.out.println( "p5( p6(x) ) = " + p5.compose( p6 ) );

        System.out.println( "\nPolynomial division: " );
        System.out.println( "(" + p3.toString() + ")" +" / " + "(" + p2.toString() + ")" + " = " );
        System.out.print( p3.div( p2 ) );

        System.out.println( "\n\n" + "(" + p5.toString() + ")" +" / " + "(" + p6.toString() + ")" + " = " );
        System.out.print( p5.div( p6 ) );

        System.out.println( "\n\n" + p7.compose(p6) );
        System.out.println( p7.div(p6));
    }
}