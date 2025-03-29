import java.util.Arrays;

class Solution {
    public int ceil(int[] arr, int k) {
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

        if (ans == -1) {
            return -1;
        }

        return arr[ans];
    }

    public int floor(int[] arr, int k) {
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

        if (ans == -1) {
            return -1;
        }

        return arr[ans];
    }

    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int[] ans = new int[2];
        Arrays.sort(arr);
        ans[0] = floor(arr, x);
        ans[1] = ceil(arr, x);

        return ans;
    }
}
