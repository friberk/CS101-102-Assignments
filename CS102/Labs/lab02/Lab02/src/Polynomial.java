/**
 * Updated Polynomial class for Lab02 assignment.
 * @author Berk Çakar (22003021)
 * @version 16.02.2020
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
            else if ( this.getDegree() == 0 && this.coefficient[ 0 ] == 0 ) {
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

    /**
     * This method adds a polynomial to another one.
     * @param p2 polynomial that you want to add.
     * @return The sum of these two polynomials.
     */
    public Polynomial add ( Polynomial p2 ) {
        Polynomial temp = new Polynomial( 0, Math.max( this.getDegree(), p2.getDegree() ) );
        
        for( int index = 0; index <= this.getDegree(); index = index + 1 ) {
            temp.coefficient[ index ] = temp.coefficient[ index ] + this.coefficient[ index ];
        }
        
        for( int index = 0; index <= p2.getDegree(); index = index + 1 ) {
            temp.coefficient[ index ] = temp.coefficient[ index ] + p2.coefficient[ index ];
        }
        
        temp.degree = temp.getDegree();
        
        return temp;
    }

    /**
     * This method substracts a polynomial from another one.
     * @param p2 polynomial that you want to substract.
     * @return The difference of these two polynomials.
     */
    public Polynomial sub ( Polynomial p2 ) {
        Polynomial temp = new Polynomial( 0, Math.max( this.getDegree(), p2.getDegree() ) );
        
        for( int index = 0; index <= this.getDegree(); index = index + 1 ) {
            temp.coefficient[ index ] = temp.coefficient[ index ] + this.coefficient[ index ];
        }
        
        for( int index = 0; index <= p2.getDegree(); index = index + 1 ) {
            temp.coefficient[ index ] = temp.coefficient[ index ] - p2.coefficient[ index ];
        }
        
        temp.degree = temp.getDegree();
        
        return temp;
    }

    /**
     * This method multiplies a polynomial with another one.
     * @param p2 polynomial that you want to multiple.
     * @return The product of these two polynomials.
     */
    public Polynomial mul( Polynomial p2 ){
        Polynomial temp = new Polynomial( 0, this.getDegree() + p2.getDegree() );
        
        for( int index = 0; index <= this.getDegree(); index = index + 1 ) {
            
            for( int secondIndex = 0; secondIndex <= p2.getDegree(); secondIndex = secondIndex + 1 ) {
                temp.coefficient[ index + secondIndex ] = temp.coefficient[ index + secondIndex ] 
                                  + ( this.coefficient[ index ] * p2.coefficient[ secondIndex ] );
            }
        }
    
        temp.degree = temp.getDegree();
        
        return temp;
    }

    /**
     * This method takes the composition of two polynomials.
     * @param p2 polynomial that you want to compose. f(g(x)) -> where g(x) = p2
     * @return The composition of these two polynomials.
     */
    public Polynomial compose( Polynomial p2 ) {
        Polynomial temp = new Polynomial();
        Polynomial term;
        
        for ( int index = this.getDegree(); index >= 0; index = index - 1 ) {
            term = new Polynomial( this.coefficient[ index ], 0 );
            temp = term.add( p2.mul( temp ) ); // Similar way as how we used Horner's method before.
        }
        
        return temp;
    }

    /**
     * This method divides this polynomial with another polynomial.
     * @param p2 divisor polynomial.
     * @return Result (quotient) of P(x) / Q(x). Note that remainder would be ignored.
     */
    public Polynomial div( Polynomial p2 ) {
        Polynomial pX;
        Polynomial qX;
        Polynomial tX;
        Polynomial tXReturn;

        pX = this;
        qX = p2;
        tXReturn = new Polynomial();

        if ( qX.getDegree() == 0 && qX.coefficient[ 0 ] == 0 ) {
            System.out.println( "You cannot divide with zero polynomial!" );
        }

        else {
            do {
                tX = new Polynomial( ( pX.getCoefficient( pX.getDegree() ) / qX.getCoefficient( qX.getDegree() ) ),
                                     ( pX.getDegree() - qX.getDegree() ) );
            
                pX = ( pX.sub( ( qX.mul( tX ) ) ) );            /* P(x) - ( Q(x) * T(x) ) */
                tXReturn = tXReturn.add( tX );
                
                } while ( pX.getDegree() >= qX.getDegree() );
        }

        return tXReturn;
    }
}