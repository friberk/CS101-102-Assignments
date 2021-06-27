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
