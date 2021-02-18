# CS102- Algorithms and Programming II

## Lab 02

### **Lab Objectives:** ​Arrays, Classes & Objects, reuse in OOP

For all labs in CS 102, your solutions must conform to these [CS101/102 style
guidelines](http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm).

**Question** ​In this lab, you will use the ​ **Polynomial** ​class that you implemented in the first lab assignment.

Implement the following operations for

* **add( Polynomial p2 )** ​ **:** ​ Sums this polynomial (polynomial for which the method is called) and polynomial p2, and returns the result as a new polynomial.
* **sub( Polynomial p2 )** ​ **:** ​ Subtracts polynomial p2 from this polynomial for which the method is called on, and returns the result as a new polynomial.
* **mul( Polynomial p2 )** ​ **:** ​ Multiplies this polynomial (polynomial for which the method is called), and polynomial p2 and returns the result as a new polynomial.

For polynomials P(x) and Q(x), the results of addition, subtraction and multiplication
operations are:

``P(x) = 3 + 4x + 5x​^2 ​ + 2x​^3``  
``Q(x) = 2 + 4x + 1x​^2``  

``P(x) + Q(x) = 5 + 8x + 6x​^2 ​ + 2x​^3``  
``P(x) - Q(x) = 1 + 4x​^2 ​ + 2x​^3``  
``P(x) * Q(x) = 6 + 20x + 29x​^2 ​ + 28x​^3 ​ + 13x​^4 ​ + 2x​^5``  

2. Implement compose and div methods. You can use add, sub, mul methods you already implemented to simplify compose and div methods.

* **compose( Polynomial p2 )** ​ **:** ​Returns the composition of this polynomial with p2.


For polynomials P(x) and Q(x), the result of composition (P(Q(x))) is:

``P(x) = 3 + 4x + 1x​^2``   
``Q(x) = 2 + 1x``   

``P(Q(x)) = 3 + 4 (2 + 1x) + 1 (2 + 1x)​^2``  
``P(Q(x)) = 15 + 8x + 1x​^2``

* **div( Polynomial p2 )** ​ **:** ​ Divides this polynomial with p2 and returns the quotient.

``P(x) = 3 + 4x + 1x​^2 ​ + 3x​^3 ​ + 2x​^5``  
``Q(x) = 2 + 1x``  

For polynomials P(x) and Q(x), the result of the division operation, P(x) / Q(x), is found as follows:

* Find the leading term (non zero term with highest degree) of the P(x) and Q(x).

``lead(P(x)) = 2x​^5``  
``lead(Q(x)) = x``  
* Find polynomial T(x) such that:  

``T(x) = lead(P(x)) / lead(Q(x)) = 2x​^4``  
* Subtract T(x) * Q(x) from P(x) and assign the result to P(x).  

``P(x) – Q(x) * T(x) = 3 + 4x + 1x​^2 ​ + 3x​^3 ​ + -x​^4``  

* Add T(x) to the result and repeat this process until the degree of P(x) is higher than the degree of Q(x).


Result of P(x) / Q(x) is 46 – 21x + 11x​^2 ​ – 4x​^3 ​ + 2x​^4 ​. Note that remainder is ignored.

3. Modify the ​ **PolynomialTester** ​ class from the first assignment to test your Polynomial
    class for the above operations.

**IMPORTANT NOTES:**
1. Please reuse the available methods as much as you can instead of repeating the
same code in different methods. For example, instead of calculating the degree of
the polynomial for addition, you must use the method defined for this purpose. You
can implement subtraction by calling polynomial addition and multiplication methods
instead of repeating the code of the add method. For the compose method, you must
call the multiplication method repeatedly.


