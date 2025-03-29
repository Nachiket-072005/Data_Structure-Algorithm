public class Custom_Ceil {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 8, 6, 5, 5, 6 };
        int k = 7;

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
