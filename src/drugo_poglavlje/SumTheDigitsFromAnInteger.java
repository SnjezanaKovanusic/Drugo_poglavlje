package drugo_poglavlje;

import java.util.Scanner;

public class SumTheDigitsFromAnInteger {
    /*(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000");
        int input = scanner.nextInt();

// last digit
        int digit = input % 10;//2
        int sum = +digit;
        input = input / 10;

        digit = input % 10;
        sum += digit;
        input = input / 10;

        digit = input % 10;
        sum += digit;
        input = input / 10;

        digit = input % 10;
        sum += digit;
        System.out.println("The sum of the digits is: "+ sum);
    }
}
