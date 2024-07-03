public class Try_Catch_Block {
    public static void main(String[] args) {
        int a = 5000;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("We failed to divide. REASON: ");
            System.out.println(e);
        }
        System.out.println("End Of Program!!");
    }
}