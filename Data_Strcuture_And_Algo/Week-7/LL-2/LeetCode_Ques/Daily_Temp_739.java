class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = 0;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                res[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }

        return res;
    }
}