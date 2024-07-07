public class Finally_Block {
    public static int calcSum() {
        try {
            int a = 45;
            int b = 3;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Cleaning up all resources....and This is end of this program...");
        }
        return 0;
    }

    public static void main(String[] args) {
        int res = calcSum();
        System.out.println(res);
    }
}