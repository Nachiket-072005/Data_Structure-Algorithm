class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here.
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int n = start.length;
        
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(finish[i]);
            t.add(start[i]);
            
            arr.add(new ArrayList<>(t));
        }
        
        Collections.sort(arr, (x, y) -> (Integer.compare(x.get(0), y.get(0))));
        
        int ans = 1;
        int L = arr.get(0).get(1);
        int R = arr.get(0).get(0);
        
        for(int i = 1; i < n; i++) {
            int currStart = arr.get(i).get(1);
            int currEnd = arr.get(i).get(0);
            
            if(currStart > R) {
                ans++;
                R = currEnd;
            }
        }
        
        return ans;
    }
}