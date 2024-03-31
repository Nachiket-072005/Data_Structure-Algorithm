public class Print_Sum_Of_N {
    public static int printSum(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n + printSum(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int res = printSum(n);
        System.out.println("Sum of first Natural Number is : " + res);
    }
}