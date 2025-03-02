class Solution {
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // reverse entire array
        reverse(nums, 0, n - 1);
        // reverse first k element
        reverse(nums, 0, k - 1);
        // reverse last n - k elements
        reverse(nums, k, n - 1);
    }
}