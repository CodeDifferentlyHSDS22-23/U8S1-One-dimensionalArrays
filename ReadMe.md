# U7S1 One-dimensional Arrays

* Part A - Foundations 8.1
* Part B - Foundations Practice
* Part C - Algorithm Challenge
## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `Array` 

#### Step 02

* Review code. What do you think the output will be? Run the code to verify your thoughts.

#### Step 03
* Modify the program to implement …
  * Declare a one-dimensional array named score of type int that
  can hold 9 values
  * Declare and initialize a one-dimensional byte array named
  values of size 10 so that all entries contain 1
  * Uncomment the two lines that are commented out and then
  resolve the syntax errors

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `ComputeAvg`

#### Step 02

* Modify the program to implement …
  *  In a certain class, there are five tests, each worth 100 points
  * Input five test scores from the console
  * Store the test scores in an array
  * Calculate the student’s average scores
  * Test the program by inputting the following test scores: 100,97,60,75,89 

Your program is working correctly, if when run, the following is the output:
```

The student's average score is: 84.2

```

### Exercise 03

#### Step 01

In the package `partA.ex03` look at the file `ArrayEx2`

#### Step 02

* Perform the following:
  * Run the program and observe the error
  * Modify the program to resolve the error
  * Using a for-each loop, display all browsers that are stored in
  the array

## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `ArraySampleExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `Array` per the following:

        Create a program with an array with any amount of elements
        Per the sample output below, print out each element in order to the console

Your program is working correctly, if when run, the following is the output:
```

Accessing Elements of Array:
First Element: 12
Second Element: 4
Third Element: 5
Fourth Element: 2
Fifth Element: 5

```

> Use ArraySampleExample for reference.

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `LoopArrayExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `ArrayLoop` per the following:

        Create a program with an array which contains four unique strings
        Utilize a loop to print out each of the unique values to the console

Your program is working correctly, if when run, the following is the output:
```
Mikasa
Eren
Levi
Armin

```

> Use ArrayLoopExample for reference.

### Exercise 03

#### Step 01

In the package `partB.ex03` look at the file `FixMe` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex03` complete the `FixThisLoop` per the following:

        Create a program that returns the lowest value (minimum number) contained within an array of numbers
        Create an array of numbers containing at least 10 unique values
        Initialize a way to save the current minimum value
        Create a loop to help you iterate through the array
        Have a logical check (HINT: IF) to see if the current index of the array is less than the minimum value you initialized, if it is,
            be sure to re-assign the minimum value so that you keep the minmum
        Print out "The minimum of this array is: " then whatever the value is. Look at the sample below

Your program is working correctly, if when run, the following is the output:
```
The minimum of this array is: -20

```

> Use FixMeExample for reference.

## Part C

### Problem 24
Every string needs to begin with "not", in order to do that you need to add "not" to the beginning of a provided string.
But if the string already begins with "not" we will leave it alone, no need to have a "not not".

Return a new string where "not" has been added to the front.

Tip: Use .equals() to compare 2 strings

Example:
```java
beginWithNot("candy") --> "not candy"
beginWithNot("x") --> "not x"
beginWithNot("not bad") --> "not bad"
```
### Problem 25
The most popular number today is 3. We need the first 3 characters of a string, and we need to make
3 copies of those 3 characters. The front of a string is considered those 3 characters. The front can
be less than 3, just need to provide whatever is there.

Return a new string which is 3 copies of the front of the string.

Example:
```java
popular3("Java") --> "JavJavJav"
popular3("Chocolate") --> "ChoChoCho"
popular3("abc") --> "abcabcabc"
```
