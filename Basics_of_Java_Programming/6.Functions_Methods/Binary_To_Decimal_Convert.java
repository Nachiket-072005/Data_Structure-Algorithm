public class Binary_To_Decimal_Convert {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decimal = 0;
        int pow = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of " + myNum + " is" + " = " + decimal);
    }
    public static void main(String args[]) {
        binToDec(1010);
    }
}