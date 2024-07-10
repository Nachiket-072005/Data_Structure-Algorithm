import java.util.Scanner;

class DemoException {
    public static void main(String[] args) {
        int balance = 5000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw : ");
        int withdraw = sc.nextInt();
        try {
            if(balance - withdraw < 1000) {
                throw new Exception("Balance must be greater than 1000");
            }
            else {
                balance = balance - withdraw;
                System.out.println("Balance : " + balance);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Program is terminated!!");
            sc.close();
        }
    }
}