/**
 * Polynomial class for Lab01 assignment.
 * @author Berk Çakar (22003021)
 * @version 08.02.2020
 */
public class Polynomial
{
    // Properties
    private double[] coefficient;
    private int degree;
    
    // Constructors
    /**
     * Constructor for initializing single polynomial term.
     * @param coefficient of the term.
     * @param degree of the term.
     */
    public Polynomial( double coefficient, int degree ) {
        if ( degree < 0 ) {
            System.out.println( "Degree of a polynomial term cannot be negative!" );
        } // Since throwing exception is not allowed in CS101/2 yet, output this line instead. 

        else {
            this.coefficient = new double[ degree + 1 ];
            this.coefficient[ degree ] = coefficient;
            this.degree = getDegree();
        }
    }

    /**
     * Default constructor initializes a zero polynomial with 
     * coefficient and degree = 0.
     */
    public Polynomial() {
        // Both degree and coefficient are equal to 0 in a zero polynomial.
        this.coefficient = new double[ 1 ];             /* [ degree + 1 ] */
        this.coefficient[ 0 ] = 0;                      /* [ degree ] */
        this.degree = 0;
    }

    /**
     * This constructor initializes a polynomial with given coefficients in an double[] array.
     * {a, b, c, d ... n} --> a + bx + cx^2 + dx^3 + ... + nx^(N)
     * @param coefficient
     */
    public Polynomial( double[] coefficient ) {
        this.coefficient = new double[ coefficient.length ];

        for ( int index = 0; index < coefficient.length; index = index + 1 ) {
            this.coefficient[ index ] = coefficient[ index ];
        }

        this.degree = getDegree();
    }

    // Methods
    
    /**
     * Method for finding the degree of the given polynomial.
     * @return Degree of the polynomial.
     */
    public int getDegree(){
        int degree = 0;
        
        for( int index = 0; index < this.coefficient.length; index = index + 1 )
            if( this.coefficient[ index ] != 0 ) {
                degree = index;
            }
        
        return degree;
    }
    
    /**
     * This method gets the coefficient with the wanted degree.
     * @param degree is the value of the wanted degree.
     * @return Coefficient corresponding to the desired degree when found (default value = 0).
     */
    public double getCoefficient( int degree ) {
        double wantedCoefficient;
        wantedCoefficient = 0;

        for ( int index = 0; index < this.coefficient.length; index = index + 1 ) {
            if ( index == degree ) {
                wantedCoefficient = this.coefficient[ index ];
            }
        }

        return wantedCoefficient;
    }

    /**
     * This method is for in order to get the String representation of the given polynomial.
     * @return String representation of the given polynomial.
     */
    @Override
    public String toString() { 
        String polynomialString;
        polynomialString = "";

        String sign;
        sign = "";
        
        for ( int index = 0; index < this.coefficient.length; index = index + 1 ) {
            if ( this.coefficient[ index ] < 0 ) {
                sign = "-";
            }

            else {
                sign = "+";
            }
            
            // Do not represent the term with coefficient 0.
            if ( this.coefficient[ index ] != 0 ) {
                if ( index == 0 ) {
                    polynomialString = polynomialString + this.coefficient[ 0 ] + "";
                }

                else if ( index == 1 ) { 
                    polynomialString = polynomialString + " " + sign + " " + Math.abs( this.coefficient[ 1 ] ) + "x";
                }
                
                else {
                    polynomialString = polynomialString + " " + sign + " " + Math.abs( this.coefficient[ index ] ) + "x^" + index;
                }
            }
            
            // Exceptional case for the zero polynomial.
            else if ( this.coefficient.length == 1 && this.coefficient[ 0 ] == 0 ) {
                polynomialString = polynomialString + 0;
            }
        }
        return polynomialString;
    }

    /**
     * This method computes the polynomial for the given x value.
     * @param x
     * @return Evaluation result of given terms.
     */
    public double eval( double x ) {
        double evaluation;
        evaluation = 0;
        
        for ( int index = 0; index < this.coefficient.length; index = index + 1 ) {
            evaluation = evaluation + ( this.coefficient[ index ] * ( Math.pow( x, index ) ) );
        }

        return evaluation;
    }

    /**
     * This method computes the polynomial for the given x value by using Horner's method.
     * @param x
     * @return Evaluation result of the given terms which computed using Horner's method.
     */
    public double eval2( double x ) {
        double evaluation = 0;   
   
        for (int index = this.coefficient.length - 1; index >= 0; index = index - 1) {
            evaluation = ( evaluation * x ) + this.coefficient[ index ];
        }

        return evaluation; 
    }
}