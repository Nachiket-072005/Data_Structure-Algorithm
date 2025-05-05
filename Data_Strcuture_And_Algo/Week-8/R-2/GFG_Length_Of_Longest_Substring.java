class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        Queue<Character> q = new LinkedList<>();
        int fre[] = new int[26];
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = (int)ch;
            val -= 97;
            
            fre[val]++;
            q.add(ch);
            
            while(!q.isEmpty() && fre[val] > 1) {
                fre[q.peek() - 'a']--;
                q.remove();
            }
            
            ans = Math.max(ans, (int)(q.size()));
        }
        
        return ans;
    }
}