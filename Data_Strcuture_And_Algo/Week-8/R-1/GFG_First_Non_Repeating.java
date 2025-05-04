class Solution {
    public String FirstNonRepeating(String s) {
        // code here
        StringBuilder ans = new StringBuilder("");
        int[] fre = new int[26];
        Queue<Character> q = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = (int)ch;
            
            val -= 97;
            
            if(fre[val] == 0) {
                q.add(ch);
                fre[val] = 1;
            }
            else {
                fre[val]++;
            }
            
            while(q.size() > 0 && fre[((int)(q.peek()) - 97)] > 1) {
                q.remove();
            }
            
            if(q.isEmpty()) {
                ans.append('#');
            }
            else {
                ans.append(q.peek());
            }
        }
        
        return ans.toString();
    }
}