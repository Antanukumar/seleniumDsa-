public class PrimeNumbers {
    public static void printPrimesLessThan(int n) {
        // Loop from 2 up to (but excluding) n
        for (int num = 2; num < n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 20;
        System.out.println("Prime numbers less than " + number + ":");
        printPrimesLessThan(number);
    }
}
