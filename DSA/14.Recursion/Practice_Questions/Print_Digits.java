public class Print_Digits {
    public static void printDigit(int number) {
        String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (number == 0) {
            return;
        }

        int lastDigit = number % 10;
        printDigit(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        printDigit(1497);
        System.out.println();
    }
}