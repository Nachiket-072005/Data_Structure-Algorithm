public class String_Compare {
    public static void main(String[] args) {
        // Below these two strings are pointing to the same address.
        String s1 = "Tony";
        String s2 = "Tony";
        // This will create new strings that's why this will not be equals.
        String s3 = new String("Tony");

        // That's why this will give an equal strings for s1 and s2 but for, s1 and s3
        // will not give an equal strings.
        if (s1 == s2) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        if (s1 == s3) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        // This function compares values in that strings.
        if (s1.equals(s3)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}