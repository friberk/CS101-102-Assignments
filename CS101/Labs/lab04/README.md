 **Lab No. 4  - Repetition while...**

 Fall 2020/2021

### Introduction

You should now be familiar with writing Java programs using sequences and alternations, of input, output, assignments. All that remains is automated repetition, the subject of this week's lab. 

Java has three forms of repetition (loop) statement: ***while***, ***for*** and ***do-while***. The while statement is the most general form in all languages, so we will concentrate on that to begin with and move on the other more specialised forms of loop in later lab assignments.

The basic syntax for the _while_ loop is:
```java
			while ( condition )
			{
			   statement;
			}
```
  *where **condition** _is any boolean expression (exactly the same as in the_ **if** _statement),  
and_ **statement** _is any Java statement, including compound statements._*

When executed, _condition_ is evaluated and, if true _statement_ is done, then the _condition_ is checked again, and so on until the _condition_ evaluates false. When _condition_ evaluates false, _statement_ is not done and the loop exits (so that the program continues with whatever statements follow the loop). This means that _statement_ may be executed zero, one, two or more times.

_Note:_ Layout of the _while_ statement is exactly the same as the _if_ statement, i.e. there is a space between the keyword _while_ and the opening bracket, and _statement_ is indented relative to the keyword _while_.

Each of the following tasks should be done in a separate project (i.e. sub-folder --lab04a, lab04b, lab04c, lab04d--) within your lab04 workspace (i.e. the folder H:\\private\\cs101\\lab04), using ***while*** loops only (i.e. no _for_ or _do-while_ loops!)

**_Caution:_** Sooner or later you will run a program with a loop that continues forever; it may be continuously printing things on the console, or doing nothing obvious other than consuming masses of CPU time and essentially locking up your computer! In such cases you need to intervene to stop the program. In DrJava, try pressing the "Reset" button on the toolbar. In the command prompt or console, try pressing Control-C (i.e. hold the "Ctrl" key down and simultaneously press the "C" key, then release). If all else fails, kill the program from the task manager.

* * *

### (a) Starting simple...

Create a new project, Lab04a, and inside the main method, first read a positive integer value,  **_n_**, from the user (if the value is not positive, simply print an error message & stop), then using that value, do each of the following tasks:

1.  Write a ***while*** loop to output the integer values from 0 up to **_n_** exclusive. Have the output appear on a single line with values separated by a space.
2.  Write a ***while*** loop to output the integer values from 0 up to **_n_** exclusive. The output should have five values per line, with values separated by a space.
3.  Write a ***while*** loop to output the integer values from **_n_** down to 0 inclusive. Have the output appear on a single line with values separated by a space.
4.  Write a ***while*** loop to output the _even_ values from \-**_n_** up to **_n_** inclusive. Have your output appear on a single line with values separated by a space.
5.  Write a ***while*** loop that outputs (separated by spaces, five numbers per line ) the squares of the _even_ values from 0 up to **_n_** inclusive. 
6.  Write a ***while*** loop that outputs (separated by spaces, five numbers per line) the values which are divisible by 3 or 4, but not both, from **_n_** down to 3 inclusive.  For example, if **_n_** is 12, it should display 9 8 6 4 3.
7.  Write a ***while*** loop that outputs all of the divisors of **_n_**. For example, if **_n_** is 12, it must display 2 3 4 6 12.
8.  Write a ***while*** loop that, for every integer **_k_** from **_n_** down to 1, outputs the values of 1 / **_k_**  that are greater than 0.01. For example, if **_n_** is 5, it should output 0.20 0.25 0.33 0.50 1.00. Can you have the output appear with only two significant digits?

* * *

### (b) Processing data...

Write a program, Lab04b, that will read exactly ***n*** integer values from the user, adding each value to a sum and simultaneously counting them; then, after the last one has been processed, report their sum and count. The value of ***n*** should be fixed, e.g. 6, and any values that are entered after the ***n***'th one should be ignored. _Note: you do not need to store the values read from the user; simply process each one as it is read!_

In the same folder as your .class files, create a text file, ``testdata.txt``, containing some test data, e.g. the values \[2, 9, 4, 27, 15, 4, 12\], one value per line.

Open a command prompt and navigate to the folder containing your class file. From the command prompt, run your program by typing the command ``java Lab04b  <  testdata.txt``, which should cause your program to read its input from the specified file, rather than the keyboard. It will still output its results to the command prompt. _Note: you can have your program read data from one file and send the output to another file --as you did in the previous lab assignments-- by typing ``java Lab04b < testdata.txt > results.txt`` Try it, then open ``results.txt`` to see what happened!_

Download and [save this text file](http://web.archive.org/web/20191227214711/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab04/realdata.txt), then modify your program so that it finds the average, minimum and maximum, of the first 100 values.

* * *

### (c) Processing data... again?

Create another project, Lab04c, and write a program that finds the average, minimum and maximum, of a set of integer values up to, but not including the first negative value. Assume such a value always exists. _Hint:_ the negative value acts as a _sentinel_, standing guard at the end of the data to be processed! Demonstrate your program by having it process the same ``testdata.txt`` file as in part b.

* * *

### (d) And finally...

Create another project and try the following tasks:

1.  Prompt the user to enter a character, ***ch***, and an int value, ***width***, and then print out a triangle formed using ***ch*** characters having a base of ***width*** characters. For example, if the user enters "*" and 5, it should print,
    
			*
			**
			***
			****
			*****
    
2.  Can you predict what the following code will print out?
    
    ```java
			double d;
			d = 0.1;
			while ( d != 1.0 )
			{
			   System.out.println( d);
		       d = d + 0.1;
			}
			System.out.println( d + " <- final value after loop!");
    ```
    
    Copy-paste it into your IDE and run it to check your prediction.
    
    Modify the condition such that it says ``while ( d < 1.0 )``. What will happen if you run it now?  
    
    Can you explain why this happens? What is the moral of the story?
    

* * *

* * *

© 2018, 2017 & 2015, David Davenport