public class insertarray {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        int indexpass = 2;
        int element = 100;

        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < indexpass; i++) {
            newarr[i] = arr[i];

        }

        newarr[indexpass] = element;

        for (int i = indexpass; i < arr.length; i++) {
            newarr[i + 1] = arr[i];
        }
        for (int no : newarr) {
            System.out.println(no);
        }

    }

}
