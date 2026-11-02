import java.util.Arrays;

class sortingArrat {

    // length of an array
    static int l;

    // method to sort the array in ascending order
    public static void sort(int[] a) {
        // temporary variable for swapping elements
        int t = 0;

        // outer loop to iterate through the array
        for (int i = 0; i < l; i++) {

            // inner loop to compare and swap elements
            for (int j = i + 1; j < l; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {

        // initialize array to be sorted
        int[] a = new int[] { -2, 0, 1, 3, -1, 2 };

        // set the length of the array
        l = a.length;

        sort(a);

        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
    }
}