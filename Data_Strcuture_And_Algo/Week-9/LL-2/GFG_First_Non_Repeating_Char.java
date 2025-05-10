class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        HashMap<Character, Integer> m = new HashMap<>();

        // Count occurrences
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }

        return '$'; // Return '$' if no non-repeating character found
    }
}
