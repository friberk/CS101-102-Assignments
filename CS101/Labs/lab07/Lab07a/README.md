**(a) Die & Dice games**

Gambling is addictive and can easily cause you to lose a lot of money. Programming can also be addictive, but if you become proficient at it you can actually gain a lot of money! The following exercise allows you to indulge in both addictions without immediately changing your monetary situation. Its long term effects are up to you.

_The old way..._

(1) Write a class with a main method that simulates the rolling of dice (i.e. two die). Use the ``Math.random()`` method to generate random values between 1 & 6. Your program should continue rolling the dice until two sixes are thrown, at which point it should stop and report the number of rolls it made.

(2) Think about how you could extend your program to simulate the rolling of two pairs of dice. How about ten pairs of dice? How could you (re)use this code as part of a more sophisticated game; monopoly or craps, for example?

_The new Object way..._

(3) Write a Die class having a single _int_ property that represents the current face value of the die. Have a roll method that again uses the ``Math.random()`` method to generate a new value for the die and also returns it. Have a ``getFaceValue()`` method to return the current face value of the die. Test this class by writing a TestDie class with a main method that creates a Die object and calls its methods. What happens if you simply print each object, e.g ``System.out.println( die1);``. Modify TestDie so that it creates and tests two Die objects. Add a ``toString()`` method to your Die class. Does anything change?

(4) Implement and test a Dice class that uses two Die objects. Provide a method to roll both die together and return the result (a value between 2 and 12 inclusive), as well as ``getDie1FaceValue()``, ``getDie2FaceValue()``, ``getDiceTotal()`` and ``toString()`` methods.

(5) Using an instance of your Dice class, implement the same game as in part (1) above. Write a DiceGame class whose only property is the dice and whose only method is ``play()``. This method should return the number of times the dice had to be rolled before a double six occurred. Write a TestDiceGame class that has a main method that creates an instance of the DiceGame class and calls its play method then prints the result.
