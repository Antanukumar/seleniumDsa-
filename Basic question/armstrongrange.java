public class armstrongrange {
    public static void main(String[] args) {

        for (int num = 1; num <= 500; num++) {

            int n = num;
            int temp = n;
            int r, sum = 0;

            while (n > 0) {
                r = n % 10;
                n = n / 10;
                sum = sum + r * r * r;
            }

            if (temp == sum) {
                System.out.println(temp + " is an armstrong number");
            }
        }
    }
}