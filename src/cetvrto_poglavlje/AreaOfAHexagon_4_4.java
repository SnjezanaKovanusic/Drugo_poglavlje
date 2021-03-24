package cetvrto_poglavlje;

import java.util.Scanner;

public class AreaOfAHexagon_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of a hexagon: ");
        double side = scanner.nextDouble();

        double upSide = 6 * Math.pow(side, 2);
        double downSide = 4 * Math.tan(Math.PI / 6);
        double area = upSide / downSide;

        System.out.printf("The area of the hexagon is: %.2f", area);
    }
}
