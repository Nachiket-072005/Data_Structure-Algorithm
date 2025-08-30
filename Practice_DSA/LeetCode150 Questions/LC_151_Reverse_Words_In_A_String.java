// package LeetCode150 Questions;

public class LC_151_Reverse_Words_In_A_String {
    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            str.append(words[i]);
            str.append(" ");
        }

        return str.toString().trim();
    }

    public static void main(String[] args) {
        String s = " the sky   is blue  ";

        System.out.println(reverseWords(s));
    }
}
