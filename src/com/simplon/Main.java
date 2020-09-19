package com.simplon;


import java.util.Scanner;
public class Main {

    public static void guessTheNumber() {

        Scanner scanner = new Scanner(System.in);


        int number = 1 + (int) (100 * Math.random());
        int trials = 10;
        int i, guess;

        System.out.println(("I'm thinking of a number between 0 and 100"));
        System.out.println("Can you guess it");
        System.out.println("You have 10 trials");

        for (i = 0; i < trials; i++) {
            System.out.println("Enter the number");
            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + "You guessed the letter");
                break;
            } else if (number < guess && i != trials - 1) {
                System.out.println("sorry you're too high");
            } else if (number > guess && i != trials - 1) {
                System.out.println("sorry you're too low");
            }
        }
        if (i == trials) {
            System.out.println("you have exhausted" + trials + "trials");
            System.out.println("the letter was +" + number);
        }
    }

    public static void main(String arg[]) {
        guessTheNumber();
    }
}
