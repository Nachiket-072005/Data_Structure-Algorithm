class Solution {
    public int firstOccurance(int[] nums, int target) {
        int n = nums.length;
        int answer = n;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                answer = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (answer == n) {
            answer = -1;
        }

        return answer;
    }

    public int lastOccurance(int[] nums, int target) {
        int n = nums.length;
        int answer = -1;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                answer = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    int countFreq(int[] nums, int target) {
        // code here
        int fo = firstOccurance(nums, target);
        int lo = lastOccurance(nums, target);
        if (fo == -1 && lo == -1) {
            return 0;
        }
        return lo - fo + 1;
    }
}