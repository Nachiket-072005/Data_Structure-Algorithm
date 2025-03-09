import java.util.*;

class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> currSeq = new ArrayList<>();

    public void recur(int index, int[] nums) {
        // Base Case:
        if (index == nums.length) {
            answer.add(new ArrayList<Integer>(currSeq));
            return;
        }
        // two options
        // opt1 - choose the element
        currSeq.add(nums[index]);
        recur(index + 1, nums);
        currSeq.remove(currSeq.size() - 1);

        // opt2 - ignore the element
        recur(index + 1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        recur(0, nums);
        return answer;
    }
}