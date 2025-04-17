class Solution {
    static boolean isLetter(char x) {
        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }

    static String postToInfix(String exp) {
        // code here
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            String a = "" + exp.charAt(i);
            if (isLetter(exp.charAt(i)) == true) {
                st.push(a);
            } else {
                String B = st.pop();
                String A = st.pop();

                st.push("(" + A + a + B + ")");
            }
        }

        return st.peek();
    }
}