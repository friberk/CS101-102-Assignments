**Lab No. 8 \- Object vs. Reference**

Fall 2020/2021

### Introduction

Programming language constructs should match our real-world intuitions, even if our intuitions are not always that intuitive! This is especially so when distinguishing object and reference, something we do so naturally we hardly notice it. This lab should help you understand and use this distinction in your programs.

A non-primitive variable, while often said to hold an object, is actually a reference to the object (that is, rather that holding the data itself, it holds the address of the data). Several variables can thus refer to the same object. For example:

```java
ClassName x, y;                     // declare variables x & y of the same type

x = new ClassName( _parameters_);   // create the object & make x refer to it  
y = x;                              // then make y refer to the same object as x  

x.setProp(z);                       // setting a property via x now results in y  
                                    // having the same value, and vice versa.
```

The distinction between object & reference, gives rise to two interpretations of equality/sameness:

```java
x == y                              // true only if x and y both refer to a single unique object,  
                                    // false if they refer to two distinct objects
 
x.equals(y)                         // by convention, true if the relevant properties of x and y  
                                    // have the same values, and false otherwise.
 ```

And to a distinction between copying references and copying (cloning) objects:

```java
x = y;                              // copies references, such that x and y refer to a single object  
                                    // (no new object has been created)  

y = x.clone();                      // creates a second object with identical properties to x  
                                    // and makes y refer to the newly cloned object.  
  
y = new ClassName( x);              // a so-called copy constructor may also be used to  
                                    // create a clone.
```

_Note:_ all Java classes automatically have ``.equals`` and ``.clone`` methods, however, as with the ``.toString`` method, they probably do not do what you want, and so will need to be explicitly written.

Finally, non-primitive variables can be assigned the special value _null_, indicating that they do not refer to any object. Attempting to access a property or method of a variable that does not refer to an object results in a exception. You can check whether a variable does refer to an object or not, by comparing it to _null_.

```java
x = null;                           // puts (object default) value null into x  
                                    // (x no longer refers to any object)  

x.anyMethod();                      // exception if x is null!  
  
x == null                           // returns true if x contains null (i.e. does not refer to an object).
```

You can do the following in a single project within your lab08 workspace.

_Note:_ Now that assignments involve multiple source code files, organising your work becomes ever more important. Make sure you are familiar with and using your IDE's "project" features properly; see [UsingDrJava](http://web.archive.org/web/20191227215305/http://www.cs.bilkent.edu.tr/%7Edavid/cs101/practicalwork/Using-DrJava/UsingDrJava.doc) from Lab02. In particular, you should be able to demonstrate:

_**(a)**_ using a separate "build" folder, e.g. _classes_, for all the _.class_ (bytecode) files in your project, and

**_(b)_** setting the "main class" project option so that DrJava will run it by default, even if you are viewing/editing a different file.

**_(c)_** leaving the main class --the one with the main method-- in the default package, but moving all the other classes into a separate package. You might also try moving the main class into another, completely different, package.

* * *

**Library Books again**

First, copy your LibraryBook and TestLibraryBook files from _lab07b_, into the new _lab08_ project folder.

Next, without changing the LibraryBook class, add code to the main method so as to compare two LibraryBook instances using == and ``.equals``. Make sure your test data includes all three possible alternatives, that is (a) two references to a single object, (b) two references to two individual objects with different properties, (c) two references to two individual objects with identical relevant properties. Notice that your program compiles(!) and runs, and that both comparisons give the same results in all cases. Can you explain why?

Next add a ``.equals`` method to your LibraryBook class, so that books with the same title and author are considered the same (irrespective of their dueDate or timesLoaned). Run the program again, demonstrate & explain any changes in output from the previous run.

Finally, add a copy constructor and two other methods, ``hasSameTitle`` and ``hasSameAuthor``, to your LibraryBook class. Both methods should take a LibraryBook as a parameter and return a boolean value. Check they are all working correctly before moving on.

* * *

**The Library**

Create a new class called Library, with four LibraryBook properties: b1, b2, b3 & b4. Its constructor should create an empty library (by initialising the four properties to null). Include the following instance methods:

*   ``isEmpty()`` ~ returns true iff there are no books in the library
*   ``toString()`` ~ returns a String representation of the library, one book per line (or a message if library is empty)
*   ``add( title, author)`` ~ adds a new book --with the given title and author-- to the first available (null) property
*   ``remove( book)`` ~ removes the specified book from the library by setting the property to null, returns false if book not in library
*   ``findByTitle( title)`` ~ returns the first book with the given title or null if no such book is found.

Write a program, LibraryTest, that allows the user to manage a library by selecting options from a menu that includes: Show, Find, Add, and Exit. If the Find option locates a book with the requested title it should show it to the user and then allow them to Loan it, Return it, or Remove it from the library, or simply exit back to the main menu.

* * *

* * *

© 2019, 2018, 2017 & 2015, David Davenport