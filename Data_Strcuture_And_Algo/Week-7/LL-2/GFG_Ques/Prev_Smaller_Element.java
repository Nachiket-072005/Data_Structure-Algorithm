class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int n = arr.length;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        return res;
    }
}