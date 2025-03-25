public class Solution {
    /**
     * @param n: the number of disks
     * @return: the order of moves
     */
    List<String> answer;

    public void recur(int n, String src, String des, String helper) {
        // base case
        if (n == 0) {
            return;
        }
        // Move n - 1 disk src to des
        recur(n - 1, src, helper, des);
        // Move nth disk src to des
        answer.add("from " + src + " to " + des);
        // Move n - 1 disk helper to des
        recur(n - 1, helper, des, src);
    }

    public List<String> towerOfHanoi(int n) {
        // write your code here
        answer = new ArrayList<>();

        recur(n, "A", "C", "B");
        return answer;
    }
}