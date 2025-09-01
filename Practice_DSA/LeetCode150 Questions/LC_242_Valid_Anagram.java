public class LC_242_Valid_Anagram {
    public static boolean validAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] count = new int[26];

        if (n != m) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                count[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < m; i++) {
                count[s.charAt(i) - 'a']--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(validAnagram(s, t));
    }
}
