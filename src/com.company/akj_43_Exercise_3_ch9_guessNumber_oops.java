package com.company;
 /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNum;
    public int noOfguess = 0;

    public int getNoOfguess() {
        return noOfguess;
    }

    public void setNoOfguess(int noOfguess) {
        this.noOfguess = noOfguess;
    }

    Game() {
        Random ran = new Random();
        this.number = ran.nextInt(100);

    }

    void takeUserInput() {

        System.out.println("\nGuess the number between 0 to 100: ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }
    void gradeannounce(){
        if (noOfguess <= 5) {
            System.out.println("\nyou guess it within 5 attempts! " + "\nyou have got A++🌟🌟🌟");
        } else if (noOfguess <5 || noOfguess <= 10) {
            System.out.println("\nyou guess it within 10 attempts! " + "\nyou have got A+🌟🌟");
        } else if (noOfguess <10 || noOfguess <= 15) {
            System.out.println("\nyou guess it within 15 attempts! " + "\nyou have got A🌟");
        } else {
            System.out.println("\nyou guess it in more than 15 attempts! " + "\nyou loose 😔 try again!!");
        }
    }

    boolean isCorrectNumber() {
        noOfguess++;

        if (inputNum == number) {
            System.out.format("Yes you guessed right number, it was %d\nYou guessed it in %d attempts", number, noOfguess);
            return true;
        } else if (inputNum < number) {
            System.out.println("Entered number is less than actual number");
        } else if (inputNum > number) {
            System.out.println("entered number is greater than actual number");
        }

        return false;

    }
}

    public class akj_43_Exercise_3_ch9_guessNumber_oops {
        public static void main(String[] args) {

            Game game = new Game();
            System.out.println("                             Guess the Number Game        ");
            System.out.println("\nGeneral rules and Instruction for the Game:");
            System.out.println("if you guess right number within 5 attempts you got A++ garde");
            System.out.println("if you guess right number within 5-10 attempts you got A+ garde");
            System.out.println("if you guess right number within 10-15 attempts you got A garde");
            System.out.println("if you guess right number in more than 15 attempts you will loose the game");


            boolean a = false;
            while (!a) {
                game.takeUserInput();
                a = game.isCorrectNumber();

            }game.gradeannounce();


        }
    }

