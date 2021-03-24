package cetvrto_poglavlje;

import java.util.Scanner;

public class ProcessAString_4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.next();
        System.out.println("The length of string is: " + input.length() +
                ". First character in string is:  " + input.charAt(0));

    }
}
