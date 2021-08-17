# *Sorting and algorithms*


## *2.*
Implement selection sort algorithm that sorts array of integers - selection sort idea:
Start with first element in array and put your left finger on it - it will be left hand side
Now find smallest integer in the remaining of array - when you find it put you right finger
on it - it will be right hand side, now swap these two numbers (From lhs and rhs). After first
iteration first number in array is smallest one and is now on correct place. Now take second
element and perform step from above, continue until you reach end of array.


## *3.*
Overload method from above to use ArrayList instead of an array.


## *4.*
Overload method from assignment 1 to sort MyGrid you have implemented previously.


## *5.*
Another sorting algorithm—insertion sort—operates as follows. You go through each element in the array in turn,
as with the selection sort algorithm. At each step in the process, however, your goal is not to find the smallest value remaining value and
switch it into its correct position, but rather to ensure that the values you’ve covered so far in the array are correctly
ordered with respect to one another. Although those values may shift as more elements are processed, they form an ordered sequence in
and of themselves. For example, the first cycle of the insertion sort algorithm requires no work because an array of one
element is always sorted: 31 41 59 26 53 58 97 93
The next two cycles of the main loop also require no rearrangement of the array, because the sequence 31-41-59 forms an ordered sub array.
The first significant operation occurs on the next cycle, when you need to fit 26 into this sequence. To find where 26 should go,
you need to move backward through the earlier elements, which you know are in order with respect to each other, looking for
the position where 26 belongs. At each step, you need to shift the other elements over one position to make room for the 26,
which winds up in position 0. Thus, the configuration after the fourth cycle is: 26 31 41 59 53 58 97 93
On each subsequent step, you again insert the next element in the array into its proper position in the initial sub array,
which is always sorted at the end of each step. The insertion sort algorithm is particularly efficient if the array is already more or
less in the correct order. It therefore makes sense to use insertion sort to restore order to a large array in which
only a few elements are out of sequence.


## *6.*
Overload selection and insertion sort algorithms so they can sort array and ArrayList of Strings.


## *7.*
In the 1940s, IBM introduced a electromechanical device called a sorter. The sorter
was a large machine with a hopper on one end into which the operator would load a stack
of punched cards. When the machine was activated, it would take cards from the hopper
one at a time and distribute them among a set of numbered output areas—which I’ll call
buckets—depending on what value was punched in a particular column on the card. If
the sorter, for example, were set to look at column 1, the card shown in the diagram
above would be sent to bucket #4, because column 1 is punched in digit position 4. If the
card were sorted on column 2 instead, the card would end up in bucket #2.
You could clearly use the sorter to arrange cards containing one-digit numbers into
ascending order. You just take the entire stack of cards and run it through the sorter. If
you then pick up the cards from bucket #0, followed by the cards in bucket #1, followed
by the cards in bucket #2, and so on up to bucket #9, the values on the cards will be in
sorted order. Suppose, however, that the numbers you were sorting contained more than
one digit. How could you use the sorter to put these cards in order by the entire
multi digit numeric field?

The fundamental insight that made the IBM sorter so useful—and the key to the radix
sort algorithm—is that a set of multi digit numbers can be sorted by making several passes
through the sorter, one for each column in the number. The trick is that the sorting
operation must start with the last digit of the number and then proceed toward the first.
For example, to sort a set of cards containing two-digit numbers in columns 1 and 2, you
would first sort the data on column 2, collect the individual buckets of cards together, and
then sort again on column 1.
This process is best illustrated by example. Suppose that the data on the cards
consisted of the following 15 values:

42, 25, 37, 58, 95, 25, 73, 30, 54, 21, 17, 58, 34, 43, 98

The first pass through the sorter would arrange these into ten buckets based on the second
digit, resulting in the configuration shown below:

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|  |  |  |  |  |25|  |  |58|  |
|  |  |  |43|34|95|  |17|98|  |
|30|21|42|73|54|25|  |37|58|  |


You then pick up the cards from each bucket in turn, being careful to preserve the order
of cards within each bucket. This process leaves the cards arranged in the following
sequence:

30, 21, 42, 73, 43, 54, 34, 25, 95, 25, 37, 17, 58, 98, 58

You then send this new stack of cards through the sorter, this time dividing up the cards
based on the first digit of the number, which is punched in column 1. This process results

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|  |  |25|37|  |58|  |  |  |  |
|  |  |25|34|43|58|  |  |  |98|
|  |17|21|30|42|54|  |73|  |95|

If you then collect these cards from the buckets in order, the sequence is

17, 21, 25, 25, 30, 34, 37, 42, 43, 54, 58, 58, 73, 95, 98

which is correctly sorted from smallest to largest. The same strategy works for numbers
of any length as long as you start with the last digit position and work your way toward
the first digit position. This algorithm works because the cards that end up in each bucket
are in the same relative order as they were in the original stack. Thus, when the final step
sorts the numbers based on their first digit, the values end up sorted within each bucket
just as they were at the end of the preceding step, when they were put in order by the next
most significant digit.

Coding the radix sort algorithm is more difficult than coding selection sort, but it is not
too hard if you choose a good decomposition. Using radix sort, the sortIntegerArray
function itself has the following pseudo code form:

NOTE: n is helper parameter that says to your algorithm how much digits largest number in your array has!

private void sortIntegerArray(int[] array[], int n) {\
 for (each digit position starting at the right) {\
 //Fill up the individual buckets with values from array\
 //Reassemble array by taking the contents from each bucket in turn\
 }\
}

Implement this method using the idea above.


## *8.*
Overload algorithm method from above to use ArrayList instead of int[]


## *9.*
Write a predicate method isSorted(array) that takes an integer array and returns true it the array is sorted in
non-decreasing order.


## *10.*
One important statistical measure is the median, the data value that occupies the central element position in a
distribution whose values have been sorted from lowest to highest. If the distribution contains an even number of values
and therefore has no central element, the standard convention is to average the two values that fall closest to the midpoint.
Write a method median(array) that returns median of an array of doubles. Your implementation may not assume that the array
is sorted nor it may change array in any way, although it may create a copy of the array.


## *11.*
One more interesting statistical measure is called mode, the value that occurs most often in an array. e.g.
array 65, 84, 95, 75, 82, 79, 82, 72, 84, 94, 86, 90, 84 has mode value 84 since number 84 appears 3 times.
Write method mode(array) that returns the mode of an array of doubles. If there are several values that occur equally
often and outnumber any of the other values your method may return any of those values. As in previous assignment your
implementation may not assume that the array is sorted or change the order of its elements.


## *12.*
Many algorithmic problems are related to sorting in their solution structure. For example, you can shuffle an array
by “sorting” it according to a random key value. One way to do this is to begin with the selection sort algorithm and then replace the
step that finds the position of smallest value with one that selects a random position. The result is a shuffling algorithm
in which each possible output configuration is equally likely. Write a program Shuffle that displays the integers between 1 and 52 in a randomly
sorted order.


## *13.*
There are several ways of testing sorting algorithms. Easiest one is to count number of iterations needed
for successful sort, second and less reliable is to count time system took to sort an array (It won't provide relevant
results for small data sets that takes blink of an eye to sort). Test your previous sorting implementations by counting
number of iterations and system time that takes to sort it. Play with various array sizes and compare results.