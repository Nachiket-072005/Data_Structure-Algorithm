import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

class CustomException {
    static int balance = 5000;

    public static void withdraw(int amount) throws Exception {
        int newBalance = balance - amount;
        if (newBalance < 1000) {
            throw new MyException("Balance Must Be Greater than 1000");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            withdraw(amount);
        } catch (Exception e) {
            System.out.println("Caught an Exception!");
            System.out.println(e.getMessage());
        }
    }
}