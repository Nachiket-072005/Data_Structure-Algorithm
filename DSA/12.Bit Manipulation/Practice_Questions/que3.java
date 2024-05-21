public class que3 {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x + "+" + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + "+" + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + "+" + 1 + " is " + -~x);
        /*
         * We know that to get negative number, invert its bits and add 1 to
         * it.(Remember negative number are stored in 2's complement form)
         * -x = ~x + 1;
         * -~x = x + 1;
         */
    }
}