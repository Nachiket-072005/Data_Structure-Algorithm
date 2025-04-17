public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int n = A.size();

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A.get(i) < A.get(st.peek())) {
                res.set(st.peek(), A.get(i));
                st.pop();
            }
            st.push(i);
        }

        return res;

    }
}