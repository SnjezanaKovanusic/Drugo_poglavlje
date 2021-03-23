package trece_poglavlje;

import java.util.Random;
import java.util.Scanner;

public class GameHeadsOrTails {
    /*(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.*/
    public static void main(String[] args) {
        System.out.println("Enter 0 for head, enter 1 for tails: ");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        Random random = new Random();
        int guessing = random.nextInt(2);
        System.out.println(guessing);
        if (userGuess == guessing) {
            System.out.println("Guess is correct. ");
        } else {
            System.out.println("Guess is incorrect. ");
        }
    }
}
