package trece_poglavlje;

import java.util.Scanner;

public class DivisibleBy5And6 {
    /*(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();

        System.out.println("Is " + input + " divisible by 5 and 6? " +
                (input % 5 == 0 && input % 6 == 0));
        System.out.println("Is " + input + " divisible by 5 and 6? " +
                (input % 5 == 0 || input % 6 == 0));
        System.out.println("Is " + input + " divisible by 5 and 6? " +
                (input % 5 == 0 ^ input % 6 == 0));
    }
}
