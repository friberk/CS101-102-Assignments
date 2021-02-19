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