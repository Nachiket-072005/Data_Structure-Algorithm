class Solution {
    public int cal(char op, int a, int b) {
        if (op == '+') {
            return (a + b);
        } else if (op == '-') {
            return (a - b);
        } else if (op == '*') {
            return (a * b);
        } else {
            return (a / b);
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;

        for (int i = 0; i < n; i++) {
            if (tokens[i].length() == 1 &&
                    (tokens[i].charAt(0) == '+' || tokens[i].charAt(0) == '-' || tokens[i].charAt(0) == '*'
                            || tokens[i].charAt(0) == '/')) {
                int B = st.pop();
                int A = st.pop();

                st.push(cal(tokens[i].charAt(0), A, B));
            } else {
                int val = Integer.parseInt(tokens[i]);
                st.push(val);
            }
        }
        return st.peek();
    }
}