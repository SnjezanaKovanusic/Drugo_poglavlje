package drugo_poglavlje;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    /*(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and
 displays the future investment value using the following formula:
futureInvestmentValue =
investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
Here is a sample run:*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter annual interest in precente: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;

        System.out.println("Enter number of years: ");
        int numberOfYears = scanner.nextInt();


        double futureInvestment = amount * Math.pow((1+monthlyInterestRate), (numberOfYears*12));
        System.out.println(futureInvestment);
    }
}
