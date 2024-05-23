public class Sorted_and_Rotated_Array {
    public static int search(int arr[], int tar, int si, int ei) {
        // Base Case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // FOUND Case
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a: left side
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case b: right side
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case c: right side
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // case d: left side
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // O/P -> 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}