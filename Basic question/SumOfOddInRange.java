public class SumOfOddInRange {
    public static void main(String[] args) {

        int start = 1, end = 10;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;          // add only odd numbers
            }
        }

        System.out.println(sum);
    }
}