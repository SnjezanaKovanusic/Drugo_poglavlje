package sestoPoglavljeZadaciZaZadacu;

public class FormatAnInteger {
    /*(Format an integer) Write a method with the following header
    to format the integer with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size
of the string is the width.
For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. If the number is longer than the width, the method 244 Chapter 6 Methods
returns the string representation for the number. For example, format(34, 1)
returns 34.
Write a test program that prompts the user to enter a number and its width and
displays a string returned by invoking format(number, width).*/
    public static void main(String[] args) {
        int number = 34;
        int width = 6;
        String noviBroj = format(number, width);
        System.out.println(noviBroj);

    }
    private static String format(int number, int width) {
        String newString = number + " ";
        if (newString.length() < width) {
            for (int i = width - newString.length(); i >= 0; i--) {
                newString = 0 + newString;
            }
        }
        return newString;
    }
}
