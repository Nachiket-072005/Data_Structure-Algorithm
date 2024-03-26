public class check_Power_Of_Two {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}