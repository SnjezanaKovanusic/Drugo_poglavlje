package cetvrto_poglavlje;

import java.util.Scanner;

public class VowelOrConsonant_4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String input = scanner.next();
        char letter = Character.toUpperCase(input.charAt(0));

        if (Character.isLetter(letter)) {
            if (letter == 'A' || letter == 'E'
                    || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println(letter + " is a vowel.  ");
            } else {
                System.out.println(letter + " is a consonant. ");
            }

        } else {
            System.out.println(letter + " is an invalid input. ");
        }
    }
}
