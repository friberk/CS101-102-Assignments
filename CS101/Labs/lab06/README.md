 **Lab No. 6  - Method madness?**

Fall 2020/2021

### Introduction

As programs get longer, managing them becomes increasingly difficult. That's where methods come in handy. In essence, a method is just a named collection of statements. Once declared, a method can be invoked any number of times. This lab will give you practice creating and using (static) methods.

The basic syntax for defining a (static) method is:

```java
accessModifier static returnType methodName( formalParameterList)
{
statement;
}
```

_where **accessModifier** is either "public", "protected", "" (default), or "private"_  
_**returnType** is any Java type or "void" if there is no return,_  
_**methodName** is the name given to the method,_  
_and **formalParameterList** is an optional list of type name pairs, separated by commas._

Methods are defined inside a class (but not inside another method).

Methods are invoked by name. If the method is in a different class/package, the full path to the method must be provided, e.g. apackage.asubpackage.aclass._**methodName**_( _**actualParameterList**_)

When a method is invoked, values are passed to it via an _**actualParameterList**_, which is matched one-by-one in sequence to the formalParameterList.

Use a _return_ statement to specify the result of the method ("void" methods must not include return).

#### Documenting your code

Your methods should be preceded by a JavaDoc comment that gives a brief description of the method's purpose and lists any parameters it takes, as well as what it returns (unless it is void). For example:

```java
/**
 * This is a brief description of the method.
 * @param i an example input parameter
 * @param s another example input 
 * @return some useful result
 */
public static double myMethod( int i, String s) 
{
:
}
```

Generate the actual html documentation for your code from within your IDE or by using the javadoc tool from the command line. See your textbook and the web for further details and examples.

You can do this assignment in a single project within your lab06 workspace.

* * *

**Design, implement and test the following simple methods**, all of which can be in the same class as your main method.

*   write a method called power that computes and returns **_x_** to the power _**y**_, where **_x_** is any real value & **_y_** is a positive integer. Use repeated multiplication, _not_ Math class methods.

*   write a method to compute **_n_** factorial, where **_n_** is a positive integer. Use a _for_ loop that decrements its loop-control-variable each time. Return a int result.

*   write a method reverse that takes a String parameter, **_s_**, and returns a String that is the reverse of **_s_**. For example, if **_s_** is "abcd", the method should return "dcba". 

*   write a method with the signature "public static int toDecimal( String base2)" that converts the given base2 String to its decimal --base10-- equivalent, as an int. For example, if base2 is "110", it should return 6, whereas if it was "1011", it should return 11. _You should be able to do this without using Math class methods, and without computing the power of the most significant digit._

*   write a method that converts a positive decimal int value into the corresponding binary String.


**Demonstrate your methods by doing the following:**

1.  print a table with columns n, n-squared, n-cubed & n to the power 4, for values of n from -1 to 10 inclusive

2.  print a table of n and n-factorial, for values of n from 1 to 15

3.  read two binary (base-2) Strings from the user, convert them to decimal, then add them together and print the result in binary form.

4.  read a line of text from the user and output it again, but with each word reversed. For instance, were the user to enter "gnimmargorP si nuf", your program should output "Programming is fun".

5.  print a table that shows the "raw" calculations for the Taylor series expansion of sin(x), where x is read from the user. Your table should have columns for the term number n, and for (-1)^n, x^(2n+1), (2n+1)!, the term itself computed from these values, and the sum of the preceding terms with this one, i.e. the current approximation to sin(x). The term number n should go from 0 up to, say, 10.
       
![Taylor series expansion of sin(x)](http://web.archive.org/web/20191227215104im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab06/taylorseries_sinx.png)

    How accurate are the results? Can you explain any deviation from the expected answers?

6.  obviously computing sin(x) like this results in significant errors and is very inefficient! A better approach is to compute each term from the previous one (hint: think how can you compute x^5/5! from x^3/3! ). Implement sin(x) as a method using this approach and test it by comparing its answers with those from Math.sin(x).

* * *

* * *

© 2017, 2016, 2015, David Davenport
