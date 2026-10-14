public class countdigit {

    static int countDigit(long n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(12345)); // 5
        System.out.println(countDigit(0));     // 1
        System.out.println(countDigit(-907));  // 3
    }
}