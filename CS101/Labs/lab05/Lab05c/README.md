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