import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a password: ");
        password = sc.next();
        boolean isValid = isValid(password);
        if (isValid) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password");
        }
        sc.close();

    }

    private static boolean isValid(String pass) {

        if (pass.length() >= 8 && isAlnum(pass) && hasTwoDigits(pass)) {
            return true;
        }
        return false;
    }

    private static boolean isAlnum(String s) {
        boolean ans = false;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }

    private static boolean hasTwoDigits(String s) {
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
            }
        }
        return (count >= 2);
    }
}