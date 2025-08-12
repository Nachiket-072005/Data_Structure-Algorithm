public class Swap_Two_Number_W_Third_Number {
    public static void main(String[] args) {
        int a = 3, b = 4;

        System.out.println("Before swap : a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap : a = " + a + " b = " + b);
    }
}
