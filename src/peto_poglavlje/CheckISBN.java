package peto_poglavlje;

import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        /*(Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:
10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 If the checksum is 10, replace it with 0. Your program should read the input as a
string. Here are sample runs:*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN number, 12 digits: ");
        String isbn = scanner.next();
        int sum = 0;
        if (isbn.length() != 12) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        for (int i = 0; i < isbn.length(); i++) {
            if (i % 2 == 0) {
                sum += (3 * Integer.parseInt(String.valueOf(isbn.charAt(i))));
            } else {
                sum += Integer.parseInt(String.valueOf(isbn.charAt(i)));
            }
        }
        sum = 10 - sum % 10;
        if (sum == 10) {
            System.out.println(isbn + "0");
        } else System.out.println(isbn + sum);

    }
}
