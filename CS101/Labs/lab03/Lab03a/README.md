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
