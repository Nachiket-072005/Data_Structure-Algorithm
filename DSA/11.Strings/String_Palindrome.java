public class String_Palindrome {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        boolean res = isPalindrome(str);
        if(res == true) {
            System.out.println("String is palindrome.");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}