package com.htc;

	/*
    ## Assignment
    Your first assignment is to write code for this number game in Java. Recall that you can tell if a number is
    divisible by another by using the modulus operator (%) which gives you the remainder from division.
    If the result is zero (there is no remainder) then the first number is divisible by the second.

    For your number game, we will count from 1 to 30 using the following rules:

    - If a number is divisible by 5, then print "beep" instead of the number
    - If a number is divisible by 8, then print "buzz" instead of the number
    - If a number is divisible by 12, then print "zap" instead of the number

    Remember:  if the number is divisible by both numbers, both words should print on the same line.
    */


public class Main {

    public static void main(String[] args) {

        int x, y;
        int divisor[] = {5, 8, 12};
        String words[] = {"beep ","buzz ","zap"};
        int answer;
        int len = divisor.length;

        for (x = 1; x <= 30; x++) {
            System.out.print(x + ":\t");
            for (y = 0; y < len; y++) {
                answer = x % divisor[y];
                if (answer == 0) System.out.print(words[y]);
            }
            System.out.println(); //carriage return
        }
    }
}