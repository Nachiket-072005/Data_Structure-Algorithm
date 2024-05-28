public class Find_Subsets {
    public static void findSubSets(String str, int i, String ans) {
        // Base Case Condition
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Recursion
        // Yes Choice
        findSubSets(str, i + 1, ans + str.charAt(i));
        // No Choice
        findSubSets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, 0, "");
    }
}