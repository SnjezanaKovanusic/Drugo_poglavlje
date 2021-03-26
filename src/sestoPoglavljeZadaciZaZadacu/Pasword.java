package sestoPoglavljeZadaciZaZadacu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pasword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite sifru: ");
        String sifra = scanner.next();


        if (daLiJeispravnaSifra(sifra)) {
            System.out.println("Valid password! ");
        } else {
            System.out.println("Invalid password!! ");
        }

    }

    public static boolean daLiJeispravnaSifra(String sifra) {
        int duzinaSifre = 8;
        int brojBrojevaUSifri = 2;
        boolean ispravnaSifra =
                tacnaDuzinaKaraktera(sifra, duzinaSifre) &&
                        pismaIBrojevi(sifra) &&
                        imaDvaBroja(sifra, brojBrojevaUSifri);
        return ispravnaSifra;
    }

    public static boolean tacnaDuzinaKaraktera(String sifra, int duzinaSifre) {

        return sifra.length() == duzinaSifre;
    }

    public static boolean pismaIBrojevi(String sifra) {
        Pattern regex;
        regex = Pattern.compile("[^A-Za-z0-9 ]");
        Matcher matcher = regex.matcher(sifra);
        if (matcher.find()) {
            return false;
        }
        return true;
    }

    public static boolean imaDvaBroja(String sifra, int dvaBroja) {
        int brojac = 0;
        for (int i = 0; i < sifra.length(); i++) {
            if (Character.isDigit(sifra.charAt(i))) {
                brojac++;
            }
            if (brojac > dvaBroja) {
                return false;
            }
        }
        return true;
    }
}
