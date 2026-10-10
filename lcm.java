import java.util.Scanner;

public class lcm {

    // FIX 1: Changed return type from void to int
    public static int findgcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // FIX 2: Return 'a' instead of an empty return
    }

    public static int findlcm(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }
        // FIX 3: Call findgcd(a, b) here instead of findlcm(a, b) to stop infinite recursion
        // FIX 4: Divided before multiplying to help prevent integer overflow
        return Math.abs(a / findgcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:"); // Fixed typo here
        int num2 = sc.nextInt();

        int lcm = findlcm(num1, num2);
        
        // Formatted with proper spacing for clean output
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        sc.close(); // Good practice to close the scanner
    }
}
