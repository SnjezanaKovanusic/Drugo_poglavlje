package cetvrto_poglavlje;

import java.util.Scanner;

public class StudentMajorAndStatus_4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters and display the major and status: ");
        String input = scanner.next();
        char firstLetter = input.charAt(0);
        char secondLetter = input.charAt(1);
        if ((firstLetter == 'M' || firstLetter == 'C' ||
                firstLetter == 'I') &&
                (secondLetter == '1' || secondLetter == '2' ||
                        secondLetter == '3' || secondLetter == '4')) {

            switch (firstLetter) {
                case 'M' -> System.out.print(" Mathematics ");
                case 'C' -> System.out.print("Computer Science ");
                case 'I' -> System.out.print("Information Technology ");
            }
            switch (secondLetter) {
                case '1' -> System.out.print(" freshman");
                case '2' -> System.out.print(" sophomore");
                case '3' -> System.out.print(" junior");
                case '4' -> System.out.print(" senior");
            }

        } else {
            System.out.println("Invalid input");
        }
    }
}

