package peto_poglavlje;

public class ProcessAString {
    /*(Process string) Write a program that prompts the user to enter a
     string and displays the characters at odd positions. Here is a sample run:*/
    public static void main(String[] args) {
        String string = "Dobro nam dosli";
        String stringAtAddPosition = "";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                stringAtAddPosition += string.charAt(i);

            }
        }
        System.out.println(stringAtAddPosition);
    }
}
