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

When the number of characters needed to output the "row,col" numbers increases, the number of spaces/stars can be reduced accordingly, such that the columns still look neatly aligned to the right (assuming every character has the same width!) For example, "5,12" has 4 characters and would thus require only 2 additional stars ``~"**5,12"~`` to give 6 characters overall, while "10,12" has 5 characters and would require only 1 extra ``~"*10,12"~``.

Rather than rely on tabs or using Java's built-in printf / formatting features for such spacing, try doing it yourself. _Hint:_ construct a String that has the "_row,col_" values for the current cell, then, in a loop, add space characters to the String, so as to align it appropriately within the desired column width, before finally outputting the String and starting again with the following cell.

Copy-paste the relevant segment of your code four times, such that your program produces four tables (precede each by an appropriate title), and then modify the copies so they each display one of the following:

1.  the row & column numbers as shown in the example
2.  the product of the row & column number (a multiplication table!)
3.  the cell number beginning from 0 and increasing left to right, top to bottom  
    (i.e. 0,1,2,3 on the first row, 4,5,6,7 on the next, and so on).
4.  the row number in the first column only, putting the String "-" into the other cells.  
    (i.e. 1,-,-,- on the first row, 2,-,-,- on the second, and so on).
