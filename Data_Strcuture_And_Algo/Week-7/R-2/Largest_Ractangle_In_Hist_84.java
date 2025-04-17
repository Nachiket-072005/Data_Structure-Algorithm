class Solution {
    public int[] leftSmaller(int[] h) {
        int n = h.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            res[i] = -1;
        }

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && h[i] < h[st.peek()]) {
                res[st.peek()] = i;
                st.pop();
            }

            st.push(i);
        }
        return res;
    }

    public int[] rightSmaller(int[] h) {
        int n = h.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            res[i] = n;
        }

        for(int i =0; i < n; i++) {
            while(!st.isEmpty() && h[i] < h[st.peek()]) {
                res[st.peek()] = i;
                st.pop();
            }

            st.push(i);
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int[] leftPart = leftSmaller(heights);
        int[] rightPart = rightSmaller(heights);

        int maxArea = 0;

        for(int i = 0; i < heights.length; i++) {
            int width = rightPart[i] - leftPart[i] - 1;
            int currArea = heights[i] * width;

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}