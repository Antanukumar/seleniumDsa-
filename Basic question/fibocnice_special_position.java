public class fibocnice_special_position {

    public static int getfibonaciesposition(int num) {

        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

        for (int i = 2; i <= num; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        int num = 5;
        int result = getfibonaciesposition(num);

        System.out.println(num);
        System.out.println(result);
    }
}