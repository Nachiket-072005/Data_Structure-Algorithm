public class Merge_Sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // TC = O(nlogn) & SC = O(n)
    public static void mergeSort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        // Work
        int mid = si + (ei - si) / 2; // It is similar to mid = (si + ei)/2;
        mergeSort(arr, si, mid); // Left Part
        mergeSort(arr, mid + 1, ei); // Right Part
        merge(arr, si, mid, ei); // Merge
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Rest of Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Rest of Right Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array value to original array
        for (k = 0, i = si; k <= temp.length - 1; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}