public class Try_With_Finally {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            System.out.println(a / b);
        } finally {
            System.out.println("Yes, I am finally block!");
        }
    }
}