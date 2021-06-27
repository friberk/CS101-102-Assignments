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
