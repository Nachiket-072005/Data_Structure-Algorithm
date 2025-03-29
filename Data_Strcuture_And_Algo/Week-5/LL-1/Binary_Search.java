public class Binary_Search {
    public static int binarySearch(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 7, 8, 9, 12 };
        int target = 16;

        System.out.println(binarySearch(arr, target));
    }
}