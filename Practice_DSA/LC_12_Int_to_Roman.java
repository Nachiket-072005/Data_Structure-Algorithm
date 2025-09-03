public class LC_12_Int_to_Roman {

    public static String intToRoman(int num) {
        String roman = "";
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLetter = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman = roman + romanLetter[i];
                num -= values[i];
            }

        }
        return roman;
    }

    public static void main(String[] args) {

    }
}
