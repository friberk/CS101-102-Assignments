**Lab No. 3  - Decisions, decisions...**

Fall 2020/2021

### Introduction

The previous lab focused on creating, compiling, running & debugging a Java program, and using a sequence of input, output and assignment statements to solve simple problems. This week's lab should help you become familiar with decision statements, ***if statements***, which enable your program to do either one thing or another, never both. Some of the exercises are extensions of the previous lab assignment, which should save you time (you  only need to add the new bits) and give you an opportunity to make sure they really were correct after all!

The basic syntax for the _if_ statement is:

```java
if ( condition )
{
    statementT;
}
else
{
    statementF;
}
```
*where **condition** _is any expression that evaluates to a boolean result,  
and_ **statement** _is any Java statement, including compound statements._*

When executed, if the _condition_ evaluates true then _statementT_ is done, whereas if the _condition_ evaluates false then _statementF_ is done.

_Note:_ that there is a space between the keyword _if_ and the opening bracket, that the keywords _if_ and _else_ are at the same indentation level, and that _statement_ is indented relative to the keyword _if_.

_Note:_ the _else_ clause is optional.

Each of the following tasks should be done in a separate project within your lab03 workspace (in other words, each task should be placed in a sub-folder --lab03a, lab03b, lab03c-- inside H:\\private\\cs101\\lab03). You may need to review the [Using DrJava](http://web.archive.org/web/20191227213828/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/practicalwork/Using-DrJava/UsingDrJava.doc) exercise from Lab02, to remind yourself how to work with projects.

### (a) Practice... makes perfect?

The following exercise should help get you up to speed using simple Java _if_ statements. Start by creating a new project, and then copy-paste the following _for_ loop statement into the body of its main method. You are not expected to understand the loop yet, you will simply use it to automatically generate values of the variable **x** from 0 to +50 so you can test out your _if_ statements. Inside the loop (where it says "// your code goes here"), add a statement that prints the value of the variable **x**, then compile and run the program to see this.

```java
for ( int x = 0; x <= 50; x++ )  
{  
    // your code goes here  
}
```

Once you have this working, insert an _if_ statement into the body of the loop so that:

*   whenever **x** is **_not_** between 12 and 25 inclusive, it prints the message "out of range 12-25"  next to the value of **x**.
    

Having done that, do each of the following in a similar way:

*   count the number of even and the number of odd values, that **x** takes. Report the result after the loop.
    
*   if **x** is multiple of 5 print the message "Hi Five", else if it is divisible by 2 print the message "Hi Two", else if it is divisible by 3 or 7 print the message "Hi ThreeOrSeven", else  print the message "Hi Others!".
    
*   sum only the values of **x** between 1 and **n** inclusive. Add statements before the loop to read the integer value **n** from the user. After the loop, add a statement that compares the sum you computed inside the loop, with the result of the formula, **n**(**n**+1)/2, and print out a message saying whether they are the same or not! Test with various values of **n**.

* * *

### (b) Validating user input

Last week, Lab02d asked you to calculate the number of flowers that could be planted in a triangular garden. You probably assumed that whatever values the user entered for the lengths of the sides of the garden, did actually form a triangle, but obviously that may not be the case! Make a copy of your solution to Lab02d, placing it into a new project, Lab03b. Next, add the code necessary to check whether the values entered do indeed form a triangle. To do this, use the triangle inequality theorem: "any side of a triangle is always shorter than the sum of the other two sides". Print a warning message and stop if the values are invalid.

* * *

### (c) Maintenance

The world moves on and you often find yourself modifying programs to keep up with the times; in computer jargon it's called maintenance! For Lab03c, make a copy of your webpage generating program from Lab2e and modify it to do the following:

*   Consider the salary value entered by the user to be the gross salary. Compute the employee's net salary by subtracting a fixed amount of $100 and then take off 15% tax from what is left. On the webpage, display the net salary value (together with the tax rate between brackets) instead of the gross salary.
*   Check that the user has entered a positive value for the age. Print an error message and stop if they haven't. Do the same for salary, but make sure it is also less than a maximum, say $10000 for example.
*   Rather than have a constant 15% tax rate for all, the government decides to take only 5% from employees earning below $1000 gross, but to take 25% from those earning more than $5000. Implement this.

Last, but not least, the company decides it would like to include a picture of each employee in their webpage. The pictures are to be stored in an image file with the employee's ***name*** and a ***.jpg*** extension (e.g. einstein.jpg or taz.jpg or ayse.jpg) Have your program add the necessary html code immediately after the first ``<hr>`` tag, for example:

    <img src="einstein.jpg">      or      <img src="taz.jpg">      or      <img src="ayse.jpg">    ...

_Hint:_ place the images and the html file in the same folder. You can find your own images or use the following ones for practice: [einstein.jpg](http://web.archive.org/web/20191227213828/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab03/einstein.jpg), [taz.jpg.](http://web.archive.org/web/20191227213828/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab03/taz.jpg)

Of course, some employees may not have pictures available, in which case the company asks that no image be shown at all. In other words, you should only include the html "img" tag in the webpage if the image file actually exists. To determine whether a file exists or not, try the following method call ``Files.exists( Paths.get( filename ) )`` which returns _true_ if the specified ***filename*** exists, and _false_ otherwise.

_Note:_ You don't need to understand the above method call, however, you will need to include the following magic right at the top of your program (immediately after the existing ``import java.util.Scanner;`` statement) in order for it to work:

```java
import java.nio.file.*;    
import java.io.*;
```
* * *

**_Optional:_**  Wanna try a little more magic... no guarantees, but (once you have completed the [CommandPrompt (msdos) tutorial](http://web.archive.org/web/20191227213828/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/assignments/lab01/labmsdos.htm) from [Lab01](http://web.archive.org/web/20191227213828/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/assignments/lab01) and so are reasonably proficient using the CommandPrompt to direct the output of your code into the "temp.htm" file), try this:

Add " throws FileNotFoundException" to the end of the main method definition line, so it says,

```java
public static void main( String[] args) throws FileNotFoundException
```
Immediately following the ``Scanner scan = new Scanner( System.in);`` statement, add the command

```java
PrintStream originalStdOut = System.out;
```

Next, restore the user-friendly prompts (remember... the ones you commented out last week so they didn't mess up the html, but which then made the program very difficult for the company secretary to use).

Then, after getting all the required data from the user and before starting to output it in html form (using ``System.out.println`` statements), add the following,

```java
System.setOut( new PrintStream( "magic.htm" ) );
```

Finally, after printing the closing html tag (and before the end of the main method), add the following,

```java
System.out.close();  
System.setOut( originalStdOut);  
System.out.println( "Webpage created.");
```

Save, compile & run your program from within the IDE. It should ask for the employee information and then automatically create the html webpage file, all without you ever needing to use the CommandPrompt; try opening the "magic.htm" file in a browser to make sure. Assuming the magic worked, everyone will be very impressed and the company secretary will be especially happy!

* * *

* * *

© 2017, 2016 & 2015, David Davenport
