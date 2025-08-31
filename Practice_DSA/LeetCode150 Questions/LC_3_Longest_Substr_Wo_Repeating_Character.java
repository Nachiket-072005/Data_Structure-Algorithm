import java.util.ArrayList;
import java.util.List;

public class LC_3_Longest_Substr_Wo_Repeating_Character {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int start = 0;
        int end = 0;
        int max_len = 0;

        List<Character> list = new ArrayList<>();

        while (end < n) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;

                max_len = Math.max(list.size(), max_len);
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

        }
        return max_len;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(str));
    }
}