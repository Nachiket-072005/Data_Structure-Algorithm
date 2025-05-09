import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String SortedString(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);

        String res = new String(arr);
        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> m = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String copy = strs[i];
            String res = SortedString(copy);

            if (m.containsKey(res)) {
                m.get(res).add(strs[i]);
            } else {
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                m.put(res, new ArrayList<>(arr));
            }
        }

        for (String key : m.keySet()) {
            List<String> currRow = m.get(key);
            ans.add(currRow);
        }

        return ans;
    }
}