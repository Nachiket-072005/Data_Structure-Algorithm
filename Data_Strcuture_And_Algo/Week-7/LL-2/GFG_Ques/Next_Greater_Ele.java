class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        // Add -1 in arrayList
        for(int i = 0; i < n; i++) {
            res.add(-1);
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) 
        {
            while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                res.set(st.peek(), arr[i]);
                st.pop();
            }
            
            st.push(i);
        }
        
        return res;
    }
}