
 **Lab No.2  - Using Java to solve simple problems!**

 Fall 2020/2021

### Introduction

Implementing Java programs is relatively simple; this lab should help you get up and running, but it is only the beginning. To be proficient you will need lots of practice. Be sure to read Chapters 1 & 2 of your textbook, and try doing as many of the self-check and end-of-chapter exercises as you can. Please take your time and make sure you really do understand what you are doing; this is a learning exercise, not a race.

### Getting started

_Read and carefully follow_ the instructions below, _in sequence_!

*   **First,** [follow these instructions](http://web.archive.org/web/20191227213603/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/practicalwork/Using-DrJava/index.html) to make sure you have the Java Development Kit (JDK) installed, together with a suitable Integrated Development Environment (IDE). For CS101, we will use the DrJava IDE, which is free, open-source & cross-platform; it's actually written in Java! Be sure to configure DrJava as noted in the instructions before moving on.
*   **Next,** [follow these instructions](http://web.archive.org/web/20191227213603/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/practicalwork/Using-DrJava/UsingDrJava.doc) to learn how to use your IDE in a relatively organised and professional way. This exercise includes projects Lab02a and Lab02b.
*   **Finally,** _after completing the previous two steps_ , do projects Lab02c, Lab02d & Lab02e [below](#some-simple-problems).  
    Note:
    *   In DrJava your workspace is the lab02 folder. Each project in the workspace is placed in its own sub-folder, i.e. project Lab02c is in a folder called lab02c inside lab02.
    *   Only one project is active at a time. In DrJava, to compile/run a different project, select it from the list in the Project menu (or explicitly open it from there).
    *   Your solutions must conform to these  [CS101 style guidelines](http://web.archive.org/web/20191227213603/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/practicalwork/styleguidelines.htm)  (rules!)
    *   You should declare all constants first, followed by all the variables you will use, followed by the actual program. Whilst constants should be given values when declared, variables should not! Unfortunately, the textbook usually gives variables initial values when declaring them, and declares them in the middle of the program code, as needed. We consider this bad practice; do not do it!
    *   These problems may be so simple you (think you) can do them in your head, however, it is a good idea to get into the habit of designing your program (on paper) first, before implementing it; doing so will save you a lot of time in the future when the problems get much larger.
    *   Obviously you will need to test your program once it is running. Try to come up with a set of test cases (inputs and corresponding outputs) before you begin implementation. Thinking about testing as part of the design process may help you develop a better program and so avoid "expensive" difficulties later on!

Try to solve any problems you run into by yourself, but if, after spending a reasonable amount of time and effort you still can't work it out, please ask the lab TA/Tutor (or ask on the course forum!)

* * *

### Basic syntax guide

Declare **variable**s using the syntax:

```java
            type name;
```

*where **type** is any Java type (e.g. int, double, char, boolean, String) and **name** is the desired name of the memory location (a Java identifier). Examples, int age;  double radius; char letterGrade; String userName;*  

Declare **constant**s using the syntax:

```java
            final type name = value;
```

*where **type** and **name** are the same as for variables, and **value**  is a literal value of the same type. Examples, final double PI = 3.142; final int SPEED\_OF\_LIGHT = 300; final String WELCOME = "Hello and welcome.";*  

The basic syntax for an **output** statement is:

```java
            System.out.print( output );    // prints output and remains on same line  
            System.out.println( output );  // prints output and moves to next line
            System.out.println();          // moves to next line
```

*where **output** is either a literal value (i.e. a numeric value, a character between single quotes, or any text between double quotation marks), or the name of a variable or constant. Examples, System.out.print( 21 ); System.out.println( "Welcome" ); System.out.println( age );*

The basic syntax for an **input** statement is:
```java
            variable = scan.nextInt();     // reads int value
            variable = scan.nextDouble();  // reads double value
            variable = scan.next();        // reads single word (String)
            variable = scan.nextLine();    // reads entire line(String)
```

_where ***variable*** is a memory location of the appropriate type! Examples, age = scan.nextInt(); radius = scan.nextDouble(); userName = scan.nextLine() ;_

The basic syntax for an **assignment** statement is:

```java
            variable = expression;
```

*_where_ **variable** _is a named memory location of suitable type, and_ **expression** _is either an operand (a literal value, a variable, or a constant), or a method/function call, or "operand operator operand", (where operator is +, -, \*, / or %). Examples, age = 21;_ _y_ _\= Math.sqrt( x );_ _area = 2 \* PI \* radius_ _;_*

 The basic syntax for a **program** is:  
```java
            import java.util.Scanner;

            /**
             * ___program description___
             * @author ___your name___
	     * @version ___date___
             */ 
            public class XXXX
            {
               public static void main( String\[\] args)
               {
                  Scanner scan = new Scanner( System.in);

                  // constants

                  // variables

                  // program code
              
               }

            } // end class      
  ```

_where_ **XXXX** _is the name you give to your program (and the file containing it must be named XXXX.java ). Complete the **program description** , **your name** and the **date**. Add your constants, variables & the program code below the corresponding comments and at the same indentation!_

* * *

### Some simple problems...

**(c)** Create a new project Lab02c and write a program that reads two int values from the user, computes their sum, difference, product, the result of dividing them, and the remainder after such division, then prints out the resulting values. Experiment a bit. Try changing the value of a constant. Try putting an int value into a double variable and vice versa. What happens if one or both of the values are zero or negative? What happens if the values are very large, close to their maximum possible values? What happens if you change the types of all the variables to double? Try computing the maximum and minimum of the two values using the Math.max & Math.min functions.

* * *

**(d)** Create a new project called Lab02d. Design and implement a program that computes and then reports the maximum number of flowers that can be planted in a triangular-shaped garden having sides of length **a** , **b** and **c** meters, assuming at most 17 flowers can be planted in each square meter. You can use [Heron's formula](http://web.archive.org/web/20191227213603/https://en.wikipedia.org/wiki/Heron%27s_formula) (below) to compute the area of the garden, but when computing the number of flowers, remember that partial flowers will die! _Tip:_ the Math class has a function Math.sqrt that you can use to compute the square root of a value.

![](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/triangle_withAnnotations.png)

Heron's formula: the  area of a  triangle  whose sides have lengths  **_a_** ,  _**b**_ , and  _**c**_  is

![A = \sqrt{s(s-a)(s-b)(s-c)},](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/HeronsAreaFormula2.png)

where  **_s_**  is the  semi-perimeter  of the triangle; that is

  ![s=\frac{a+b+c}{2}.](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/HeronsSemiPerimeterFormula.png)

* * *

**(e)** In yet another project, Lab02e, try to solve the following problem. _Note: Don't let the html code confuse you; as far as this problem is concerned it is simply text to be output in exactly the same way you have done for the other problems. Later on you will learn how to direct the output to a file (and get input from a file) rather than the console. You should already have an idea about html from Lab01, but if you need further help, you can always check out these [html5 tutorials](http://web.archive.org/web/20191227213603/http://www.w3schools.com/)._

A company requires that all its employees have a webpage. To date, a secretary has been asked to create each such page by hand. As a new engineer in a company's IT department you realise that the job can easily be done much cheaper, quicker and with less errors, using a computer program. Your boss thinks this is a great idea and asks you to immediately start work to design and implement such a program. The art department comes up with the stunning webpage layout shown below. You decide that the secretary should be able to run the program, input the new employee's name, their age, salary and a paragraph of comments about them, and have it automatically create and save the necessary html code in a file. This file can then be viewed using a standard web browser such as Internet Explorer, Chrome or Firefox.

The html code corresponding to the art department's sample design is shown next to it. Notice that it is just special html tags, such as ``<p> & </p>`` , with the employee's details between them. You should define named constants for each of these tags (so that they can be reused and changed easily.) Initially, design your program so that it first gets all the necessary information from the user, and then displays the corresponding html **on the system console**.  Base your implementation on the "CS101 Simple Console Application" project template, using ``System.out.println`` for output and the Scanner class for user input.

![Sample Image of company webpage](http://web.archive.org/web/20191227213603im_/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/companywebpageImage.png)  

_temp.htm_

```html
<!DOCTYPE html>  
  
<html>  
  
<head>  
<title>Derya's Home Page</title>  
</head>  
  
<body>  
  
<hr>  
<h1>Derya</h1>  
<p>Age: 18</p>  
<p>Salary: 1000.0</p>  
<p>Comments: Smart girl!</p>  
<hr>  
  
</body>  
  
</html>
```

**Once you have the output appearing correctly on the console** all that remains is saving it into a file. There are a number of ways to do this, but for now try this simple trick: Open a command prompt and navigate to the folder containing your .class file. At the command prompt run your program by typing "java _ProgramName_ > temp.htm".   This will have the effect of redirecting (sending) all the output that would normally go to the console, to the "temp.htm" file. Of course this includes the prompts when entering the information, so the user will have to guess what the program wants! Try it, examine the html output file, then go back to your program and comment out the prompts, recompile and run again from the command prompt. The resulting file should now be pure html and viewable in a web browser in all its glory!

Hopefully the company is very pleased with the result, (but now they know how clever you are they are likely to want more, so make sure you keep your program safe since you will almost certainly be asked to extend it in the future!) In the meantime, try to practice as much as possible... your textbook has lots of questions for you to try (if you run into difficulties, just ask on the CS101 moodle forums).

* * *

* * *

© 2015, 2017, 2018, 2019  David Davenport
