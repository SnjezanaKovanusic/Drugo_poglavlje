package cetvrto_poglavlje;

import java.util.Scanner;

public class StingSaPraznimMjestom {

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Unesite neki string: ");
            String unos = scanner.next();
            System.out.println(unos.replace("", " "));

        }
    }

