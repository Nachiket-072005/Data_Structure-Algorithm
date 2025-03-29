class Solution {
    static int floor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= k) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    static int findFloor(int[] arr, int x) {
        // write code here
        int ans = floor(arr, x);

        return ans;
    }
}