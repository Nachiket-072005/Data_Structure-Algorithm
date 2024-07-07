public class With_Loop {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally block and value of b is " + b);
            }
            b--;
        }
    }
}
