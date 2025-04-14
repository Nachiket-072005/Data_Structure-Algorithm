class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        int l = s.length();

        for(int i = 0; i < l; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.add(s.charAt(i));
            }
            else {
                if(st.size() == 0) {
                    return false;
                }
                if((s.charAt(i) == ')' && st.peek() != '(') || 
                    (s.charAt(i) == '}' && st.peek() != '{') || 
                    (s.charAt(i) == ']' && st.peek() != '[')) {
                        return false;
                }

                st.pop();
            }
        } 

        return st.size() == 0;
    }
}