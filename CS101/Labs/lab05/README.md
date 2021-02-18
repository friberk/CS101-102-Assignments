 **Lab No. 5  - More Repetition...**

Fall 2020/2021

### Introduction

Now you have had some practice using ***while*** statements to do repetition in Java, it's time to try the other forms of loop; the ***for*** and ***do-while*** statements. These are not necessary as such, but can make for shorter, more elegant code in some cases; the trick is to know which cases!

The basic syntax for the _**for**_ loop is:

```java 
	    for ( init; condition; update )
            {
            statement;
            }
```

_where **init** is an assignment statement that initialises variables in the condition,_  
_**condition** is any boolean expression,_  
_**update** is an assignment statement that updates variables in the condition,_  
_and **statement** is any Java statement, including compound statements._

The logic is exactly the same as the _while_ statement; check your textbook for more details. We suggest you use _for_ statements for simple counting-type loops.

_Note:_ Layout of the _for_ statement is exactly the same as the _if & while_ statements, i.e. there is a space between the keyword _for_ and the opening bracket, and _statement_ is indented relative to the keyword _for_.

* * *

The basic syntax for the _**_do-while_**_ loop is:

```java
            do
            {
            statement;
            } while ( condition );
```

_where **condition** is any boolean expression,_  
_and **statement** is any Java statement._

When executed, the _statement_ is done, then the _condition_ is checked. If the _condition_ evaluates true, _statement_ is done again, then the _condition_ evaluated once more, and so on until the _condition_ evaluates false. When _condition_ evaluates false, the loop exits. Notice that _statement_ must be executed at least once (in contrast to _while_ & _for_ which may not execute the body of the loop at all).

_Note:_ Layout of the _do-while_ statement follows normal Java style guidelines, in particular,  _statement_ is indented relative to the keyword _do_ and the _while_ keywords. You should, however, put the _while_ keyword on the same line as the closing brace --separated by a space-- so it is easily distinguishable from the start of a _while_ loop!

_Note:_ the semicolon following the closing bracket after the _condition_, is required.

Each of the following tasks should be done in a separate project within your lab05 workspace.

* * *

**(a) Design** and implement a program that uses _for_ loops to print the following rectangular pattern with a user specified width, height and wall thickness. Check the values entered by the user and, (a) simply output an appropriate error message (& stop) if any of the values are invalid (e.g. not positive), or (b) display the rectangle but print a warning message if it does not have a hole in the middle!

Enter width, height & thickness: 5  6  2

```
*****
*****
** **
** **
*****
*****
```

Enter width, height & thickness: 10   10   3

```
**********
**********
**********
***    ***
***    ***
***    ***
***    ***
**********
**********
**********
```

Enter width, height & thickness: 10   5   3

```
**********
**********
**********
**********
**********

Oops... no hole!
```

```
Enter width, height & thickness: 15   6   0

Error: all values must be positive!
```

Once this is working, modify your program so that, after outputting the pattern, it will ask the user if they wish to create another pattern and, if the user responds 'Y' or 'y', does so --any other response causing the program to print the message "goodbye" and stop. _Hint:_ your program will always try to create at least one rectangular pattern.

* * *

**(b) Design** and implement a Java program that will ask the user for the required number of rows and columns, and then generate a neatly laid out table, with each cell indicating the _"row_,_col"_ values, as in the following example (a table having 3 rows and 4 columns):

```
   1,1   1,2   1,3   1,4
   2,1   2,2   2,3   2,4
   3,1   3,2   3,3   3,4
```

Notice that each cell's contents are aligned to the right of a 6 character wide cell. That is, each column in the table is 6 characters wide (in the example, the first 3 characters are spaces, followed by one character for the row digit, another character for the comma, and finally another character for the column digit); if we were to use "stars" instead of the spaces, you would see:  

```
***1,1***1,2***1,3***1,4
***2,1***2,2***2,3***2,4
***3,1***3,2***3,3***3,4
```

When the number of characters needed to output the "row,col" numbers increases, the number of spaces/stars can be reduced accordingly, such that the columns still look neatly aligned to the right (assuming every character has the same width!) For example, "5,12" has 4 characters and would thus require only 2 additional stars `~"\*\*5,12"~` to give 6 characters overall, while "10,12" has 5 characters and would require only 1 extra `~"\*10,12"~`.

Rather than rely on tabs or using Java's built-in printf / formatting features for such spacing, try doing it yourself. _Hint:_ construct a String that has the "_row,col_" values for the current cell, then, in a loop, add space characters to the String, so as to align it appropriately within the desired column width, before finally outputting the String and starting again with the following cell.

Copy-paste the relevant segment of your code four times, such that your program produces four tables (precede each by an appropriate title), and then modify the copies so they each display one of the following:

1.  the row & column numbers as shown in the example
2.  the product of the row & column number (a multiplication table!)
3.  the cell number beginning from 0 and increasing left to right, top to bottom  
    (i.e. 0,1,2,3 on the first row, 4,5,6,7 on the next, and so on).
4.  the row number in the first column only, putting the String "-" into the other cells.  
    (i.e. 1,-,-,- on the first row, 2,-,-,- on the second, and so on).

* * *

**(c) Design** and implement a Simple Calculator program. The program should present a menu to the user, allowing them to select any of the basic arithmetic operations "+", "-", "\*", "/", as well as "Clear" and "Quit". Like most simple hand-held calculators, it should display the current (accumulator) result. The user will enter their selected operation and, if appropriate, a value. The program should apply the specified operation and value to the result, and re-display it and the menu, only stopping when the user selects "Quit". An example interaction is shown below (user entries are shown in **bold** red, the "result" display --between the dashed lines-- in green):

```
Welcome to "SimpleCalc"...

------------------
[ 0.0 ]
------------------
  +,-,*,/ value
  Clear
  Quit
------------------
Select: + 25.0

------------------
[ 25.0 ]
------------------
  +,-,*,/ value
  Clear
  Quit
------------------
Select: / 4

------------------
[ 6.25 ]
------------------
  +,-,*,/ value
  Clear
  Quit
------------------
Select: Clear

------------------
[ 0.0 ]
------------------
  +,-,*,/ value
  Clear
  Quit
------------------
Select: q

Thanks for using "SimpleCalc", goodbye.
```

_Note:_ you should read the operation as a word (String), allowing it to accept single character commands as well as the full ones (i.e. "Clear", "clear", "C" and "c" should all work nicely). The user will have to enter a space between the arithmetic operator and the value, however.

* * *

**(d)** The ratio of the circumference of a circle to its diameter is commonly known as the constant _**pi**_ (often written using the Greek letter, **π** ). Its value can be approximated in numerous ways, one of which is the following infinite series (which gives increasingly accurate values the more terms are included):

![PI using infinite series](http://web.archive.org/web/20191227214834im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab05/pi_series1.svg "Series expansion of PI")

**Design** and implement a little program that will output the value of _**pi**_ by computing it in three different ways:

1.  using the Java constant, Math.PI
2.  using the formula above, ask the user to enter the number of terms of the series to compute, and then compute and report _**pi**_ to the desired number of terms. For example, if the user entered 3, it should compute the value of _**pi**_ using just the first 3 terms, i.e.  4/1 - 4/3 + 4/5.
3.  using the formula above, compute the series to a user specified accuracy, e.g. error < 0.01

* * *

* * *

© 2019, 2018, 2017 & 2015, David Davenport
