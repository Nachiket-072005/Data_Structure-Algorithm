class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        int sum = 0;
        int n = arr.length;
        
        m.put(0, -1);
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(m.containsKey(sum)) {
                ans = Math.max(ans, (i - m.get(sum)));
            }
            else {
                m.put(sum, i);
            }
        }
        
        return ans;
    }
}