package GFG_Ques;

class Solution {
    int count = 0;

    public void recur(int n, int src, int des, int helper) {
        // base case
        if (n == 0) {
            return;
        }
        // Move n - 1 disk src to des
        recur(n - 1, src, helper, des);
        // Move nth disk src to des
        count++;
        // Move n - 1 disk helper to des
        recur(n - 1, helper, des, src);
    }

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        recur(n, from, to, aux);
        return count;
    }
}