# *Unit testing*


Before you can start with this task, you need to go over some important materials to make you understand you objective
from testing and technical perspective.


1. Notice that in you project you have pom.xml file at root project structure - this indicates that project you are using
is maven project. Please read a bit about maven here - https://maven.apache.org/what-is-maven.html , https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
For this assignment purposes you will need several maven actions:


First you need to import JUnit5 (It is testing framework for Java, we will discuss it soon) dependency into maven pom.xml file
(One of maven goals is to give you convenient way of pulling 3rd party libraries as dependencies to your project)
To do this you should find JUnit5 maven repository - https://mvnrepository.com/artifact/junit/junit/4.13
Now simply copy paste xml code in your pom.xml file as mentioned in maven-in-five-minutes.html .
After you have added this dependency to you pom.xml file, observe that you will be prompted by IDEA in lower right angle of
your IDE to import your dependencies - do it.
Now you will have all needed libraries for JUnit framework to work.


2. JUnit framework is mainly used for unit testing purposes - Unit testing is a way of testing smallest functional parts of code, units - methods.
So far you have written solid amount of methods from previous assignments so you have material to work with and get familiar with JUnit.
Here is useful material for getting familiar with JUnit basics - https://junit.org/junit5/docs/current/user-guide/
NOTE: You will have to write you tests in src.test.java package!!


HINT: Writing Unit tests can be a very challenging task, one of popular approaches to software development is called TDD - test driven development
This approach forces developers to first write unit tests for code, than run tests on empty method and verify that all tests have failed :)
(Cause if some test passes when there is no code that is not good test :D - It happens actually xaxaxa)
Then write code for method until all tests pass.
This approach enables developers to first fully understand scope of the problem they are solving before they start solving it.
As that said, you might be blinded by your own code implementation when writing unit tests for you methods and potentially miss
relevant cases - so in order to avoid this scenario hint is to collapse you method code implementation and while writing your tests
focus on your task text only and extract requirements and tests.

Task:

Create unit tests for following methods you wrote:
Assignment 1\
Task 1

Assignment 2\
Task 1, 2, 3, 4, 5

Assignment 3\
Task 1, 2, 3

Assignment 4\
Task 9, 10, 11

Question, why only these? Can other methods you wrote be unit tested?


