class Solution {
    List<String> answer;
    List<Character> currentCombination;

    void recursion(int index, int n, int sum)
    {
        // base case 
        if(index == n)
        {
            if(sum == 0)
            {
                StringBuilder currentAnswer = new StringBuilder();
                for(int i=0; i<currentCombination.size(); i++)
                {
                    currentAnswer.append(currentCombination.get(i));
                }
                
                answer.add(currentAnswer.toString());
            }
            
            return;
        }
        
        // recursive case --> OPTION concept 
        currentCombination.add('(');
        recursion(index + 1, n, sum + 1);
        currentCombination.remove(currentCombination.size() - 1);
        
        if(sum >= 1)
        {
            currentCombination.add(')');
            recursion(index + 1, n, sum - 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
    
    public List<String> generateParenthesis(int n) {

        answer = new ArrayList<>();
        currentCombination = new ArrayList<>(); 
        
        recursion(0, 2 * n, 0);
        return answer;
    }
}