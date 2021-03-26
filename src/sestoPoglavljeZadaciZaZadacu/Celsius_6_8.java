package sestoPoglavljeZadaciZaZadacu;

public class Celsius_6_8 {
    public static void main(String[] args) {


        System.out.println("Celsius         Farenheit  |     Farenheit           Celsijus");
        System.out.println("_____________________________________________________________");
        double farenhejt = 130.0;
        for (double celsius = 40.0; celsius >= 31.0; celsius--) {
            farenhejt -= 10;
            System.out.print(celsius + "     ");
            System.out.print("\t\t" + celsiusToFahrenheit(celsius) + "   ");
            System.out.print("\t\t" + farenhejt + "    ");
            System.out.printf("\t\t\t%.2f ", farenhajtToCelsijus(farenhejt));
            System.out.println();
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double farenhajtToCelsijus(double farenhajt) {
        return (5.0 / 9) * (farenhajt - 32);
    }
}

