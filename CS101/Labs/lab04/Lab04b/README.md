### (b) Processing data...

Write a program, Lab04b, that will read exactly ***n*** integer values from the user, adding each value to a sum and simultaneously counting them; then, after the last one has been processed, report their sum and count. The value of ***n*** should be fixed, e.g. 6, and any values that are entered after the ***n***'th one should be ignored. _Note: you do not need to store the values read from the user; simply process each one as it is read!_

In the same folder as your .class files, create a text file, ``testdata.txt``, containing some test data, e.g. the values \[2, 9, 4, 27, 15, 4, 12\], one value per line.

Open a command prompt and navigate to the folder containing your class file. From the command prompt, run your program by typing the command ``java Lab04b  <  testdata.txt``, which should cause your program to read its input from the specified file, rather than the keyboard. It will still output its results to the command prompt. _Note: you can have your program read data from one file and send the output to another file --as you did in the previous lab assignments-- by typing ``java Lab04b < testdata.txt > results.txt`` Try it, then open ``results.txt`` to see what happened!_

Download and [save this text file](http://web.archive.org/web/20191227214711/http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab04/realdata.txt), then modify your program so that it finds the average, minimum and maximum, of the first 100 values.
