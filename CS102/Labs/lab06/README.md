# CS102 - Algorithms and Programming II

## Lab 06

**Lab Objectives:** Recursion

Notes:
* For all labs in CS 102, your solutions must conform to these [CS101/102 style
guidelines](http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm).
* Create a Java Project named Lab06. Put all of your classes in this project.
* Remember to include **javadoc comments** for each class and method.
* Upload your solution as a single .zip file to the Lab06 assignment by the end of your section’s lab session in the week of April 12. You must use the following naming convention: Lab06_Surname_FirstName.zip where Surname is your family name and FirstName is your first name. You may upload multiple times; the last upload will be considered.

## Introduction

_Recursive methods are typically very short. The real challenge is to come up with the solution in the first place. You are thus strongly advised to spend time solving such problems yourself. That way you will have more chances of answering the final exam questions! Of course, you must also be able to accurately trace recursive ~and non-recursive~ methods. Be sure to check the textbook for worked examples and questions._

**(a)** Write a recursive method that computes a new string where all occurrences of the character "r" in an input string have been removed.

**(b)** Write a recursive method that takes a decimal value as an int parameter and returns the hexadecimal equivalent of it as a string. For example, if your method is passed the integer value 1249 (base ten) it should return the string "4E1".

**(c)** Suppose you have an ArrayList of Strings. Write a recursive method that returns true if the strings in the array are in lexicographic (effectively alphabetic) order, and false otherwise.

**(d)** Write a recursive method that prints its String argument in reverse direction.

**(e)** Write a recursive method that enumerates and prints all n-digit even numbers in which each digit of the number, from its most-significant to least-significant digits, is greater than the previous one (that is, for instance, the number 124 is ok, but the number 142 is not,
since 2 is less than 4). Make sure your program prints each number just once. For example, if n=3 it should print 124 126 128 134 136 138 146 148 156 and so on up to 999. Hint: If you had a method that checked whether a number meets the stated criteria or not, you could use it to filter the candidate values you generated recursively, printing only those that meet the criteria ~ideally the criteria checking method would also be recursive.
