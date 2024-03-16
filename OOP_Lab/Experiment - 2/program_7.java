import java.util.Scanner;

public class program_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.printf("Enter the second string: ");
        String str2 = sc.nextLine();

        String commonPrefix = findCommonPrefix(str1, str2);
        System.out.printf("Largest Common Prefix: %s", commonPrefix);

        sc.close();
    }

    static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        int index = 0;
        while (index < minLength && (str1.charAt(index) == str2.charAt(index))) {
            index++;
        }

        return str1.substring(0, index);
    }
}