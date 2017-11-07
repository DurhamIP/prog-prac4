# Introduction to Programming

## Practical 4

### Instructions

For level 0 you need to adapt your _Calculation_ class from the previous practical. 

For levels 1-3  you should start a new bluej project.

For level 3 you may wish to download the _StringInput_ class from github and put it into your new bluej project. 

### Level 0: Exercising your code

Write a method for your _Calculation_ class from the previous practical which executes all the methods you wrote, showing

* the method name
* the inputs
* the outputs

### Level 1: Modelling a Class
Develop on paper a class diagram that represents the problem below. Your
model should consider the following points:

1. What data do you want to store? This defines the fields.
2. What operations do you want to perform? This defines the methods.


__HiLo Game__

 In this game, the player has to guess a number. For each guess,
they are told whether the number is higher or lower than their guess. The range of numbers to guess from
could be altered to make the game harder or easier. While the model should lead to a representation of the game
that a user can play, you will also consider including a computer player later on.

You should propose the following in your model of your game, making sure
you understand what each of the parts within the declarations and signatures
mean:

* Field declarations
* Method signatures
* Constructor signature(s)

Initially you will be using bluej as the user interface, so the player will start a game by calling a constructor, and make guesses by calling a method.

### Level 2: Implementing Your Model

Now try to implement the class that you modelled in above. You should do this
in a new BlueJ project, so on the BlueJ menu, select Project -> New Project
and save it in your file space.
Create a new class by selecting New Class on the left hand side. This will
give you a choice of different types of class types that can be implemented in
Java, but for the time being we are just concerned with the first type. Give
your class a name and click Ok. Remember that class name should start with an upper-case letter.

When you open the editor for the new class you will see a lot of default code
that BlueJ automatically includes to illustrate a field, constructor and method,
along with the matching JavaDoc - comments describing what the class and
methods do. While you may want to use these as a guide to get started, the
best option is to clear out the contents of the class to start with a clean sheet.


__Writing the class__

Add in the class declaration with the curly brackets that will
contain all the fields and methods for the class. Add in the fields with their data
types that you defined in your model. Pick the simplest method/constructor
first to gradually build up the functionality in your class. Compile your code often, even when the functionality is incomplete, to make sure that you have understood the syntax and that your types are consistent.

__Hint:__ To produce a random number, the following expression can be added
into a method in your class:
```
int randomNumber = (int)(Math.random() * upperLimit);
```
This expression will give you a random number from `0` to `upperLimit - 1`. If you
want the range to be from `1` to `upperLimit`, simply `+1` onto the end of the
expression.

Note: The method `Math.random()` returns a value of type double between
0 and 1. This is multiplied by the range we want to select from, and then cast
into the int data type using (int). This removes any numbers after the
decimal place so will always round down.

Once it is complete, test your program to see if you can play the game.

### Level 3: Extending Your Implementation

1. Write a _GameManager_ class that allows you to play multiple games via the console, and that records and reports the average number of guesses it takes. The provided _StringInput_ class shows how you can do input from the keyboard. Remember, when comparing two Strings use the boolean expression `string1.equals(string2)`

2. Write a _ComputerPlayer_ class that plays the game automatically. It should use its own instance of the _HiLo_ game and should report how many turns it took.

3. Adapt your _GameManager_ class so that the human player plays against the computer player, by comparing the number of guesses that each took. As well as the average number of turns that the human player takes, the _GameManager_ should also keep a score of how many games each player has won (i.e. got the answer in the fewest guesses).

4. Nobody likes to lose all the time. Make your _GameManager_ class adaptive, so that if one player is consistently doing better than the other then the game is made harder for them.

