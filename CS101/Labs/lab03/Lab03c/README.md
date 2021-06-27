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