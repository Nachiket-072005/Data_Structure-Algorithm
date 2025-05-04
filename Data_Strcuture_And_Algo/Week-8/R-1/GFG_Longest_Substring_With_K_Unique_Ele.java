class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int ans = -1;
        int count = 0;
        int[] fre = new int[26];
        Deque<Character> dq = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++) {
            dq.addLast(s.charAt(i));
            char ch = s.charAt(i);
            int val = (int)ch;
            
            val -= 97;
            
            if(fre[val] == 0) {
                count++;
                fre[val] = 1;
            }
            else {
                fre[val]++;
            }
            
            while(count > k && dq.size() > 0) {
                int v = (int)dq.getFirst();
                v -= 97;
                
                fre[v]--;
                if(fre[v] == 0) {
                    count--;
                }
                
                dq.removeFirst();
            }
            
            if(count == k) {
                
            ans = Math.max(ans, (int)dq.size());
            }
        }
        
        return ans;
    }
}
