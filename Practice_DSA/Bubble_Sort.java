public class Bubble_Sort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swaps == 0) {
                System.out.println("Array is already sorted");
                break;
            }
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        // int[] arr = { 5, 3, 1, 4, 2 };
        int[] arr = { 1, 2, 3, 4, 5 };

        bubbleSort(arr);
        printArr(arr);
    }
}