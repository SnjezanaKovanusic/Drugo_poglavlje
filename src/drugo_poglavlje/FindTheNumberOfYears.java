package drugo_poglavlje;

import java.util.Scanner;

public class FindTheNumberOfYears {
    /*(Find the number of years) Write a program that
     prompts the user to enter the
minutes (e.g., 1 billion), and displays the
number of years and days for the minutes.
For simplicity, assume a year has 365 days.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minutes: ");
        long enterMInutes = scanner.nextLong();
        long hours = (enterMInutes / 60);
        long day = 24;
        long minutesIntoDays = hours / day;
        long daysInYear = minutesIntoDays / 365;
        long leftDaysInYear = minutesIntoDays % 365;

        System.out.println(enterMInutes + " minutes is approximately " + daysInYear + " years, and " + leftDaysInYear + " days.");
    }
}
