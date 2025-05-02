class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        
        int ans[] = new int[(n - k + 1)];
        int index = 0;
        
        Deque<Integer> q = new LinkedList<>();

        // STEP 1
        int i = 0;
        while(i < k)
        {
            // 1 5 3 (Remove useless element --> (which are smaller and there is a greater element in front))
            while(q.size() > 0 && nums[i] > nums[q.getLast()])
            {
                q.removeLast();
            }

            q.addLast(i);
            i++;
        }
        
        // 10 1 5 30 4 8 90, k = 3
        // 0  1 2 3
        
        // q = 3
        
        // STEP 2 
        while(i < n)
        {
            ans[index] = nums[q.getFirst()];
            index++;
            
            // remove element which are out of the window 
            while(q.size() > 0 && q.getFirst() <= (i - k))
            {
                q.removeFirst();
            }
            
            // 1 5 3 (Remove useless element --> (which are smaller and there is a greater element in front))
            while(q.size() > 0 && nums[i] > nums[q.getLast()])
            {
                q.removeLast();
            }

            q.addLast(i);
            i++;
        }
        
        ans[index] = nums[q.getFirst()];
        
        return ans;
    }
}