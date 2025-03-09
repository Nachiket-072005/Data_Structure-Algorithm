class NumArray {
    int prefix[];
    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n]; // by default 0

        // precomputation
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            prefix[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        // sum from left to right

        if (left == 0) {
            return prefix[right];
        }
        else {
            return prefix[right] - prefix[(left - 1)];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */