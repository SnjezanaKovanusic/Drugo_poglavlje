package cetvrto_poglavlje;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class OrderThreeCities_4_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first city: ");
        String firstCity = scanner.nextLine();

        System.out.println("Enter second city: ");
        String secondCity = scanner.nextLine();

        System.out.println("Enter third city: ");
        String thirdCity = scanner.nextLine();

        String temp = "";// pjeske, sortira samo prvi karakter
        if (firstCity.compareTo(secondCity)>0) {
            temp = secondCity;
            secondCity = firstCity;
            firstCity = temp;
        }
        if (firstCity.compareTo(thirdCity)>0) {
            temp = thirdCity;
            thirdCity = firstCity;
            firstCity = temp;
        }
        if (secondCity.compareTo(thirdCity)>0) {
            temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }
        System.out.println("The three cities in alphabetical order are: " +
                firstCity + " " + secondCity + " " + thirdCity);

        ArrayList<String> cities = new ArrayList<>();
        cities.add(firstCity);
        cities.add(secondCity);
        cities.add(thirdCity);

        Collections.sort(cities);
        System.out.println("The cities in alphabetic order are: " + cities);
    }
}
