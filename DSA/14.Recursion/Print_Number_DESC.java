public class Print_Number_DESC {
    public static void printNum(int n) {
        if(n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNum(n);
    }
}