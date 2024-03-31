public class Print_Factorial {
    public static int printFact(int n) {
        if(n >= 0) {
            if(n == 1 || n == 0) {
                return 1;
            }
            else {
                return n * printFact(n - 1);
            }
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int n = 7;
        int res = printFact(n);
        System.out.println("Factorial is : " + res);
    }
}