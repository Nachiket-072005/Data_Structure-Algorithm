public class Insertion_Sort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // find the correct position to insert element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion sort
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = { 5, 4, 2, 3, 1 };
        int[] arr = { 1, 2, 3, 4, 5 };

        insertionSort(arr);
        printArr(arr);
    }
}
