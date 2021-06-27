### (d) And finally...

Create another project and try the following tasks:

1.  Prompt the user to enter a character, ***ch***, and an int value, ***width***, and then print out a triangle formed using ***ch*** characters having a base of ***width*** characters. For example, if the user enters "*" and 5, it should print,

	```
	*
	**
	***
	****
	*****
	```

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
