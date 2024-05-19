import java.util.Arrays;

/*What is the meaning of anagrams? 
--> If two strings contain the same character but in a different order, they can be said to be anagrams.
 */
public class que4 {
    public static void checkAnagrams(String str1, String str2) {
        // Convert String into lowerCase. why? Because we don't have to check separately
        // for each string is uppercase or lowercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First we need to check - if both strings lengths are equals or not.
        if (str1.length() == str2.length()) {
            // convert into character Array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the character Array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean res = Arrays.equals(str1charArray, str2charArray);

            if (res) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        checkAnagrams(str1, str2);
    }
}