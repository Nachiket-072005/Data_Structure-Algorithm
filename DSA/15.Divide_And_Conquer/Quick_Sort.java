public class Quick_Sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for element smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap Func
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap for pivot ele
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5, -5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}