**(b) Library Books**

Create a class, LibraryBook, that  represents an individual book that can be borrowed from the library. It should have properties: **_title, author, dueDate,_** and **_timesLoaned_** (for now, make title, author and the dueDate, *String*s, and the timesLoaned an _int_). Provide an appropriate constructor and a toString method. Write another class, say TestLibraryBook, to demonstrate your LibraryBook class by creating a few instances of LibraryBook and displaying them on the console.

Once this is working, add methods to loan the book and have the book returned. When loaning a book, you will need to specify the new dueDate, and increment the number of timesLoaned. When the book is returned you should simply reset the dueDate to an empty string. Provide two further methods, ``int getTimesLoaned()`` and ``boolean onLoan()``, then modify your TestLibraryBook class to demonstrate these new methods.
