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

    public int[] searchRange(int[] nums, int target) {
        int answer[] = new int[2];
        answer[0] = firstOccurance(nums, target);
        answer[1] = lastOccurance(nums, target);
        return answer;
    }
}
