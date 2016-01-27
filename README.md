# counting-game

## Homework 1 - Part 1 - Counting Game

When teaching kids division, they often will play a word game where the students will sit in a circle and count up from 1 to some number (say 10 for example), but with a twist. If a number is divisible by another number, that number is replaced with a word.

For example, a rule might be if a number is divisible by two, then say “woof”. So it would go like this:
1
woof
3
woof
5
woof
7
woof
9
woof

The game grows in complexity as more rules are added.  If we add a new rule to say “meow” when a number is divisible by three, we get:
1
woof
meow
woof
5
woof meow
7
woof
meow
woof

Notice that in place of 6 we said both woof and meow because 6 is divisible by both 2 (woof) and 3 (meow).


## Assignment
Your first assignment is to write code for this number game in Java. Recall that you can tell if a number is divisible by another by using the modulus operator (%) which gives you the remainder from division.  If the result is zero (there is no remainder) then the first number is divisible by the second.

For your number game, we will count from 1 to 30 using the following rules:

- If a number is divisible by 5, then print "beep" instead of the number
- If a number is divisible by 8, then print "buzz" instead of the number
- If a number is divisible by 12, then print "zap" instead of the number

Remember:  if the number is divisible by both numbers, both words should print on the same line.

## GitHub Info
Repository:  https://github.com/htc-ccis2595/counting-game 
You need to fork this repository and submit a pull request to turn in the assignment.  Please post a screenshot of the pull request to the D2L dropbox.  The dropbox is mainly used to communicate due dates, not for storing the completed work.  You do not need to upload the project to D2L, only to GitHub.
