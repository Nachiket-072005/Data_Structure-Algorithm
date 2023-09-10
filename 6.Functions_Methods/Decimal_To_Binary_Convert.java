
public class Decimal_To_Binary_Convert {

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binary = 0;

        while(n > 0) {
            int rem = n%2;
            binary = binary + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }

        System.out.println("Binary of " + myNum + " is = " + binary);
    } 
    public static void main(String args[]) {
        decToBin(7);
    }
}
