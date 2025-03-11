package LeetCode_Question_Soln;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted = true;
                }
            }

            if (isSorted == false) {
                break;
            }
        }

        return nums;
    }
}
