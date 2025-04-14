class Solution {
    public String result(String a) {
        int l = a.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < l; i++) {
            if (a.charAt(i) == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.add(a.charAt(i));
            }
        }

        StringBuilder s = new StringBuilder();
        while (!st.isEmpty()) {
            s.append(st.pop());
        }
        return s.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String A = result(s);
        String B = result(t);

        if (A.length() == B.length()) {
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}