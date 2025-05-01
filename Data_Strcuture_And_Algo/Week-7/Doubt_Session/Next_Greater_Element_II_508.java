class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                ans[st.peek()] = nums[i];

                st.pop();
            }
            st.push(i);
        }

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                ans[st.peek()] = nums[i];

                st.pop();
            }
        }

        return ans;
    }
}