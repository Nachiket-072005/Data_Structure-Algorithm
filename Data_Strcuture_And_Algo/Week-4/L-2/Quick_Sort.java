public class Quick_Sort {
    public static int partition(int start, int end, int[] arr) {
        int pivot = arr[end];
        int i = start;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static void quickSort(int start, int end, int[] arr) {
        // base case
        if (start >= end) {
            return;
        }
        int k = partition(start, end, arr);

        quickSort(start, k - 1, arr);
        quickSort(k + 1, end, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        quickSort(0, n - 1, arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}