# *Basic operations*


## *1.*
An integer greater than 1 is said to be PRIME if it has no divisors other
then itself. E.g. number 7 is prime because it has no factors other than 1 and 7.
Write a method isPrime(int n) that returns true if n is prime number and false if
n is not prime number.


## *2.*
Greek mathematicians took a special interest in numbers that are equal to the sum
 of their proper divisors.(A proper divisor of n is any divisor less than n itself)
 Such numbers are called perfect numbers. E.g. 6 is a perfect number because 1 + 2 + 3 = 6
 Write method that lists n perfect numbers: listPerfectNumbers(int n);


## *3.*
Observe that algorithm from above - if you used brute force approach takes forever to find
even first 5 perfect numbers. Refactor you code so you will be able to find even some larger numbers.
HINT - For resolving this issue you must go deeper into nature of perfect numbers, notice that perfect
number is equal to multiplication of its smallest prime divisor and following smaller divisor,
example: 28 = 1 + 2 + 4 + 7 + 14 ====> 4 * 7 , 6 = 1 + 2 + 3 =====> 2 * 3


## *4.*
Java has its own convenient class for generating random numbers - Random from java.util
package. Random class exports methods that generate random integers, doubles and so on.
e.g.
Random rand = new Random();
int number = rand.nextInt(1000); // Will return integer in range 0 to 999

What is not good is that this class doesn't provide us convenient usage for practical programming
purposes - e.g. what if we want to generate random integer in interval of 100 - 200 ?

Create class named MyRandom that will wrap functionality of Random generator and provide following
methods:

1. getInteger(int min, int max) - Returns integer in interval [min, max]
2. getChance(double p) - p is in interval [0, 1] and will return true with probability p
3. getDouble(double min, double max) - Returns double in interval [min, max]

e.g. if p = 0.4 it will return true with probability 0.4 and false with probability 0.6

NOTE: This might be a tricky assignment, start with simplest approach and try testing your implementation
with large number of iterations - e.g. getChance(double p) with p = 0.5 can be tested if we generate N
number of boolean values and monitor if num of true and false values is near 50 : 50...


## *5.*
Since you now have nice way of generating random numbers, lets put this implementation to use!
Very useful and interesting way of using random numbers is in simulations. Imagine that you have dart
board hanging on your wall. It consists of a circle painted on a square back. If you throw darts at this
board in a random fashion, come will fall inside circle. If the tosses are truly random the ratio of the number
of darts that land inside the circle to the total number of darts falling anywhere inside the square
should be roughly equal to the ration between two areas. The ration of the areas is independent of the
actual size of the dart board, as in following formula:

area_of_circle / area_of_square = PI * r * r / 4 * r * r = PI / 4

To simulate this process in a program, imagine that dart board is drawn in the standard Cartesian coordinate
plane. You can model the process of throwing a dart randomly at the square by generating two random numbers
x and y all between -1 and 1 . This (x, y) point always lies somewhere inside the square. The point (x, y)
lies inside the circle if x * x + y * y < 1
If you perform simulation many times and compute fraction of darts that fall within the circle the result
will be somewhere near PI / 4 .
Write a program that simulates throwing 10000 darts and then uses simulation to compute approximate value of
number PI (It can be accurate up to several decimal points, depending on number of iterations)

This is basic idea of so called "Monte-Carlo" simulation that is used for simulating various random processes.