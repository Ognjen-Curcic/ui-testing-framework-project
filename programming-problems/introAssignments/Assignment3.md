# *Arrays and Lists*

## *1.*
A magic square is a two dimensional array of integers in which rows, columns and diagonals
all add up to the same value. Implement method isMagicSquare that tests to see if NxN array
contains a magic square.
Magic square example:
| | | |
|-|-|-|
|8|1|6|
|3|5|7|
|4|9|2|


## *2.*
Overload method from previous assignment so that it uses ArrayList as parameter instead of regular array[][].


## *3.*
In Sudoku you start with a 9x9 grid of numbers in which some cells are filled with digits between
1 and 9. Your job in the puzzle is to fill in each of the empty spaces with a digit between 1 and 9
so that each digit appears exactly once in each row, each column and each of the smaller 3x3 squares.
Each Sudoku puzzle is carefully constructed so that there is only one solution.
Write a method "private boolean checkSudokuSolution(int[][] grid)" that performs check and
says if provided solution is valid sudoku solution.
Example of valid sudoku solution:

| | | | | | | | | |
|-|-|-|-|-|-|-|-|-|
|3|9|2|4|6|5|8|1|7|
|7|4|1|8|9|3|6|2|5|
|6|8|5|2|7|1|4|3|9|
|2|5|4|1|3|8|7|9|6|
|8|3|9|6|2|7|1|5|4|
|1|7|6|9|5|4|2|8|3|
|9|6|7|5|8|2|3|4|1|
|4|2|3|7|1|9|5|6|8|
|5|1|8|3|4|6|9|7|2|


## *4.*
Overload method from previous assignment so that it uses ArrayList as parameter instead of regular array[][]


## *5.*
Greek astronomer Eratosthenes developed and algorithm for finding all prime numbers up to some upper
limit N long time ago :D . To apply this algorithm you start by writing down a list of integers between 1 and N.
You then circle the first number in the list, indicating that you have found a prime. Whenever you mark a number
as prime, you go through the rest of the list and cross off every multiple of that number, since none of those
multiples can itself be prime. Thus after executing first cycle of algorithm, you have circled the number 2 as prime
and crossed off every multiple of 2 - 4, 6, 8, 10, 12, 14, 16, 18, 20.
To complete the algorithm, you simply repeat the process by circling the first number in the list that is neither
crossed off nor circled and then crossing off its multiples.
Eventually every number in the list will either be circled or crossed out. The circled numbers are primes the crossed-out
numbers are composites.
Write method: primesEratosthenes(int N) that prints out all primes <= N in console using algorithm above.

Example of algorithm steps:

First, generate a list of integers from 2 to 20:

| 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |
|---|---|---|---|---|---|---|---|----|----|----|----|----|----|----|----|----|----|----|

The first number in the list is 2; cross out every 2nd number in the list after 2 by counting up from 2 in increments of 2 (these will be all the multiples of 2 in the list):

| 2 | 3 | X | 5 | X | 7 | X | 9 | X | 11 | X | 13 | X | 15 | X | 17 | X | 19 | X |
|---|---|---|---|---|---|---|---|---|----|---|----|---|----|---|----|---|----|---|

The next number in the list after 2 is 3; cross out every 3rd number in the list after 3 by counting up from 3 in increments of 3 (these will be all the multiples of 3 in the list):

| 2 | 3 | X | 5 | X | 7 | X | X | X | 11 | X | 13 | X | X | X | 17 | X | 19 | X |
|---|---|---|---|---|---|---|---|---|----|---|----|---|---|---|----|---|----|---|

The next number not yet crossed out in the list after 3 is 5, cross out every 5th - notice that now you have only left with primes that are not crossed out in your array


## *6.*
Overload method from previous task so that it will use Java collection class ArrayList as parameter instead of plain array.


## *7.*
When working on assignments 2, 4, 6 you have probably noticed how inconvenient is to use ArrayList in representing
two dimensional arrays - probably the data structure you have used is ArrayList< ArrayList < DataType> >
To make your life easier you can implement following data structure: MyGrid < T > - read a bit about generic data structures in java:
https://www.tutorialspoint.com/java_generics/java_generics_classes.htm
https://www.geeksforgeeks.org/generics-in-java/

Implement MyGrid < T > class that will have following methods:

*Constructors:*

MyGrid < T > (int size) - With only one size paramter will create new grid that is square - size x size\
MyGrid < T > (int height, int width) - Will create new rectangular grid

*NOTE:* Constructors will initialize empty skeleton of your grid with all values null

*Public methods:*

*T get(int x, int y)* - It will get T object on x, y location of your grid - HINT: When user tries to select value that is outside of grid
present him with custom message, don't rely on IndexOutOfBounds generic exception.

*void put(T value, int x, int y)* - It will put T value on x, y location of your grid - HINT: Take care of case where x and y are
outside of boundaries of you grid

*void erase(int x, int y)* - It will erase value at x, y location by putting null value

*void erase()* - It will empty your grid by putting all values to null

*void resize(int a)* - It will resize your square ONLY grid by adding 'a' number of rows and columns - HINT: If this method is called
on non squared grid object throw an Exception
NOTE: New fields should have null values as default

*void resize(int a, int b)* - It will resize non-square grid by adding a number of rows and b number of columns - HINT: This method should
work for both square and non-square grids
NOTE: New fields should have null values as default.

Consider two possible approaches for internal data structure your generic class will use:
Usage of T[][] regular array or ArrayList< ArrayList < DataType > > - what are pros and cons of both of these approaches??


## *8.*
Now that you have created your own MyGrid generic data structure, revisit assignments 2, 4, 6 and overload methods so
they will use you class - Observe how method implementation has changed with all three approaches you used for solving these
problems.