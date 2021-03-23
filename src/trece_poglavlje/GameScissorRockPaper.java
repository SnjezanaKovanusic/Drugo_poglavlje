package trece_poglavlje;

import java.util.Random;
import java.util.Scanner;

public class GameScissorRockPaper {
    /*(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws. Here are sample runs:*/
    public static void main(String[] args) {
        System.out.println("Scissor (0), rock (1), paper (2): ");

        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3);
        System.out.println(computer);

        switch (userGuess) {
            case 0 -> System.out.print("You are scissor. ");
            case 1 -> System.out.print("You are rock. ");
            case 2 -> System.out.print("You are paper. ");
        }
        switch (computer) {
            case 0 -> System.out.print("The computer is  scissor. ");
            case 1 -> System.out.print("The computer is  rock. ");
            case 2 -> System.out.print("The computer is  paper. ");
        }

        if (userGuess == computer) {
            System.out.print("It is a draw. ");
        } else if ((userGuess == 0 && computer == 2) ||
                (userGuess == 2 && computer == 1) ||
                (userGuess == 1 && computer == 0)) {
            System.out.println("You win");
        } else
            System.out.println("You lose! ");

    }
}
