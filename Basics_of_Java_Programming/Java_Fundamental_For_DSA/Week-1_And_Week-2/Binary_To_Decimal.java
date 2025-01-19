public class Binary_To_Decimal {
    public static void main(String[] args) {
        int binary = 1010;
        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            binary /= 10;
            base *= 2;
        }

        System.out.println(decimal);
    }
}
