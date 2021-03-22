package drugo_poglavlje;

import java.util.Scanner;

public class HealthAplications {
    /*(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
a sample run:*/
    public static void main(String[] args) {
        final double INCH = 0.0254;
        final double POUND = 0.45359237;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        weight = weight * POUND;
        height = height * INCH;

        double bMI = weight / (height * height);

        System.out.println("BMI is: " + bMI);


    }
}
