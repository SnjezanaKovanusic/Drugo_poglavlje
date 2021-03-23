package trece_poglavlje;

import java.util.Scanner;

public class CompareCosts {
    /*(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price. Here is a sample run:*/ //50 24.59 25 11.99
    public static void main(String[] args) {
        System.out.println("Enter weight and price for package 1: ");
        Scanner scanner = new Scanner(System.in);
        double weightForPackage1 = scanner.nextDouble();
        double priceForPackage1 = scanner.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        double weightForPackage2 = scanner.nextDouble();
        double priceForPackage2 = scanner.nextDouble();

        double pricePerKilo = priceForPackage1 / weightForPackage1;
        double pricePerKilo2 = priceForPackage2 / weightForPackage2;

        System.out.println((pricePerKilo > pricePerKilo2 ? "The package 2 is better price"
                : "The package 1 is better price"));
    }
}
