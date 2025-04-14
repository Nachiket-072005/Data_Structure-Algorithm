class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<ArrayList<Integer>> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                ArrayList<Integer> currEle = new ArrayList<>();
                currEle.add((int) (s.charAt(i)));
                currEle.add(1);
                st.add(currEle);
            } else {

                if (st.peek().get(0) == (int) (s.charAt(i))) {
                    ArrayList<Integer> topEle = st.pop();
                    int fre = topEle.get(1);
                    topEle.set(1, fre + 1);
                    st.add(new ArrayList<>(topEle));
                }

                else {
                    ArrayList<Integer> currEle = new ArrayList<>();
                    currEle.add((int) (s.charAt(i)));
                    currEle.add(1);
                    st.add(currEle);
                }
            }

            if (st.peek().get(1) == k) {
                st.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            ArrayList<Integer> topEle = st.pop();
            int ascii_val = topEle.get(0);
            int fre = topEle.get(1);
            while (fre > 0) {
                str.append((char) (ascii_val));
                fre--;
            }
        }

        str.reverse();
        return str.toString();
    }
}