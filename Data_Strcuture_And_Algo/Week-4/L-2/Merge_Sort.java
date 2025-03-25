import java.util.ArrayList;

public class Merge_Sort {
    public static void merge(int s, int m, int e, int arr[]) {
        ArrayList<Integer> sortedArr = new ArrayList<>();

        int i = s;
        int j = m + 1;

        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                sortedArr.add(arr[i]);
                i++;
            } else {
                sortedArr.add(arr[j]);
                j++;
            }
        }

        while (i <= m) {
            sortedArr.add(arr[i]);
            i++;
        }

        while (j <= e) {
            sortedArr.add(arr[j]);
            j++;
        }

        int z = s;
        for (int k = 0; k < sortedArr.size(); k++) {
            arr[z] = sortedArr.get(k);
            z++;
        }
    }

    public static void mergeSort(int start, int end, int[] arr) {
        // base case
        if (start == end) {
            return;
        }

        int mid = (start + end) / 2;
        // recursive case
        mergeSort(start, mid, arr);
        mergeSort(mid + 1, end, arr);

        // merge two sorted array
        merge(start, mid, end, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        mergeSort(0, n - 1, arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}