public class UpperBound {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 10, 11, 11, 25 };
        int k = 11;

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
