package primenumbers;


public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n) {
        System.out.println("Prime Numbers:");
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        printPrimes(n);
    }
}

