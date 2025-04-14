class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            st.add(i);
        }
        
        while(st.size() > 1) {
            int firstEle = st.pop();
            int secondEle = st.pop();
            
            if(mat[firstEle][secondEle] == 1 && mat[secondEle][firstEle] == 0) {
                st.add(secondEle);
            }
            else if(mat[firstEle][secondEle] == 0 && mat[secondEle][firstEle] == 1) {
                st.add(firstEle);
            }
        }
        
        if(st.isEmpty()) {
            return -1;
        }
        else {
            int celebrity = st.peek();
            for(int i = 0; i < n; i++) {
                if(i != celebrity) {
                    if(mat[celebrity][i] == 1 || mat[i][celebrity] == 0) {
                        return -1;
                    }
                }
            }
        return celebrity;
        }
    }
}