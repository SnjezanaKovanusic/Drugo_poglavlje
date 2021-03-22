package drugo_poglavlje;

public class PrintATable {
    /*(Print a table) Write a program that displays the following table. Cast floatingpoint numbers into integers.
a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024
5 6 15625*/
    public static void main(String[] args) {
        System.out.println("a   b    pow (a,b)");
        System.out.println("__________________");
        int a = 1;
        int b = 2;
        int pow = (int) Math.pow(a, b);

        System.out.print(a + "   " + b + " " + "\t\t" + pow);

        a++;
        b++;
        pow = (int) Math.pow(a, b);
        System.out.println("\n" + a + "   " + b + " " + "\t\t" + pow);

        a++;
        b++;
        pow = (int) Math.pow(a, b);
        System.out.println("\n" + a + "   " + b + " " + "\t\t" + pow);

        a++;
        b++;
        pow = (int) Math.pow(a, b);
        System.out.println("\n" + a + "   " + b + " " + "\t\t" + pow);

        a++;
        b++;
        pow = (int) Math.pow(a, b);
        System.out.println("\n" + a + "   " + b + " " + "\t\t" + pow);
    }
}
