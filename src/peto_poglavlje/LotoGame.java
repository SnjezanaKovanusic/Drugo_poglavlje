package peto_poglavlje;

import java.util.Scanner;

public class LotoGame {
    /*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a
    lottery of a twodigit number. The two digits in the number are distinct.
    (Hint: Generate the first
digit. Use a loop to continuously generate the second digit until it is different
from the first digit.)
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lotteryDigit1 = ((int) (Math.random() * 10));
        int lotteryDigit2;

        do {
            lotteryDigit2 = (int) (Math.random() * 10);
        }
        //5.40
        while (lotteryDigit1 == lotteryDigit2);
        System.out.println("Enter two digits: ");
        int guess = scanner.nextInt();
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }

}
