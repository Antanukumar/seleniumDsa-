public class linearsearch {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        int element = 20;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                System.out.println("Elemnt is found" + i + "Index");

                found = true;
                break;
            }

        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }

}
