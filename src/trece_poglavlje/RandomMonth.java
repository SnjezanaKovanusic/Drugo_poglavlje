package trece_poglavlje;

import java.util.Random;

public class RandomMonth {
    /*(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, …, December for
the number 1, 2, …, 12, accordingly.*/
    public static void main(String[] args) {
        Random random = new Random();
        int getRandomMonth = random.nextInt(12)+1;
        switch (getRandomMonth) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Maj");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Avgust");
            case 9 -> System.out.println("Septembar");
            case 10 -> System.out.println("Oktobar");
            case 11 -> System.out.println("Novembar");
            case 12 -> System.out.println("Decembar");
        }
    }
}
