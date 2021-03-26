package sestoPoglavljeZadaciZaZadacu;

public class ComputeFutureInvestmentValue_6_7 {
    /*(Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number
of years. The future investment is determined using the formula in Programming
Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,
1000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30, as shown below:*/
    public static void main(String[] args) {
        double amount = 1000;
        double interestRate = 9;
        double monthlyInterest = interestRate / 1200;
        System.out.println("Years     Futuure value ");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%.2f", futureInvestmentValue(amount, monthlyInterest, years));
            System.out.println();
        }
    }

    private static double futureInvestmentValue(double amount, double interest, int year) {
        double futureInvestment = amount * Math.pow(1 + interest, year * 12);
        return futureInvestment;

    }
}
