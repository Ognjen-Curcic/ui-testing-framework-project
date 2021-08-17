# *String manipulation*


## *1.*
Write a method randomWord that returns randomly constructed "word" consisting of randomly chosen letters.
Number of letters in word should be chosen randomly between parameters min and max.


## *2.*
Write a method that checks if sentence is palindrome. Your program should consider letters only in sentence:
e.g. for input "Madam, I'm Adam." it should return true.


## *3.*
Write a method createRegularPlural(word) that returns the plural of word formed by following these standard
English rules:\
a) If the word ends in s, x, z, ch add e2 to the word\
b) If the word ends in y and y is preceded by consonant, change y to ies\
c) In all other cases add just an s


## *4.*
Write a method createPresentParticiple that takes English verb which you may assume is at least two characters
long and form present participle out of it using following rules:\
a) If the word ends in an 'e' preceded by a consonant, take the e away before adding 'ing' suffix. Thus move becomes moving
If the 'e' is not preceded by a consonant, it should remain in place, so that see becomes seeing\
b) Of the word ends in a consonant preceded by a vowel, insert an extra copy of that consonant before adding the 'ing' suffix
Thus 'jam' should become 'jamming'. If however there is more than one consonant at the end of the word, no such doubling takes\
place, so that walk becomes walking.
c) In all other circumstances, simply add the 'ing' suffix


## *5.*
Create method addCommas(digit) that will return String version of that number with commas added on proper places:\
e.g. 1000 should become 1,000\
e.g. 1000000 should become 1,000,000


## *6.*
Implement a method: private String longestWord(String line); That will return longest word found in line.
Where word is defined as consecutive string of letters. Overload this method so it can take filepath as parameter
and return longest word from given .txt file.


## *7.*
One of the simplest types of codes used to make it harder for someone to read a message is a letter-substitution cipher,
in which each letter in the original message is replaced by some different letter in the coded version of that message.
A particularly simple type of letter-substitution cipher is a Caesar cipher—so named because the Roman historian Suetonius
records that Julius Caesar used such a cipher—in which each letter is replaced by its counterpart a fixed distance ahead in
the alphabet. A Caesar cipher is cyclic in the sense that any operations take shift a letter beyond Z simply circle back
to the beginning and start over again with A. As an example, suppose that you wanted to encode a message by shifting every letter
ahead four places. In that Caesar cipher, each A becomes an E, B becomes F, Z becomes D (because it cycles back to the beginning), and so on.
To solve this problem, you should first define a method private String encodeString(String str, int shift) that returns
a new string formed by shifting every letter in str forward the number of letters indicated by shift, cycling back
to the beginning of the alphabet if necessary.
Test run of method can be:

   Enter the number of character positions to shift: 13\
   Enter a message: This is a secret message.\
   Encoded message: Guvf vf n frperg zrffntr.

   Note that the coding operation applies only to letters; any other character is included unchanged in the output.
   Moreover, the case of letters is unaffected: lowercase letters come out as lowercase, and uppercase letters come out as uppercase.
   Write your program so that a negative value of shift means that letters are shifted toward the beginning of the alphabet
   instead of toward the end, as illustrated by the following sample run:

   Enter the number of character positions to shift: -1\
   Enter a message: IBM 9000\
   Encoded message: HAL 9000


## *8.*
The initial state of a checkers game is shown in the following wiki - https://en.wikipedia.org/wiki/Draughts
The dark squares in the bottom three rows are occupied by red checkers; the dark
squares in the top three rows contain black checkers. The two center rows are
unoccupied.
If you want to store the state of a checkerboard in a computer program, you need a
two-dimensional array indexed by rows and columns. The elements of the array
could be of various different types, but a reasonable approach is to use characters.
For example, you could use the letter r to
represent a red checker and the letter b to represent a black checker. Empty squares
can be represented as spaces or hyphens depending on whether the color of the
square was light or dark.
Implement a method initCheckerboard that initializes a checkerboard array so that
it corresponds to the starting position of a checkers game. Implement a second
method displayCheckerboard that displays the current state of a checkerboard on
the console, like this:

     b b b b
    b b b b
     b b b b
    - - - -
     - - - -
     r r r r
    r r r r
     r r r r