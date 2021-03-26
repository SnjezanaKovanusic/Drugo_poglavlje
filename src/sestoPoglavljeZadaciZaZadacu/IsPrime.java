package sestoPoglavljeZadaciZaZadacu;

public class IsPrime {
    /*(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.*/

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + (count % 10 == 0 ? "\n" : " "));
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
