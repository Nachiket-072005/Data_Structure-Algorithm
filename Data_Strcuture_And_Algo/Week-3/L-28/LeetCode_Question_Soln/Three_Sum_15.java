import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Approach
        // Sort
        // Two Pointer
        // Skip Duplicates

        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null && nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > 0) {
                break;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    // Again check for duplicates
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}