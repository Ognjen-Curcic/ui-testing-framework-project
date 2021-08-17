# *Collections and data structures*

In previous assignments you had the opportunity to work with dynamic array collection - ArrayList < T >
Here we will revisit other interesting data structures from java collection libraries.
You can refresh your knowledge about collection classes in Java here - https://www.javatpoint.com/collections-in-java


## *1.*
In the game of Minesweeper, a player searches for hidden mines on a rectangular grid. One way to represent this grid
in Java is to use a grid of Boolean values marking mine locations, where true indicates the location of a mine. In
Boolean form this sample grid looks like this:


| | | | | | |
|-|-|-|-|-|-|
| T | F | F | F | F | T |
| F | F | F | F | F | T |
| T | T | F | T | F | T |
| T | F | F | F | F | F |
| F | F | T | F | F | F |
| F | F | F | F | F | F |

Given such a grid of mine locations, write a method:

void fixCounts ( MyGrid < Boolean > mines, MyGrid < Integer > counts);

That creates a grid of integers storing the number of mines in each neighbourhood. The neighbourhood of a location includes
the location itself and the eight adjacent locations, but ONLY if they are inside boundaries of the grid, reference parameter counts
is used to store the result. Your job here is to make sure that it (MyGrid<Integer> counts) has same size as MyGrid<Boolean> mines
grid and then to assign to each element an integer between 0 and 9.
For example mines grid for example above would have following values:

| | | | | | |
|-|-|-|-|-|-|
|1|1|0|0|2|2|
|3|3|2|1|4|3|
|3|3|2|1|3|2|
|3|4|3|2|2|1|
|1|2|1|1|0|0|
|0|1|1|1|0|0|


## *2.*
Write a method that uses Stack structure to reverse a sequence of integers read from the console
(See how to read integers from console - https://www.tutorialspoint.com/read-integers-from-console-in-java)
Example run of this method should look like this:

Enter list of integers, end input with 0:\
? 34\
? 23\
? 65\
? 0

Integers in reverse order are:\
65\
23\
34


## *3.*
Write a method: void reverseQueue( Queue < String > queue ); that reverses the elements in the queue. Remember that you
don't have access to the internal representation of the queue and must therefore come up with algorithm that might
use some other data structure to perform this task.


## *4.*
Telephone numbers in America and Canada are organized into various three digit area codes. A single state or province will
often have many area codes, but a single area code will not cross state boundary. This rule makes it possible to list the
geographical locations of each area code in data file. For this task,  you have access to the file "AreaCodes.txt" placed
in root folder of this project - It lists all the area codes paired with their locations.

Write a method to read this file into a Map < Integer, String > structure where key is the area code and the value is location.
After you've read this data, write a method that repeatedly asks user for an area code or location name and then looks for the
corresponding location or area code.
Your test run should look like this:

Enter area code or state name: 201\
New Jersey\
Enter area code or state name: 206\
Washington

As prompt suggests your program should also allow for user to enter name of the state and get all are codes that match it:

Enter area code or state name: Oregon\
458\
503\
541\
Enter area code or state name: Manitoba\
204


## *5.*
When you wrote a program from previous task you probably generated the list of area codes for a state bt looping through
the entire map and printing out and area codes that mapped to that state. This strategy is ok for small maps, efficiency might
become an issue in working with much larger collections of data. This strategy also feels very asymmetric - when you want to
translate an area code to a state name, you ask the map and it gives you the answer immediately, translating in the opposite
direction requires a lot more work.

What you would like to do is INVERT the map so that you could perform lookup operations in either direction. You can't however
declare the inverted map as a Map < String, Integer > because there is ofter more that one area code associated with a state.
An Integer can't hold all the necessary information. A better strategy is to make the inverted map a Map < String, List < Integer > >
Create new method that creates inverted map after reading data file and then uses that map to list the area codes for a state as
in previous task.
