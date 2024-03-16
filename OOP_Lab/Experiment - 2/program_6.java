import java.util.Scanner;

public class program_6 {

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    private static int countVowels(String str) {
        int len = str.length(), vowels = 0;

        for (int i = 0; i < len; i++) {

            if (isVowel(str.charAt(i)) && str.charAt(i) != ' ') {
                vowels++;
            }
        }
        return vowels;
    }

    private static int countConsonants(String str) {
        int len = str.length(), consonants = 0;

        for (int i = 0; i < len; i++) {

            if ((!isVowel(str.charAt(i))) && str.charAt(i) != ' ') {
                consonants++;
            }
        }
        return consonants;
    }

    public static void main(String[] args) {
        String str;
        int vowels, consonants;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        str = sc.nextLine();
        vowels = countVowels(str);
        consonants = countConsonants(str);
        System.out.printf("The entered string contains %d vowels and %d consonants", vowels, consonants);
        sc.close();
    }
}