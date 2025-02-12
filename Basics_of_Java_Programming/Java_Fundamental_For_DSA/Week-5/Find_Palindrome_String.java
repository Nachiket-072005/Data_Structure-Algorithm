import java.util.Scanner;

public class Find_Palindrome_String {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        if (isPalindrome(s) == true) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        in.close();
    }
}
