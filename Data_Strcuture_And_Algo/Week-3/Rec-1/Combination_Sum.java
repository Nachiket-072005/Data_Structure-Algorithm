import java.util.ArrayList;

class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> currSq = new ArrayList<>();

    public void recur(int target, int[] candidates, int start) {
        if (target == 0) {
            answer.add(new ArrayList<Integer>(currSq));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                currSq.add(candidates[i]);
                recur(target - candidates[i], candidates, i);
                currSq.remove(currSq.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        recur(target, candidates, 0);
        return answer;
    }
}